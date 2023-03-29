package com.ua.robot.homework19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Creation of different Sets
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        //Filling and print out of Sets with random numbers from 1 to 50
        randomSet(hashSet);
        randomSet(linkedHashSet);
        randomSet(treeSet);
    }

    public static void randomSet(Set set) {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            set.add(random.nextInt(1, 51));
        }
        System.out.println(set);
    }
}
