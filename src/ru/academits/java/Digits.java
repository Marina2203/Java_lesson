package ru.academits.java;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        String num = scanner.nextLine();

        int sum = calculateSumOfDigits(num);
        System.out.println("Сумма всех цифр = " + sum);

        int sumOdd = calculateSumOfOddDigits(num);
        System.out.println("Сумма нечетных цифр = " + sumOdd);

        int maxDigit = findMaxDigit(num);
        System.out.println("Максимальная цифра = " + maxDigit);
    }

    private static int calculateSumOfDigits(String num) {
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int digit = Character.getNumericValue(c);
            sum += digit;
        }

        return sum;
    }

    private static int calculateSumOfOddDigits(String num) {
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int digit = Character.getNumericValue(c);
            if (digit % 2 != 0) {
                sum += digit;
            }
        }

        return sum;
    }

    private static int findMaxDigit(String num) {
        int max = 0;

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int digit = Character.getNumericValue(c);
            if (digit >= max) {
                max = digit;
            }
        }

        return max;
    }
}
