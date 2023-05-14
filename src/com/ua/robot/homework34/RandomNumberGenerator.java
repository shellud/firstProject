package com.ua.robot.homework34;

import java.util.Random;
import java.util.concurrent.Callable;

class RandomNumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        return random.nextInt(0,51);
    }
}
