import java.util.List;
import java.util.Random;

public class QuickSort<E extends Comparable<E>> {

    public void quicksort(List<E> suite, int start, int end) {
        if (start < end) {
            int pivot = partition(suite, start, end);
            quicksort(suite, start, pivot-1);
            quicksort(suite, pivot+1, end);
        }
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

    public void swap(List<E> suite, int j, int j2) {
        E tmp = suite.get(j);
        suite.set(j, suite.get(j2));
        suite.set(j2, tmp);
    }

}
