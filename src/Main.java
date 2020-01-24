import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int size = 10;
        List<Integer> suite = new ArrayList<>(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            suite.add(i, rand.nextInt(50));
        }

//        BubbleSort<Integer> bubble = new BubbleSort<>(suite);
//        System.out.println(suite);
//        bubble.sort();
//        System.out.println(suite);


        FusionSort<Integer> fusion = new FusionSort<>(suite);
        System.out.println(suite);
        fusion.sort(suite);
        System.out.println(suite);
    }
}
