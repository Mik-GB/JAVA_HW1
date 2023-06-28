package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
//        int numb1;
//        int numb2;
//         do {
//            numb1 = sc.nextInt();
//            if (numb1 == 0) break;
//            numb2 = sc.nextInt();
//            if (numb2 == 0) break;
//            if (isNumberPositive(numb1, numb2)) {
//                result = numb1 + result;
//                            }
//        }while (numb1 != 0 || numb2 != 0);
        System.out.println("Введите последовательность целых чисел, оканчивающуюся нулем: ");
        int numb1 = sc.nextInt();
        while (numb1 != 0) {
            int numb2 = sc.nextInt();
            if (isNumberPositive(numb1, numb2)) {
                result = numb1 + result;
            }
            numb1 = numb2;
        }
        System.out.println(" = " + result);
    }

    /**
     * @param numb1 ввод первого числа
     * @param numb2 ввод последующих чисел
     * @return Сумма положительных чисел, после которых следует отрицательное число
     * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем
     */
    private static boolean isNumberPositive(int a, int b) {
        return a > 0 && b < 0;
    }
}

