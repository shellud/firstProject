package com.ua.robot.homework17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведіть номер дня, програма поверне його назву");
        int dayIndex = scanner.nextInt();

        while (dayIndex<1 || dayIndex>7) {
            System.out.println("Ввведіть номер дня від 1 до 7");
            dayIndex = scanner.nextInt();
        }

        System.out.println("Цей день тижня: " + DaysOfWeek.getDay(dayIndex));
    }
}
