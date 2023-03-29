package com.ua.robot.homework22;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Bob", 4.5));
        studentsList.add(new Student("Rob", 3.0));
        studentsList.add(new Student("John", 4.8));
        System.out.println(studentsList);

        //Sorting by name
        studentsList.sort(Comparator.comparing(Student::getName));
        System.out.println(studentsList);

        //Sorting by rating
        studentsList.sort((o1, o2) -> (int) (o1.getAvrgRating() - o2.getAvrgRating()));
        System.out.println(studentsList);
    }
}
