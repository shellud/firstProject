package com.ua.robot.homework33;

class NumberGenerator implements Runnable {
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            int number = (int) (Math.random() * 10) + 1;
            System.out.println("Generated number: " + number);
            if (number == 5) {
                System.out.println("Number generated is 5, stopping the thread.");
                Thread.currentThread().interrupt();
            }
        }
    }
}
