package com.ua.robot.homework10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Програма створення та обробки масиву з випадкових чисел");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину масиву: ");
        int length = scanner.nextInt();
        while (length <= 0) {
            System.out.print("Введіть довжину масиву більше за 0: ");
            length = scanner.nextInt();
        }

        System.out.print("Введіть максимальне значення елементу масиву: ");
        int maxRandomValue = scanner.nextInt();
        while (maxRandomValue <= 0) {
            System.out.print("Введіть максимальне значення елементу масиву більше за 0: ");
            maxRandomValue = scanner.nextInt();
        }

        int[] arr = new int[length];
        Array array1 = new Array(arr, maxRandomValue);
        System.out.println(array1);

        System.out.println("\nПрограма обробки визначеного масиву");
        Array array2 = new Array(new int[]{10, 20, 4, 5, 99, 1, 56, 78});
        System.out.print("Заданий масив: ");
        array2.printArray();

        array2.ascendingSort();
        System.out.print("Відсортований масив за зростанням: ");
        array2.printArray();

        array2.descendingSort();
        System.out.print("Відсортований масив за зменшенням: ");
        array2.printArray();
    }
}
