package com.ua.robot.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Homework 5
        System.out.println("Програма порівняння двох чисел та їх перевірки на парність (якщо число дробове, напишіть його через ',')");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число : ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введіть друге число: ");
        double secondNumber = scanner.nextDouble();
        //Частина 1 - яке число більше
        int result;
        if (firstNumber > secondNumber) {
            result = 1;
            System.out.print("Результат: Перше число більше другого");
        } else if (secondNumber > firstNumber) {
            result = 2;
            System.out.print("Результат: Друге число більше першого");
        } else {
            result = 3;
            System.out.print("Результат: Числа рівні");
        }
        //Частина 2 - яке число менше
        switch(result) {
            case 1:
                System.out.print(", а друге менше першого.");
                break;
            case 2:
                System.out.print(", а перше менше другого.");
                break;
            case 3:
                System.out.print(", рівні як не крути.");
                break;
        }
        //Частина 3 - перевірка на парність
        if (firstNumber % 2 == 0 && secondNumber % 2 == 0) {
            System.out.print(" Крім того обидва числа парні");
        } else if (firstNumber % 2 != 0 && secondNumber % 2 != 0) {
            System.out.print(" Крім того обидва числа не парні");
        } else if (firstNumber % 2 == 0 && secondNumber % 2 != 0) {
            System.out.print(" Крім того перше число парне, а друге - ні");
        } else {
            System.out.print(" Крім того друге число парне, а перше - ні");
        }
    }
}
