package ru.academits.java;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String a = scanner.nextLine();

        //Первый вариант
//        if(a.length() > 0) {
//            System.out.println("Привет, " + a + "!");
//        }
//        else {
//            System.out.println("Привет, неизвестный!");
//        }

        //Второй вариант
        if(a.isEmpty()){
            System.out.println("Привет, неизвестный!");
        }
        else {
            System.out.println("Привет, " + a + "!");
        }
    }

}
