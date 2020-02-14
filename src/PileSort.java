import java.util.List;

public class PileSort<E extends Comparable<E>> extends Sort<E> {

    public PileSort(List<E> suite) {
        super(suite);
    }

    private void tamiser(List<E> arbre, int noeud, int size) {
        int noeudTemp = noeud;
        int child = 2 * noeudTemp;

        while (child <= size) {
            if ((child < size) && (arbre.get(child).compareTo(arbre.get(child+1)) < 0))
                child++;

            if (arbre.get(noeudTemp).compareTo(arbre.get(child)) < 0){
                swap(arbre, noeudTemp, child);
                noeudTemp = child;
                child = 2 * noeudTemp;
            }
            else
                break;
        }
    }

    public List<E> sort(){
        for (int i = suite.size()/2; i >= 0; i--)
            tamiser(suite, i, suite.size() - 1);

        for (int i = suite.size() - 1; i >= 1; i--) {
            swap(suite, i, 0);
            tamiser(suite, 0, i - 1);
        }
        return suite;
    }
}
