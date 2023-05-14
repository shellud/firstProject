package com.ua.robot.homework34;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Callable<Integer> callable = new RandomNumberGenerator();
        for (int i = 0; i < 10; i++) {
            Future<Integer> future = executorService.submit(callable);
            System.out.println("Generated number: " + future.get());
        }
        executorService.shutdown();
    }
}

