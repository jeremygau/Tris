import java.util.ArrayList;
import java.util.List;

public abstract class Sort<E extends Comparable<E>>{

    protected List<E> suite;

    public Sort(List<E> suite) {
        this.suite = duplicate(suite);
    }

    public abstract List<E> sort();

    public List<E> duplicate(List<E> source) {
        List<E> target = new ArrayList<>(source.size());
        target.addAll(source);
        return target;
    }

    public void swap(List<E> suite, int j, int j2) {
        E tmp = suite.get(j);
        suite.set(j, suite.get(j2));
        suite.set(j2, tmp);
    }
}
