package org.example.lesson2.HomeWork;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task1 {
    public static void main(String[] args) {
        /*
        Дана последовательность N целых чисел. Найти сумму простых чисел.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во целых чисел для ввода: ");
        int n = sc.nextInt();
        int result = 0;
        System.out.println("Введите целые чисела: ");
        for (int i = 0; i < n; i++) {
            int num1 = sc.nextInt();
            if (sumSimple(num1)) {
                result = result + num1;
            }
        }
        System.out.println("sum = " + result);
    }

    /**
     * @param a введенное число
     * @return сумма простых чисел
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     */
    public static boolean sumSimple(int a) {
        if (a <= 1) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
