import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(27);
        list.add(3);
        list.add(1);
        list.add(3);
        CountingSort<Integer> countingSort = new CountingSort<>(list);
        System.out.println(countingSort.counting(list));

//        int size = 5_000_000;//max pour fusionSort 3126
//        Solver<Integer> solver = new Solver<>(size, "int");
//        solver.solve();
    }
}
