package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите набор слов через пробел: ");
        String stringNew = sc.nextLine();
        String[] stringRes = stringNew.trim().split(" ");
        String[] result = new String[stringRes.length];
        for (int i = 0; i < stringRes.length; i++) {
            result[i] = stringRes[stringRes.length - i - 1];
        }
        System.out.println(String.join(" ", result));
    }
    /**
     * @param stringNew входящая строка
     * @return строка в обратном порядке слов
     * @apiNote Учитывая входную строку, изменить порядок слов на противоположный
     */
}

