package ru.academits.java;

import java.util.Scanner;

public class Main_Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        System.out.println("Введите отчество:");
        String middleName = scanner.nextLine();

        System.out.println("Введите фамилию:");
        String familyName = scanner.nextLine();

        System.out.println("Введите возраст:");
        int age = scanner.nextInt();

        Person person = new Person(name, middleName, familyName, age);

        person.printName();
        person.printMiddleName();
        person.printFamilyName();
        person.printBirthYear();
    }
}
