package com.company;

public class IntList {

    public int first;
    public IntList rest;
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
}
