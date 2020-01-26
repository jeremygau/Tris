import java.util.List;

public class PileSort<E extends Comparable<E>> extends SwapSort<E> implements Sort<E> {

    private void tamiser(List<E> arbre, int noeud, int n)
    {
        int k = noeud;
        int j = 2 * k;

        while (j <= n)
        {
            if ((j < n) && (arbre.get(j).compareTo(arbre.get(j+1)) < 0))
                j++;

            if (arbre.get(k).compareTo(arbre.get(j)) < 0){
                swap(arbre, k, j);
                k = j;
                j = 2 * k;
            }
            else
                break;
        }
    }

    public List<E> sort(List<E> suite){
        for (int i = suite.size()/2; i >= 0; i--)
            tamiser(suite, i, suite.size() - 1);

        for (int i = suite.size() - 1; i >= 1; i--)
        {
            swap(suite, i, 0);
            tamiser(suite, 0, i - 1);
        }
        return suite;
    }
}
