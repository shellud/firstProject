package com.ua.robot.homework14;

public class Main {
    public static void main(String[] args) {
        System.out.println("Object creation: Teacher -> Teacher");
        Teacher teacher1 = new Teacher("Bob", "Bobson", 45, "Math");
        personIntro(teacher1);
        System.out.println("My favorite rate is " + teacher1.checkExam());

        System.out.println("\nObject creation: Student -> Student");
        Student student1 = new Student("Tom", "Tomson", 20, "PTU");
        personIntro(student1);
        student1.passExam(teacher1);

        System.out.println("\nObject creation: Person -> Teacher (checkExam() is not available)");
        Person teacher2 = new Teacher("Rob", "Robson", 49, "History");
        personIntro(teacher2);

        System.out.println("\nObject creation: Person -> Student (passExam() is not available)");
        Person student2 = new Student("Tim", "Timson", 20, "NTU");
        personIntro(student2);
    }

    static void personIntro (Person person){
        person.introducing();
        person.activity();
    }
}
