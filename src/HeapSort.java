import java.util.ArrayList;
import java.util.List;

public class HeapSort<E extends Comparable<E>> extends SwapSort<E> implements Sort<E> {

    @Override
    public List<E> sort(List<E> s) {
        List<E> heap = new ArrayList<>(s.size());
        for (E element : s) {
            add(heap, element);
        }
        s.clear();
        int i = heap.size()-1;
        while (i >=0) {
            swap(heap, i, 0);
            s.add(heap.remove(i));
            tamiser(heap);
            i--;
        }
        return s;
    }

    public void tamiser(List<E> suite) {
        int index = 0;
        while (index < suite.size() && suite.get(index).compareTo(suite.get(getMinChild(suite, index))) > 0) {
            swap(suite, getMinChild(suite, index), index);
            index = getMinChild(suite, index);
        }
    }

    public int getMinChild(List<E> heap, int index) {
        if (hasLeftChild(heap, index)) {
            int leftChild = index * 2 + 1;
            if (hasRightChild(heap, index)) {
                int rightChild = index * 2 + 2;
                if (heap.get(leftChild).compareTo(heap.get(rightChild)) > 0) {
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

    public void add(List<E> heap, E element) {
        heap.add(element);
        int index = heap.lastIndexOf(element);
        while (index != 0 && heap.get((index - 1) / 2).compareTo(heap.get(index)) > 0) {
            swap(heap, (index - 1) / 2, index);
            index = (index - 1) / 2;
        }
    }
}
