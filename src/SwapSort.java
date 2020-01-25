import java.util.List;

public abstract class SwapSort<E extends Comparable<E>> implements Sort<E> {

    public void swap(List<E> suite, int j, int j2) {
        E tmp = suite.get(j);
        suite.set(j, suite.get(j2));
        suite.set(j2, tmp);
    }
}
