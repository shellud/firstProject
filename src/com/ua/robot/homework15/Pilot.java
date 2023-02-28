package com.ua.robot.homework15;

public class Pilot extends Human implements AbleToFly{

    public Pilot(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("I'm piloting F-16");
    }

    @Override
    public void activity() {
        System.out.println("I was made for blowing up orcs");
    }
}
