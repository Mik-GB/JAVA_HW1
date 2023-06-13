package org.example.lesson1.ClassWork;

import java.util.Scanner;

public class Ex1 {
    //    public static void main(String[] args) {
//        /**
//         * @apiNote Заданное целое число возвращает разность между произведением его цифр на сумму его цифр n
//         * @param n результа выполнения задачи
//         * @apiNote Заданное целое число возвращает разность между произведением его цифр на сумму его цифр. n
//         */
//        // Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//        // Заданное целое число возвращает разность между произведением его цифр на сумму его цифр n
//        Scanner sc = new Scanner(System.in); // todo: комментарии в проектах
//        int n = sc.nextInt();
//        int multi = 1, sum = 0;
//        int k = 0;
//        while (n != 0) {
//            multi *= n % 10;
//            sum += n % 10;
//            n /= 10;
//        }
//        System.out.println("res = " + (multi - sum));
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("zadanie1(n) = " + zadanie1(n));
    }

    /**
     * @param n входящее целочисленное число
     * @return результат выполнения задачи
     * @apiNote Заданное целое число возвращает разность между произведением его цифр на сумму его цифр. n
     */
    private static int zadanie1(int n) { // todo: переименовать метод
        int multi = 1, sum = 0;
        while (n != 0) {
            int m = n % 10;
            multi *= m;
            sum += m;
            n /= 10;
        }
        return multi - sum;
    }
}
