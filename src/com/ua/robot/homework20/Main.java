package com.ua.robot.homework20;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Translation> numbersTranslation = new HashMap<>();
        numbersTranslation.put("Один", new Translation("One", "Eins", "一"));
        numbersTranslation.put("Два", new Translation("Two", "Zwei", "二"));
        numbersTranslation.put("Три", new Translation("Three", "Drei", "三つ"));
        numbersTranslation.put("Чотири", new Translation("Four", "Vier", "四"));
        numbersTranslation.put("П'ять", new Translation("Five", "Funf", "五"));
        numbersTranslation.put("Шість", new Translation("Six", "Sechs", "六"));
        numbersTranslation.put("Сім", new Translation("Seven", "Sieben", "セブン"));
        numbersTranslation.put("Вісім", new Translation("Eight", "Acht", "八"));
        numbersTranslation.put("Дев'ять", new Translation("Nine", "Neun", "九"));
        numbersTranslation.put("Десять", new Translation("Ten", "Zehn", "十"));

        System.out.println("Програма перекладу чисел на інші мови");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву числа : ");
        String numberToTranslate = scanner.next();

        for (Map.Entry<String, Translation> entry : numbersTranslation.entrySet()) {
            if (numberToTranslate.equals(entry.getKey())) {
                System.out.println("Число '" + numberToTranslate + "' перекладається: " + entry.getValue());
            }
        }
    }
}
