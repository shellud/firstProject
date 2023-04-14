package com.ua.robot.homework26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int number = scanner.nextInt();

        try {
            System.out.println(squareNumber(number));
        } catch (NegativeValueException ex) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured: " + ex);
        }
    }

    public static double squareNumber(int number) throws NegativeValueException {
        if (number < 0) {
            throw new NegativeValueException("number is less than zero");
        } else {
            return Math.pow(number, 2);
        }
    }
}


