import java.util.ArrayList;
import java.util.List;

public class HeapSort<E extends Comparable<E>> extends Sort<E>{

    public HeapSort(List<E> suite) {
        super(suite);
    }

    @Override
    public List<E> sort() {
        List<E> heap = new ArrayList<>(suite.size());
        for (E element : suite) { // on ajoute tous les element de la liste
            add(heap, element);   // dans le tas de facon triée en tas
        }
        suite.clear(); // on vide la liste
        int lastIndex = heap.size() - 1;
        while (lastIndex >= 0) {
            swap(heap, lastIndex, 0); // on echange le dernier du tas avec le premier
            suite.add(heap.remove(lastIndex)); // on retire le dernier du tas et on le mets dans la liste
            tamiser(heap); // on tamise le tas
            lastIndex--; // on diminue l'index du dernier element du tas
        }
        return suite;
    }


    public void tamiser(List<E> suite) {
        int index = 0;
        while (index != suite.size() && suite.get(index).compareTo(suite.get(getMinChild(suite, index))) > 0) { // tant qu'on est pas a la fin du tas et que le noeud courant est superieur au plus petit fils
            int temp = index; // on sauvegarde l'index ou on est
            index = getMinChild(suite, temp); // l'index devient son plus petit fils
            swap(suite, getMinChild(suite, temp), temp); // on echange le pere et le fils
        }
    }

    public int getMinChild(List<E> heap, int index) {
        if (hasLeftChild(heap, index)) {
            int leftChild = index * 2 + 1;
            if (hasRightChild(heap, index)) {
                int rightChild = index * 2 + 2;
                if (heap.get(leftChild).compareTo(heap.get(rightChild)) >= 0) {
                    return rightChild;
                }
            }
            return leftChild;
        }
        return index;
    }

    public boolean hasLeftChild(List<E> heap, int index) {
        return  (index * 2 + 1 < heap.size());
    }

    public boolean hasRightChild(List<E> heap, int index) {
        return  (index * 2 + 2 < heap.size());
    }

    public void add(List<E> heap, E element) {
        heap.add(element);
        int index = heap.size()-1; // on recupere l'index de notre élément
        while (index > 0 && heap.get((index - 1) / 2).compareTo(heap.get(index)) > 0) { // tant qu'on est pas à la racine et que le pere est superieur au noeud
            swap(heap, (index - 1) / 2, index); // on echange le pere et le fils
            index = (index - 1) / 2; // le noeud change d'index
        }
    }
}
