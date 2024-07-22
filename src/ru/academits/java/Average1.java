package ru.academits.java;


import java.util.stream.IntStream;

public class Average1 {

    public static void main(String[] args){
        int start = 3;
        int end = 19;
        int sum = 0;
        int amount = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
            amount++;
        }

        System.out.println("Среднее арифметическое чисел равно: " + sum/amount);

        sum = 0;
        amount = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
                amount++;
            }
        }

        System.out.println("Среднее арифметическое четных чисел равно: " + sum/amount);

    }

}
