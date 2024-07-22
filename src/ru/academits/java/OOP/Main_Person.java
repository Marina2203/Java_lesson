package ru.academits.java.OOP;

public class Main_Person {

    public static void main(String[] args) {

        String name = "Ivan";
        String middleName = "Ivanovich";
        String familyName = "Ivanov";
        int age = 22;

        Person person = new Person(name, middleName, familyName, age);
        System.out.println("Первоначальное имя = " + person.getName());
        person.setName("Petr");
        System.out.println(person);
    }
}
