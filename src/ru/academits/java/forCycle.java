package ru.academits.java;

public class forCycle {
    public static void main(String[] args) {
        System.out.println("Числа, кратные четырём:");

        for (int i = 100; i > 0; i--) {
            if (isMultipleOfFour(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isMultipleOfFour(int i) {
        return i % 4 == 0;
    }
}
