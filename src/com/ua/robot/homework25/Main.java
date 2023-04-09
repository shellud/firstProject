package com.ua.robot.homework25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Введіть число: ");
        String line = newScan.nextLine();
        int digit;
        while (true) {
            try {
                digit = Integer.parseInt(line);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Помилка - ви ввели символ, введіть число: ");
            }
            line = newScan.nextLine();
        }
        System.out.println("Ви ввели число: " + digit);
    }
}