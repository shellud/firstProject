package com.ua.robot.homework10;

import java.util.Arrays;
import java.util.Random;

public class Array {
    private int[] array;
    private int maxRandomValue;

    public Array(int[] array) {
        this.array = array;
    }

    public Array(int[] array, int maxRandomValue) {
        this.array = array;
        this.maxRandomValue = maxRandomValue;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getMaxRandomValue() {
        return maxRandomValue;
    }

    public void setMaxRandomValue(int maxRandomValue) {
        this.maxRandomValue = maxRandomValue;
    }

    public int[] fillRandomArray() {
        Random random = new Random();
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = random.nextInt(this.maxRandomValue + 1);
        }
        return this.array;
    }

    public int[] ascendingSort() {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = i + 1; j < this.array.length; j++) {
                if (this.array[j] < this.array[i]) {
                    int temp = this.array[i];
                    this.array[i] = this.array[j];
                    this.array[j] = temp;
                }
            }
        }
        return this.array;
    }

    public int[] descendingSort() {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = i + 1; j < this.array.length; j++) {
                if (this.array[j] > this.array[i]) {
                    int temp = this.array[i];
                    this.array[i] = this.array[j];
                    this.array[j] = temp;
                }
            }
        }
        return this.array;
    }

    public void printArray() {
        String arrayString = "";
        for (int i : this.array) {
            arrayString += i + " ";
        }
        System.out.println(arrayString);
    }

    @Override
    public String toString() {
        return "Масив з випадкових чисел: " + Arrays.toString(fillRandomArray()) +
                "\nВідсортований масив за зростанням: " + Arrays.toString(ascendingSort()) +
                "\nВідсортований масив за зменшенням: " + Arrays.toString(descendingSort());
    }
}
