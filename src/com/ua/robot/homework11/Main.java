package com.ua.robot.homework11;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //Creation of Vehicle objects
        Vehicle v1 = new Vehicle("vehicle", "Volvo", "black", 2020);
        System.out.println(v1.typeInfo());
        System.out.println(v1);

        //Upcasting case
        Vehicle v2 = new Car("car", "ZAZ", "red", 2015, "Slavuta", 150);
        v2.toDrive();
        System.out.println(v2.typeInfo());
        System.out.println(v2);


        //Creation of Car objects
        Car c1 = new Car("car", "Daewoo", "grey", 2010, "Lanos", 200);
        System.out.println(c1.typeInfo());
        System.out.println(c1);

        //Downcasting case
        Vehicle v3 = c1;
        Car c2 = (Car) v3;
        System.out.println("Objects compare: " + Objects.equals(v3, c2) + "\n");

        v3.toDrive();
        ((Car) v3).toDrift();
        System.out.println(v3.typeInfo());
        System.out.println(v3);

        c2.toDrive();
        c2.toDrift();
        System.out.println(c2.typeInfo());
        System.out.println(c2);


        //Creation of Truck objects
        Truck t1 = new Truck("truck", "KRAZ", "white", 2010,  20);
        t1.toDrive();
        t1.toUnload();
        System.out.println(t1.typeInfo());
        System.out.println(t1);
    }
}
