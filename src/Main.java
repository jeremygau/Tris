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

//        BubbleSort<Integer> bubble = new BubbleSort<>(suite);
//        bubble.sort();
//        System.out.println(suite);

//        FusionSort<Integer> fusion = new FusionSort<>();
//        suite = fusion.sort(suite);
//        System.out.println(suite);

        QuickSort<Integer> quickSort = new QuickSort<>();
        quickSort.quicksort(suite, 0, suite.size()-1);
        System.out.println(suite);
    }
}
