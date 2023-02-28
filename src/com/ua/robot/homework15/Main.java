package com.ua.robot.homework15;

public class Main {
    public static void main(String[] args) {

        System.out.println("Driver with all methods:");
        Driver d1 = new Driver("Taras", 25);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        d1.introducing();
        d1.drive();
        d1.activity();

        System.out.println("\nDriver without drive method:");
        Human d2 = new Driver("Makar", 26);
        System.out.println(d2.getName());
        System.out.println(d2.getAge());
        d2.introducing();
        d2.activity();

        System.out.println("\nDriver with only drive method:");
        AbleToDrive d3 = new Driver("Petro", 23);
        d3.drive();

        System.out.println("\nPilot with only fly method:");
        AbleToFly p1 = new Pilot("Mykola", 30);
        p1.fly();

        System.out.println("\nBiker with only drive method:");
        AbleToDrive b1 = new Biker("Yarik", 19);
        b1.drive();

        System.out.println("\nBiker with only fly method:");
        AbleToFly b2 = new Biker("Valera", 18);
        b2.fly();
    }
}
