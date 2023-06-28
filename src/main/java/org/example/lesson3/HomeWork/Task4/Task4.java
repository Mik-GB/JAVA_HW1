package org.example.lesson3.HomeWork.Task4;

import java.util.ArrayList;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
//        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        Random rnd = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(rnd.nextInt(0, 100));
        }
        System.out.println(array);
        int min = array.get(0);
        int max = array.get(0);
        double sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
            if (array.get(i) < min) min = array.get(i);
            if (array.get(i) > max) max = array.get(i);
        }
        System.out.println("mix: " + min);
        System.out.println("max: " + max);
        System.out.println("avarage: " + (sum / array.size()));
    }
}
