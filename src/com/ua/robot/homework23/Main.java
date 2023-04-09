package com.ua.robot.homework23;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Creation of List with random surnames and converting to Map with counting of same surnames
        List<String> surnamesList = List.of(
                "Robson", "Tomson", "Bobson", "Samson", "Melson", "Nelson",
                "Samson", "Nelson", "Nelson", "Samson", "Tomson", "Samson", "Robson",
                "Bobson", "Samson", "Nelson", "Bobson", "Robson", "Robson", "Nelson");
        System.out.println(surnamesList);

        Map<String, Long> surnamesMap = surnamesList.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(surnamesMap);

//        Creation of List with random numbers and finding sum of these numbers
        List<Integer> numbersList = new Random().ints(10, 0, 11)
                .boxed().toList();
        System.out.println("Список з випадкових чисел: " + numbersList);
//        1st method
        System.out.println("Сума чисел у списку: " + numbersList.stream().
                reduce(0, Integer::sum));
//        2nd method
        System.out.println("Сума чисел у списку: " + (Integer) numbersList.stream().
                mapToInt(i -> i).sum());
    }
}
