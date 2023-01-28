package com.ua.robot.homework6;

public class Main {
    public static void main(String[] args) {
        //1-10
        System.out.println("Числа від 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Even 1-100
        System.out.println("Парні числа від 1 до 100:");
        int x = 1;

         do {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
            x++;
        } while (x <= 100);
        System.out.println("\n");

        //Factorial
        System.out.println("Факторіал числа 7:");
        int factorial = 1;

        for (int i = 1; i <= 7; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial + "\n");

        //Fibonacci
        System.out.println("Числа Фібоначчі<100:");
        int number1;
        int number2 = 1;
        int numberFibo = 0;

        while (numberFibo < 100) {
            System.out.print(numberFibo + " ");
            number1 = number2;
            number2 = numberFibo;
            numberFibo = number1 + number2;
        }
    }
}
