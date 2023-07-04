package org.example.lesson5.HomeWork;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
//    1) Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом),
//    вносить все слова не нужно
//    Пример:
//    Россия идет вперед всей планеты. Планета — это не Россия.
//        Запрос: Россия
//    Ответ: Россия - 2
//    toLoverCase().
//            (Усложнение - игнорировать пунктуацию)

        Map<String, Integer> mapCh = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String[] text = str.toLowerCase().split(" ");
        System.out.println(Arrays.toString(text));
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите искомое слово: ");
        String word = sc.nextLine();
        String wordLow = word.toLowerCase();
        for (int i = 0; i < text.length; i++) {
            if (text[i] == wordLow){
                mapCh.putIfAbsent(str.charAt(i), 0);
                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
            }
        }
        for (Map.Entry<String, Integer> entity : mapCh.entrySet()) {
            System.out.println(entity.getKey() + " встретился в тексте: " + entity.getValue() + " раз");
        }
    }
}
