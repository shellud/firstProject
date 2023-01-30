package com.ua.robot.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Homework 7
        // Cube number
        System.out.println("Програма зведення числа в третій ступінь");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        double number = scanner.nextDouble();
        System.out.println("Результат зведення числа " + number + " в третьому ступені дорівнює: " + cubeNumber(number) + "\n");

        //Print stars
        System.out.println("Програма виведення зірочок");
        System.out.print("Введіть кількість зірочок: ");
        int starsNumber = scanner.nextInt();
        printSymbols(starsNumber);

        //Print signs
        System.out.println("Програма виведення символів");
        System.out.print("Введіть кількість символів: ");
        int symbolsNumber = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введіть символ: ");
        String input;
        while((input = scanner1.nextLine()).length() != 1) {
            System.out.print("Ви ввели не один символ, введіть ОДИН символ: ");
        }
        char symbol = input.charAt(0);
        printSymbols(symbolsNumber, symbol);
    }

    // Method cube number
    static double cubeNumber(double x) {
        return Math.pow(x, 3.0);
    }

    //Method print stars which overloads method print signs
    static void printSymbols(int a) {
        printSymbols(a, '*');
    }

    //Method print signs
    static void printSymbols(int signsNumber, char sign) {
        StringBuilder symbols = new StringBuilder();
        if (sign == '*') {
            System.out.print("Тримайте зірочки: ");
        } else {
            System.out.print("Тримайте символи: ");
        }
        for (int i = 0; i < signsNumber; i++) {
            symbols.append(sign).append(" ");
        }
        System.out.println(symbols + "\n");
    }
}