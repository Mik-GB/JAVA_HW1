package org.example.lesson2.HomeWork;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
//        Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
//                Пример:
//        Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
//        Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
//        Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}
        int[] myArray = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        int sumIndex = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] / 10 < 10 && Math.abs(myArray[i]) / 10 > 0) {
                sumIndex += i;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                myArray[i] = sumIndex;
            }
        }
        System.out.println(sumIndex);
        System.out.println(Arrays.toString(myArray));
    }
}
