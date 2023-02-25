package com.ua.robot.homework14;

abstract class Person {
    String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void introducing (){
        System.out.println("I'm " + firstName + " " + lastName + ", my age is " + age + " years.");
    }

    public abstract void activity();
}
