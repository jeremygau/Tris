import java.util.ArrayList;
import java.util.List;

public class HeapSort<E extends Comparable<E>> extends Sort<E>{

    public HeapSort(List<E> suite) {
        super(suite);
    }

    @Override
    public List<E> sort() {
        List<E> heap = new ArrayList<>(suite.size());
        for (E element : suite) {
            add(heap, element);
        }
//        System.out.println(heap);
        suite.clear();
        int i = heap.size()-1;
        while (i >=0) {
            swap(heap, i, 0);
//            System.out.println("avant : " + heap);
            suite.add(heap.remove(i));
            tamiser(heap);
//            System.out.println("heap :  " + heap);
            i--;
        }
        return suite;
    }


    public void tamiser(List<E> suite) {
        int index = 0;
        while (index != suite.size() && suite.get(index).compareTo(suite.get(getMinChild(suite, index))) > 0) {
            int temp = index;
            index = getMinChild(suite, temp);
            swap(suite, getMinChild(suite, temp), temp);
            int a = getMinChild(suite, index);
        }
    }

    public int getMinChild(List<E> heap, int index) {
        if (hasLeftChild(heap, index)) {
            int leftChild = index * 2 + 1;
            if (hasRightChild(heap, index)) {
                int rightChild = index * 2 + 2;
                if (heap.get(leftChild).compareTo(heap.get(rightChild)) >= 0) {
                    return rightChild;
                }
            }
            return leftChild;
        }
        return index;
    }

    public boolean hasLeftChild(List<E> heap, int index) {
        return  (index * 2 + 1 < heap.size());
    }

    public boolean hasRightChild(List<E> heap, int index) {
        return  (index * 2 + 2 < heap.size());
    }

    public int childrenNumber(List<E> heap, int index) {
        if (index * 2 + 1 >= heap.size()) {
            return 0;
        }
        if (index * 2 + 2 >= heap.size()) {
            return 1;
        }
        return 2;
    }

    public void add(List<E> heap, E element) {
        heap.add(element);
        int index = heap.lastIndexOf(element);
        while (index > 0 && heap.get((index - 1) / 2).compareTo(heap.get(index)) > 0) {
            swap(heap, (index - 1) / 2, index);
            index = (index - 1) / 2;
        }
    }
}
