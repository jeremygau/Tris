import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int size = 30;
        List<Integer> suite = new ArrayList<>(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            suite.add(i, rand.nextInt(100));
        }

        System.out.println(suite);

        List<Sort<Integer>> sorts = new ArrayList<>();
        sorts.add(new BubbleSort<>());
        sorts.add(new FusionSort<>());
        sorts.add(new QuickSort<>());

        for (Sort<Integer> sort : sorts) {
            System.out.println(sort.getClass().getName());
            System.out.println(sort.sort(suite));
        }
    }
}
