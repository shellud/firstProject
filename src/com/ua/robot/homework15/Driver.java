package com.ua.robot.homework15;

public class Driver extends Human implements AbleToDrive{

    public Driver(String name, int age) {
        super(name, age);
    }

    @Override
    public void drive() {
        System.out.println("I'm driving Leopard");
    }

    @Override
    public void activity() {
        System.out.println("I was made for smashing up orcs");
    }
}
