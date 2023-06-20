package org.example.lesson2.ClassWork;

import java.util.Scanner;

public class Ex3 {
//    3) Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    System.out.println("Введите необходимое количество чисел для ввода: ");
//    int n = sc.nextInt();
//    System.out.println("Введите последовательность целых чисел: ");
//    System.out.println("Результат: " + sumNumbers(n, sc));
        int[] arrNum = {4, 2, 5, 8, 4, 9, 3, 4, 2};
        System.out.println("Результат: " + countElem(arrNum));
    }

    private static int countElem(int[] arr) {
        int countNum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 2 * arr[i]){
                countNum += 1;
            }
        }
        return countNum;
    }
}
