import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingSort<E extends Comparable<E>> extends Sort<E> {

    public CountingSort(List<E> suite) {
        super(suite);
    }

    @Override
    public List<E> sort() {
        return null;
    }

//
//    @Override
//    public List<E> sort() {
//        return sortAux(this.suite);
//    }

//    public List<E> sortAux(List<Integer> suite, int borne) {
//        List<E> R = new ArrayList<>();
//        List<Integer> comptage = new ArrayList<>();
//        List<Integer> pos = new ArrayList<>();
//
//        int suiteSize = suite.size();
//        int x = 0;
//
//        for (int i = 0; i < borne; i++) {
//            comptage.add(i, 0);
//        }
//
//        for (int i = 1; i < suiteSize; i++) {
//            comptage.set(suite.get(i), comptage.get(suite.get(i)) + 1);
//        }
//        pos.add(0);
//        for (int i = 1; i < borne; i++) {
//            pos.set(i, pos.get(i - 1) + comptage.get(i - 1));
//        }
//        for (int i = 1; i < suiteSize; i++) {
//            R.set(pos.get(suite.get(i)), suite.get(i));
//            pos.set(suite.get(i), pos.get(suite.get(i) + 1));
//        }
//        return R;
//    }

    public Map<E, Integer> counting(List<E> list) {
        Map<E, Integer> nb = new HashMap<>();

        for (E element : list) {
            if (!nb.containsKey(element)) {
                nb.put(element, 1);
            } else {
                nb.replace(element, nb.get(element) + 1);
            }
        }

        return nb;
    }
}