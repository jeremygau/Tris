import java.util.List;

public class QuickSort<E extends Comparable<E>> extends SwapSort<E> {

    List<E> suite;

    public QuickSort(List<E> suite) {
        this.suite = suite;
    }

    public List<E> sort() {
        return sortAux(this.suite, 0, suite.size()-1);
    }

    public List<E> sortAux(List<E> suite, int start, int end) {
        if (start < end) {
            int pivot = partition(suite, start, end);
            sortAux(suite, start, pivot-1);
            sortAux(suite, pivot+1, end);
        }
        return suite;
    }

    public int partition (List<E> suite, int start, int end) {
        E pivot = suite.get(start);
        int d = start + 1;
        int f = end;
        while (d < f) {
            while(d < f && suite.get(f).compareTo(pivot) >= 0) f--;
            while(d < f && suite.get(d).compareTo(pivot) <= 0) d++;
            swap(suite, d, f);
        }
        if (suite.get(d).compareTo(pivot) > 0) d--;
        suite.set(start, suite.get(d));
        suite.set(d, pivot);
        return d;
    }

}
