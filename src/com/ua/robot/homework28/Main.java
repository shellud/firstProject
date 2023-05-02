package com.ua.robot.homework28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("file.txt");
        writeFile(path);
        readFile(path);
    }

    public static void writeFile (Path path) throws IOException {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введіть строку для запису в файл: ");
        String line = scanner1.nextLine();
        Files.write(path, line.getBytes());
        scanner1.close();
    }

    public static void readFile (Path path) throws IOException {
        System.out.println("У файлі наступна строка: ");
        Files.readAllLines(path).forEach(System.out::println);
    }
}
