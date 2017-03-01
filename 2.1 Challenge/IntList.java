public class IntList {

    int first;
    IntList rest;
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    public int get(int i) {
        int item = this.first;
        IntList temp = this.rest;
        while (i > 0) {
            item = temp.first;
            temp = temp.rest;
            i = i - 1;
        }
        return item;
    }

    public static void main(String[] args) {
        IntList test = new IntList(40, null);
        test = new IntList(30, test);
        test = new IntList(20, test);
        test = new IntList(10, test);
        test = new IntList(0, test);
        System.out.println(test.get(2));
        System.out.println(test.size());
    }
}
