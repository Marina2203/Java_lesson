package ru.academits.java;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a;

        do {
            System.out.println("Введите ваше имя:");
            a = scanner.nextLine();
        }
        while (a.isEmpty());

        System.out.println("Привет, " + a + "!");
    }
}
