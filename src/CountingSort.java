//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class CountingSort<E extends Comparable<E>> extends Sort<E> {
//
//    public CountingSort(List<E> suite) {
//        super(suite);
//    }
//
//    @Override
//    public List<E> sort() {
//        return sortAux(this.suite, 9);
//    }
//
//    public List<E> sortAux(List<Integer> suite, int borne) {
//        List<Integer> comptage = new ArrayList<>(borne + 1);
//        int suiteSize = suite.size() - 1;
//        int x = 0;
//
//        for (int i = 0; i < borne; i++) {
//            comptage.add(i, 0);
//        }
//
//        for (int i = 0; i < suiteSize; i++) {
//            comptage.set(suite.get(i), suite.get(i) + 1);
//        }
//
//        for (int i = 0; i < borne; i++) {
//            for (int j = 0; j < comptage.get(i) - 1; j++) {
//                suite.
//            }
//        }
//    }
//
////    public Map<E, Integer> counting(List<E> list, int base) {
////        Map<E, Integer> nb = new HashMap<>();
////
////        for (E element : list) {
////            if (nb.containsKey(element)) {
////                nb.put(element, 1);
////            }
////            else {
////
////            }
////        }
////    }
//
//}
