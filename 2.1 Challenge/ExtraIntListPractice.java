public class ExtraIntListPractice {
    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntList incrList(IntList L, int x) {
        int i = L.size();
        IntList Q = new IntList(L.get(i - 1) + x,null);
        while (i > 0) {
            Q = new IntList(L.get(i - 1) + x, Q);;
            i = i - 1;
        }

        return Q;
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        int i = L.size();
        IntList Q = L;
        while (i > 0) {
            Q.first = Q.first + x;
            Q = Q.rest;
            i = i - 1;
        }
        return L;
    }
}
