package com.ua.robot.homework8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Homework 8
        int[] arr = new int[10];

        fillRandomArray(arr);
        printArray(arr);
        printResults(arr);

    }
    //Filling of array
    static void fillRandomArray (int[]arr){
        Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }

    //Printing of array
    static void printArray (int[]arr){
        System.out.print("Масив з випадкових чисел:\n");
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }

    //Minimum value of array
    static int getMinValue(int[]arr){
        int min =10;
        for (int i:arr) {
            if (min>i){
                min = i;
            }
        }
        return  min;
    }

    //Maximum value of array
    static int getMaxValue(int[]arr){
        int max = 0;
        for (int i:arr) {
            if (max<i){
                max = i;
            }
        }
        return  max;
    }

    //Average value of array
    static double getAverageValue(int[]arr){
        double average = 0;
        for (int i:arr) {
            average += i;
        }
        average /= arr.length;
        return  average;
    }

    //Sum of elements in array
    static int getSumElements(int[]arr){
        int sum = 0;
        for (int i:arr) {
            sum += i;
        }
        return  sum;
    }

    //Printing results
    static void printResults(int [] arr){
        System.out.println("\nМінімальне значення у масиві: " + getMinValue(arr));
        System.out.println("Максимальне значення у масиві: " + getMaxValue(arr));
        System.out.println("Середнє значення у масиві: " + getAverageValue(arr));
        System.out.println("Сума елементів масива: " + getSumElements(arr));
    }
}
