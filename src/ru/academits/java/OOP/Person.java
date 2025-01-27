package ru.academits.java.OOP;

import java.util.Calendar;
import java.util.Date;

public class Person {

    private String name;
    private String middleName;
    private String familyName;
    private int age;


    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;

    }

    public int getYearOfBirth() {
        return Calendar.getInstance().get(Calendar.YEAR) - age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
            System.out.println("Имя было изменено на " + name);
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                ", year of birth=" + getYearOfBirth() +
                '}';
    }
}
