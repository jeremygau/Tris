import java.util.ArrayList;
import java.util.List;

public class HeapSort<E extends Comparable<E>> extends SwapSort<E> implements Sort<E> {

    @Override
    public List<E> sort(List<E> s) {
        List<E> heap = new ArrayList<>(s.size());
        for (E element : s) {
            add(heap, element);
        }
//        System.out.println(heap);
        s.clear();
        int i = heap.size()-1;
        while (i >=0) {
            swap(heap, i, 0);
//            System.out.println("avant : " + heap);
            s.add(heap.remove(i));
            tamiser(heap);
//            System.out.println("heap :  " + heap);
            i--;
        }
        return s;
    }

    public void tamiser(List<E> suite) {
        int index = 0;
        while (index != suite.size() && suite.get(index).compareTo(suite.get(getMinChild(suite, index))) > 0) {
//            System.out.println("tami : " + suite);
            int temp = index;
            index = getMinChild(suite, temp);
            swap(suite, getMinChild(suite, temp), temp);
//            System.out.println(suite);
//            System.out.println("index" + index);
            int a = getMinChild(suite, index);
//            System.out.println("a " + a + " : "+ suite.get(a));
//            System.out.println("suite.get(index) = " + suite.get(index));
//            System.out.println((suite.get(index).compareTo(suite.get(getMinChild(suite, index))) > 0));
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
