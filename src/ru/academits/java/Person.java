package ru.academits.java;

import java.time.Year;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public static final int MIN_AGE = 15;

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    //для неместных
    public Person(String name, String familyName, int age) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.isEmpty())) {
            this.name = name;
            System.out.println("Имя было изменено");
        } else {
            System.out.println("Имя не было изменено. Передано пустое имя.");
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (!(name.isEmpty())) {
            this.middleName = middleName;
            System.out.println("Отчество было изменено");
        } else {
            System.out.println("Отчество не было изменено. Передано пустое отчество.");
        }
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if (!(name.isEmpty())) {
            this.familyName = familyName;
            System.out.println("Фамилия была изменена");
        } else {
            System.out.println("Фамилия не была изменена. Передана пустая фамилия.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= MIN_AGE) {
            this.age = age;
            System.out.println("Возраст был изменен");
        } else {
            System.out.println("Возраст не подходит для записи");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                '}';
    }

    public void printName() {
        System.out.println("Имя = " + name);
    }

    public void printMiddleName() {
        System.out.println("Отчество = " + middleName);
    }

    public void printFamilyName() {
        System.out.println("Фамилия = " + familyName);
    }

    public int getBirthYear() {
        return  Year.now().getValue() - age;
    }
}
