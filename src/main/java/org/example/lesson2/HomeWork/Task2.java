package org.example.lesson2.HomeWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во целых чисел для ввода: ");
        int n = sc.nextInt();
        System.out.println("Введите целые числа для проверки на возрастание последоваетльности: ");
        int num1 = sc.nextInt();
        int negativCount = 0;
        for (int i = 1; i < n; i++) {
            int num2 = sc.nextInt();
            if (ascendNumber(num1, num2)) {
//                System.out.println("Последовательность не является возрастающей!");
                negativCount += 1;
//                break;
            }
            num1 = num2;
        }
        if (negativCount == 0) {
            System.out.println("Последовательность является возрастающей!");
        } else System.out.println("Последовательность не является возрастающей!");
    }

    /**
     * @param numb1 ввод первого числа
     * @param numb2 ввод последующих чисел
     * @return Сумма положительных чисел, после которых следует отрицательное число
     * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем
     */
    private static boolean ascendNumber(int a, int b) {
        return a > b;
    }
}
