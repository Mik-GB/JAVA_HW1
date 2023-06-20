package org.example.lesson2.ClassWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 2) Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите необходимое количество чисел для ввода: ");
        int n = sc.nextInt();
        System.out.println("Введите последовательность целых чисел: ");
        System.out.println("Результат: " + sumNumbers(n, sc));
        }

    /**
     * @apiNote Дана последовательность из N целых чисел
     * @param number количество чисел для ввода
     * @param in сканер
     * @return сумма чисел, оканчивающихся на 5, перед которыми идет четное число
     */
    private static int sumNumbers(int number, Scanner in) {
        int numb1 = in.nextInt();
        int result = 0;
        for (int i = 0; i < number - 1; i++) {
            int numb2 = in.nextInt();
            if (numb1 % 2 == 0 && numb2 % 10 == 5) {
                result = numb2 + result;
            }
            numb1 = numb2;
        }
        return result;
    }
}
