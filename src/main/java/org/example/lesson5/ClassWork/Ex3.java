package org.example.lesson5.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
// Написать перевод их Римских цифр в арабские:
// I 1
// V 5
// X 10
// L 50
// C 100
// D 500
// M 1000
// Примеры:
// ввод: s = "LVIII"
// вывод: 58
// разбор: L = 50, V= 5, III = 3.
        String text = "LVIII";
        String text2 = "MCMXCIV";
        System.out.println("transformArabic(text) = " + transformArabic(text));
        System.out.println("transformArabic(text2) = " + transformArabic(text2));
    }
    /**
     * @param text римское число
     * @return арабское число
     * @apiNote написать перевод из римских цифор в арабские
     */
    private static Integer transformArabic(String text) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        Integer result = map.get(text.charAt(text.length() - 1));
        for (int i = 0; i < text.length() - 1; i++) {
            if (map.get(text.charAt(i)) < map.get(text.charAt(i + 1))) {
                result -= map.get(text.charAt(i));
            } else {
                result += map.get(text.charAt(i));
            }
        }
        return result;
    }
}
