package ru.academits.java;

import java.util.stream.IntStream;

public class Averege2 {

    public static void main(String[] args) {
        int start = 3;
        int end = 19;

        IntStream.rangeClosed(start, end)
                .average()
                .ifPresent(avg -> System.out.println("Среднее арифметическое чисел равно: " + avg));

        IntStream.rangeClosed(start, end)
                .filter(i -> i % 2 == 0)
                .average()
                .ifPresent(avg -> System.out.println("Среднее арифметическое четных чисел равно: " + avg));

    }
}
