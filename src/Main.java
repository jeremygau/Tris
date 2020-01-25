import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int size = 7;
        List<Integer> suite = new ArrayList<>(size);
//        Random rand = new Random();
//        for (int i = 0; i < size; i++) {
//            suite.add(i, rand.nextInt(50));
//        }

        suite.add(10);
        suite.add(82);
        suite.add(9);
        suite.add(3);
        suite.add(43);
        suite.add(27);
        suite.add(38);




//        BubbleSort<Integer> bubble = new BubbleSort<>(suite);
//        System.out.println(suite);
//        bubble.sort();
//        System.out.println(suite);


        FusionSort<Integer> fusion = new FusionSort<>(suite);
        System.out.println(suite);
        suite = fusion.sort(suite);
        System.out.println(suite);
    }
}
