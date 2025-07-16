package ru.academits.java;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Для рассчёта среднего арифметического чисел диапазона " +
                "ведите первое число диапазона:");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число диапазона:");
        int lastNumber = scanner.nextInt();

        int i = firstNumber;

        while (i >= lastNumber) {
            System.out.println("Второе число должно быть больше " + i + ". Введите повторно:");
            lastNumber = scanner.nextInt();
        }

        int allNumbersCount = 0;
        int allNumbersSum = 0;

        while (i <= lastNumber) {
            allNumbersSum += i;
            ++allNumbersCount;
            ++i;
        }

        double allNumbersAverage = (double) allNumbersSum / allNumbersCount;
        System.out.println("Среднее арифметическое всех чисел = " + allNumbersAverage);

        System.out.println("Для рассчёта среднего арифметического четных чисел диапазона " +
                "ведите первое число диапазона:");
        int firstNumber2 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int lastNumber2 = scanner.nextInt();

        int j = firstNumber2;

        while (j >= lastNumber2) {
            System.out.println("Второе число должно быть больше " + j + ". Введите повторно:");
            lastNumber2 = scanner.nextInt();
        }

        int evenNumbersCount = 0;
        int evenNumbersSum = 0;

        while (j <= lastNumber) {
            if (j % 2 == 0) {
                evenNumbersSum += j;
                ++evenNumbersCount;
            }

            ++j;
        }

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Среднее арифметическое четных чисел = " + evenNumbersAverage);
    }
}
