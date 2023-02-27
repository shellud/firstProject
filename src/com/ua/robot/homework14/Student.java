package com.ua.robot.homework14;

public class Student extends Person {
    private String group;

    public Student(String firstName, String lastName, int age, String group) {
        super(firstName, lastName, age);
        this.group = group;
    }

    @Override
    public void activity() {
        System.out.println("I'm learning in group " + group);
    }

    public void passExam(Teacher teacher){
        System.out.println("I got " + teacher.checkExam() + " for the " + teacher.subject + " exam");
    }
}
