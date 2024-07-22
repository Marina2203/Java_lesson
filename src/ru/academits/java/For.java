package ru.academits.java;

public class For {

    public static void main(String[] args) {
        int start = 100;
        int end = 1;

        for (int i = start; i >= end; i--) {
            if (isDivisibleBy4(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isDivisibleBy4(int i) {
        return i % 4 == 0;
    }
}
