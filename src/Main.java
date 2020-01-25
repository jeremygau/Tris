import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int size = 4;
        List<Integer> suite = new ArrayList<>(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            suite.add(i, rand.nextInt(10));
        }

//        suite.add(10);
//        suite.add(82);
//        suite.add(9);
//        suite.add(3);
//        suite.add(43);
//        suite.add(27);
//        suite.add(38);

        System.out.println(suite);

        BubbleSort<Integer> bubble = new BubbleSort<>();
        System.out.println(bubble.sort(suite));

        FusionSort<Integer> fusion = new FusionSort<>();
        System.out.println(fusion.sort(suite));

        QuickSort<Integer> quickSort = new QuickSort<>();
        System.out.println(quickSort.sort(suite));
    }
}
