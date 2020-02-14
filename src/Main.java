import java.util.*;

public class Main {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(2);
//        list.add(0);
//        list.add(1);
//        list.add(2);
//        list.add(1);
//        list.add(0);
//        list.add(2);
//        list.add(1);
//        list.add(1);

//        int[] list = {0,2,0,1,2,1,0,2,1,1};
////        CountingSort<Integer> countingSort = new CountingSort<>(list);
////        System.out.println(countingSort.counting(list));
//        DenombSort denombSort = new DenombSort(list, 3);
//        System.out.println(disp(denombSort.sort()));

//        int[] a = denombSort.counting(list);
//        System.out.println(disp(a));
//        int[] b = denombSort.position(a);
//        System.out.println(disp(b));

        int size = 1000;
        Solver<String> solver = new Solver<>(size, "string");
        solver.solve();
    }
    public static String disp(int[] t) {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < t.length; i++) {
            s.append(t[i]).append(",");
        }
        s.deleteCharAt(s.length()-1);
        s.append("]");
        return s.toString();
    }
}
