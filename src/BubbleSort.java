import java.util.List;

public class BubbleSort<E extends Comparable<E>> extends SwapSort<E> {

    public List<E> sort(List<E> suite) {
        for (int i = suite.size(); i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (suite.get(j).compareTo(suite.get(j + 1)) > 0) {
                    swap(suite, j, j + 1);
                }
            }
        }
        return suite;
    }

    public void swap(List<E> suite, int j, int j2) {
        E tmp = suite.get(j);
        suite.set(j, suite.get(j2));
        suite.set(j2, tmp);
    }
}
