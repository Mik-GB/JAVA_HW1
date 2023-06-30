package org.example.lesson4.HomeWork;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task2 {
    public static void main(String[] args) {
//        Учитывая строку s, содержащую только символы '(', ')', '{', и '}', определите, допустима ли входная строка.'['']'
//
//        Входная строка действительна, если:
//
//        Открытые скобки должны быть закрыты однотипными скобками.
//                Открытые скобки должны быть закрыты в правильном порядке.
//                Каждой закрывающей скобке соответствует открытая скобка того же типа.
//
//        Пример 1:
//
//        Ввод: s = "()"
//        Вывод: правда

        String s = "())()"; // false
        String startBrack = "({[";
        String endBrack = ")}]";
        boolean result = true;
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (startBrack.indexOf(ch) >= 0) {
                deque.offerFirst(ch);
            } else {
                int index = endBrack.indexOf(ch);
                if (index >= 0) {
                    if (deque.size() == 0 || deque.pollFirst() != startBrack.charAt(index)) {
                        result = false;
                        break;
                    }
                }
            }
            if (!result)
                break;
        }
        System.out.println(result);
    }
}
