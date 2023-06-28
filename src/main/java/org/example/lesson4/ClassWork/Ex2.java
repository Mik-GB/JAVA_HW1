package org.example.lesson4.ClassWork;

import java.util.LinkedList;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
//        2. Построить однонаправленный список целых чисел.Найти сумму четных элементов списка.
        LinkedList<Integer> myList = new LinkedList<>();
        Random random = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            myList.add(random.nextInt(10));
        }
        System.out.println("myList = " + myList);
        int sumPositive = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                sumPositive += myList.get(i);
            }
        }
        System.out.println("sumPositive = " + sumPositive);
    }
}
