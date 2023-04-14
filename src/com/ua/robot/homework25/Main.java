package com.ua.robot.homework25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число: ");
        String line = scanner.nextLine();
        int digit;
        while (true) {
            try {
                digit = Integer.parseInt(line);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Помилка - ви ввели символ, введіть число: ");
            }
            line = scanner.nextLine();
        }
        System.out.println("Ви ввели число: " + digit);
    }
}