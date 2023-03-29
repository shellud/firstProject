package com.ua.robot.homework22;

public class Student {
    private String name;
    private double avrgRating;

    public Student(String name, double avrgRating) {
        this.name = name;
        this.avrgRating = avrgRating;
    }

    public String getName() {
        return name;
    }

    public double getAvrgRating() {
        return avrgRating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", avrgRating=" + avrgRating +
                '}';
    }
}
