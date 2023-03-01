package com.ua.robot.homework15;

public abstract class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introducing (){
        System.out.println("I'm " + name + ", my age is " + age + " years.");
    }

    public abstract void activity();
}
