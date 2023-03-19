package com.ua.robot.homework18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //List creation from 10 elements
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(11));
        }
        System.out.println(arrayList);

        //List creation from 2 000 000 elements
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 2000000; i++) {
            linkedList.add(random.nextInt(11));
        }

        //List creation from students using own MyArrayList
        MyList<Student> studentsList1 = new MyArrayList<>(3);
        studentsList1.add(new Student("Bob", 19, "PTU"));
        studentsList1.add(1, new Student("Rob", 20, "NTU"));
        studentsList1.add(0, new Student("John", 21, "STU"));
        System.out.println(studentsList1);

        //List creation from students using own MyLinkedList
        MyList<Student> studentsList2 = new MyLinkedList<>();
        Student student = new Student("Tom", 22, "KTU");
        studentsList2.add(studentsList1.get(2));
        studentsList2.add(studentsList1.get(1));
        studentsList2.add(studentsList1.get(0));
        studentsList2.set(2,student);
        System.out.println(studentsList2);

        //Test of MyArrayList
        MyList <Integer> myArrayList = new MyArrayList<>();
        for (int i = 0; i < 7; i++) {
            myArrayList.add(random.nextInt(11));
        }

        System.out.println();
        System.out.println(myArrayList);
        myArrayList.add(7,333);
        myArrayList.add(7,222);
        myArrayList.add(7,111);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        myArrayList.set(2,434);
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.getFirst());
        System.out.println(myArrayList.getLast());
        System.out.println(myArrayList.contains(434));
        System.out.println(myArrayList.contains(66));
        myArrayList.remove(1);
        System.out.println(myArrayList);
        myArrayList.clear();
        System.out.println(myArrayList);

        //Test of MyLinkedList
        MyList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 7; i++) {
            myLinkedList.add(random.nextInt(11));
        }

        System.out.println();
        System.out.println(myLinkedList);
        myLinkedList.add(7, 333);
        myLinkedList.add(7, 222);
        myLinkedList.add(7, 111);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
        myLinkedList.set(2, 434);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.contains(434));
        System.out.println(myLinkedList.contains(66));
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        myLinkedList.clear();
        System.out.println(myLinkedList);
    }
}
