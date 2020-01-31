import java.util.List;

public class BubbleSort<E extends Comparable<E>> extends SwapSort<E> {

    List<E> suite;

    public BubbleSort(List<E> suite) {
        this.suite = suite;
    }

    public List<E> sort() {
        for (int i = suite.size(); i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (suite.get(j).compareTo(suite.get(j + 1)) > 0) {
                    swap(suite, j, j + 1);
                }
            }
        }
        return suite;
    }
}
