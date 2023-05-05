package com.ua.robot.homework32;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new CountThread("Thread 1"));
        Thread thread2 = new Thread(new CountThread("Thread 2"));
        thread1.start();
        thread2.start();
    }
}

