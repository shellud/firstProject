package com.ua.robot.homework12;

public class Parent {
    static {
        System.out.println("Parent 1");
    }

    {
        System.out.println("Parent 3");
    }

    {
        System.out.println("Parent 4");
    }
}
