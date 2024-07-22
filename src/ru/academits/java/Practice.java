package ru.academits.java;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String a = scanner.nextLine();

        System.out.println("Привет, " + a + "!");
    }
}
