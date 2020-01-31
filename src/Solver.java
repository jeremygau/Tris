import java.util.*;

public class Solver<E extends Comparable<E>> {

    private List<E> myList;
    private List<Sort<E>> sorts = new ArrayList<>();
    int size;

    public Solver(int size) {
        this.size = size;
        this.myList = new ArrayList<>(size);
    }

    public void fillListWithInt() {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            Integer r = rand.nextInt(20);
            myList.add(i, (E) r);
        }
    }



    public void solve() {
        fillListWithInt();
        System.out.println("Taille de la liste : " + myList.size() + "\n");
        System.out.println("Suite à trier : " + myList + "\n");
        sorts.add(new BubbleSort<>(myList));
        sorts.add(new FusionSort<>(myList));
        sorts.add(new QuickSort<>(myList));
        sorts.add(new PileSort<>(myList));
        sorts.add(new HeapSort<>(myList));
        for (Sort<E> sort : sorts) {
            System.out.println(sort.getClass().getName());
            long startTime = System.currentTimeMillis();
            System.out.println("suite triée \t \t" + sort.sort());// tri avec affichage
            System.out.println("temps d'execution = " + (System.currentTimeMillis() - startTime) + " ms\n");
        }
    }
}
