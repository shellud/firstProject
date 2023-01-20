package com.ua.robot.homework4;

public class Main {
    public static void main(String[] args) {
        //Homework 4
        String school = "Robot_Dreams";
        int stringLength = school.length();

        System.out.println("У верхньому регістрі: " + school.toUpperCase());
        System.out.println("У нижньому регістрі: " + school.toLowerCase());
        System.out.println("Перша літера: " + school.charAt(0));
        System.out.println("Остання літера: " + school.charAt(stringLength-1));
    }
}
