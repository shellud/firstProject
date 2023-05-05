package com.ua.robot.homework32;

class CountThread implements Runnable {
    private final String threadName;

    public CountThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + " : " + i);
        }
    }
}
