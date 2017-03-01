package com.company;

public class Main {
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
