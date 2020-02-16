import java.util.*;

public class Main {

    public static void main(String[] args) {
        int size = 1000;
        Solver<Integer> solver = new Solver<>(size, "int");
        solver.solve();
    }

    public static void testCountingSort() {
        List<Integer> list = new ArrayList<>();
        list.add(0); list.add(2); list.add(0); list.add(1); list.add(2);
        list.add(1); list.add(0); list.add(2); list.add(1); list.add(1);

        CountingSort<Integer> countingSort = new CountingSort<>(list);
        System.out.println(countingSort.counting(list));
    }

    public static void testDenombSort() {
        int[] tab = {0,2,0,1,2,1,0,2,1,1};
        System.out.println(printTAb(tab));
        DenombSort denombSort = new DenombSort(tab, 3);
        System.out.println(printTAb(denombSort.sort()));
    }

    public static String printTAb(int[] t) {
        StringBuilder s = new StringBuilder("[");
        for (int value : t) {
            s.append(value).append(",");
        }
        s.deleteCharAt(s.length()-1);
        s.append("]");
        return s.toString();
    }
}
