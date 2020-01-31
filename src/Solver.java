import java.util.*;

public class Solver<E extends Comparable<E>> {

    private List<E> myList;
    private List<Sort<E>> sorts = new ArrayList<>();
    int size;
    String type;

    public Solver(int size, String type) {
        this.type = type;
        this.size = size;
        this.myList = new ArrayList<>(size);
    }

    public void fillListInt() {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            Integer r = rand.nextInt(255);
            myList.add(i, (E) r);
        }
    }

    public void fillListChar() {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            Character r = (char) (rand.nextInt(122 + 97) + 97);
            myList.add(i, (E) r);
        }
    }

    public void fillListString() {
        Random rand = new Random();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < rand.nextInt(5); j++) {
                Character r = (char) (rand.nextInt(122 + 97) - 97);
                string.append(string.toString()).append(r);
            }
            myList.add(i, (E) string.toString());
            string = new StringBuilder();
        }
    }

    public void solve() {
        if (type.equals("int")) {
            fillListInt();
        }
        else if (type.equals("char")) {
            fillListChar();
        }
        else if (type.equals("string")) {
            fillListString();
        }
        System.out.println("Taille de la liste : " + myList.size() + "\n");
        System.out.println("Suite à trier : " + myList + "\n");
        sorts.add(new BubbleSort<>(myList));
        sorts.add(new FusionSort<>(myList));
        sorts.add(new QuickSort<>(myList));
        sorts.add(new PileSort<>(myList));
        sorts.add(new HeapSort<>(myList));
        for (Sort<E> sort : sorts) {
            System.out.println(sort.getClass().getName());
            System.out.println("suite non triée : " + sort.getSuite());
            long startTime = System.currentTimeMillis();
            System.out.println("suite triée \t \t" + sort.sort());// tri avec affichage
            System.out.println("temps d'execution = " + (System.currentTimeMillis() - startTime) + " ms\n");
        }
    }
}
