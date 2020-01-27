import java.util.*;

public class Main {

    public static void main(String[] args) {

        int size = 10   ; //max pour fusionSort 3126
        System.out.println("Taille de la liste : " + size + "\n");
        List<Integer> suite0 = new ArrayList<>(size);
        List<Integer> suite1 = new ArrayList<>(size);
        List<Integer> suite2 = new ArrayList<>(size);
        List<Integer> suite3 = new ArrayList<>(size);
        List<Integer> suite4 = new ArrayList<>(size);

//
//        Random rand = new Random();
//        for (int i = 0; i < size; i++) {
//            int r = rand.nextInt(20);
//            suite0.add(i, r);
//            suite1.add(i, r);
//            suite2.add(i, r);
//            suite3.add(i, r);
//            suite4.add(i, r);
//        }

        suite0.add(16);
        suite0.add(7);
        suite0.add(10);
        suite0.add(16);
        suite0.add(5);
        suite0.add(18);
        suite0.add(6);
        suite0.add(9);
        suite0.add(19);
        suite0.add(17);

//        suite0.add("c");
//        suite0.add("v");
//        suite0.add("de");
//        suite0.add("aj");
//        suite0.add("a");
//        suite0.add("bc");
//        suite0.add("bd");

        System.out.println("suite à trier : " + suite0 + "\n");

        Map<Sort<Integer>, List<Integer>> sorts = new HashMap<>();
        sorts.put(new BubbleSort<>(), suite0);
        sorts.put(new FusionSort<>(), suite1);
        sorts.put(new QuickSort<>(), suite2);
        sorts.put(new PileSort<>(), suite3);
        sorts.put(new HeapSort<>(), suite4);

//        sort(sorts);

        HeapSort<Integer> heapSort = new HeapSort<>();
        System.out.println(heapSort.sort(suite0));
    }
    public static void sort(Map<Sort<Integer>, List<Integer>> sorts) {
        for (Sort<Integer> sort : sorts.keySet()){
            System.out.println(sort.getClass().getName());
            System.out.println("suite non triée \t" + sorts.get(sort));
            long startTime = System.currentTimeMillis();
//            sort.sort(sorts.get(sort)); // tri sans affichage
            System.out.println("suite triée \t \t" + sort.sort(sorts.get(sort)));// tri avec affichage
            System.out.println("temps d'execution = " + (System.currentTimeMillis() - startTime) + " ms\n");
        }
    }
}
