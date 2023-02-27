package com.ua.robot.homework14;

import java.util.Random;

public class Teacher extends Person{
    protected String subject;

    public Teacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age);
        this.subject = subject;
    }

    @Override
    public void activity() {
        System.out.println("I'm teaching " + subject);
    }

    public int checkExam (){
        Random random = new Random();
        return random.nextInt(1,6);
    }
}
