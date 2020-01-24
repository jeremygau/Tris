import java.util.ArrayList;
import java.util.List;

public class FusionSort<E extends Comparable<E>> {

    private List<E> suite;

    public FusionSort(List<E> suite) {
        this.suite = suite;
    }

    public List<E> sort(List<E> s) {
        if (s.size() > 1) {
            List<E> s1 = subList(s, 0, s.size() / 2);
            List<E> s2 = subList(s, s.size() / 2, s.size());
//            System.out.println("s1 = " + s1);
//            System.out.println("s2 = " + s2);
            s1 = sort(s1);
            s2 = sort(s2);
            fusion(s1, s2);
//            System.out.println("s = " + s);
        }
        return s;
    }

    public List<E> subList (List<E> list, int start, int end) {
        List<E> subList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            subList.add(list.get(i));
        }
        return subList;
    }

    public List<E> fusion (List<E> a, List<E> b) {
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }
        List<E> s = new ArrayList<>();
        if (a.get(0).compareTo(b.get(0)) >= 0) {
            s.add(b.get(0));
            b.remove(0);
        } else {
            s.add(a.get(0));
            a.remove(0);
        }
        s.addAll(fusion(a, b));
        System.out.println("s " + s);
        return s;
    }

    public List<E> getSuite() {
        return suite;
    }
}
