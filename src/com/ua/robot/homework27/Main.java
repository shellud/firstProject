package com.ua.robot.homework27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        writeFile(file);
        readFile(file);
    }
    public static void writeFile (File file) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введіть строку для запису в файл: ");
        String line = scanner1.nextLine();

        PrintWriter pw = new PrintWriter(file);
        pw.println(line);
        pw.close();
        scanner1.close();
    }

    public static void readFile (File file) throws FileNotFoundException {
        Scanner scanner2 = new Scanner(file);
        System.out.println("У файлі наступна строка: ");
        System.out.println(scanner2.nextLine());
        scanner2.close();
    }
}
