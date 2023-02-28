package com.ua.robot.homework15;

public class Biker extends  Human implements AbleToDrive, AbleToFly{
    public Biker(String name, int age) {
        super(name, age);
    }

    @Override
    public void drive() {
        System.out.println("I'm driving Karpaty bike");
    }

    @Override
    public void fly() {
        System.out.println("I could fly above your car if you stand on my way!");
    }

    @Override
    public void activity() {
        System.out.println("I was made for being free of rules!");
    }
}
