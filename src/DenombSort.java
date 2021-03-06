public class DenombSort {

    private int[] T;
    private int base;

    public DenombSort(int[] T, int base) {
        this.T = T;
        this.base = base;
    }

    public int[] sort() {
        int[] R = new int[T.length];
        int[] nb = counting(T);
        int[] pos = position(nb);

        for (int i = 1; i < T.length; i++) {
            R[pos[T[i]]] = T[i];
            pos[T[i]] = pos[T[i]] + 1;
        }
        return R;
    }

    public int[] position(int[] nb) {
        int[] pos = new int[base];
        pos[0] = 0;
        for (int i = 1; i < base; i++) {
            pos[i] = pos[i-1] + nb[i-1];
        }
        return pos;
    }

    public int[] counting(int[] list) {
        int[] nb = new int[base];
        for (Integer element : list) {
            nb[element] ++;
        }
        return nb;
    }
}
