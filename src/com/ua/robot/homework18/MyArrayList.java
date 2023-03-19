package com.ua.robot.homework18;

import java.util.*;

public class MyArrayList<T> implements MyList<T> {
    private static final int DEFAULT_CAPACITY = 5;
    private static final int CUT_RATE = 2;
    private Object[] array;
    private int size = 0;

    public MyArrayList(int initCapacity) {
        if (initCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        array = new Object[initCapacity];
    }

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(T element) {
        if (array.length == size) {
            resize(array.length * 2);
        }
        array[size++] = element;
    }

    @Override
    public void add(int index, T element) {
        Objects.checkIndex(index, size + 1);
        if (array.length == size) {
            resize(array.length * 2);
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }

    @Override
    public void set(int index, T element) {
        Objects.checkIndex(index, size);
        array[index] = element;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) array[index];
    }

    @Override
    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(0);
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(size - 1);
    }

    @Override
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement = (T) array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size - 1] = null;
        size--;
        if (array.length > DEFAULT_CAPACITY && size < array.length / CUT_RATE)
            resize(array.length / 2);
        return removedElement;
    }

    @Override
    public boolean contains(T element) {
        for (Object o : array) {
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public String toString() {
        Object[] nullFiltered = Arrays.stream(array).filter(Objects::nonNull).toArray();
        return Arrays.toString(nullFiltered);
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}