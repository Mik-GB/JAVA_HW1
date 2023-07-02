package org.example.lesson5.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {

// Определить есть ли в массиве дубликаты, если найдется хоть один, вывести на
// экран (true).
// В противном случае (false).
        int[] arr = { 1, 2, 3, 4, 5 };
        Map<Integer, Integer> mapCh = new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (!mapCh.containsKey(arr[i])) {
                mapCh.put(arr[i], 1);
            } else {
                mapCh.put(arr[i], mapCh.get(arr[i]) + 1);
                flag = true;
            }
        }
        System.out.println(flag);
    }
//    isDuble(arr);
//
//    /**
//     * @apiNote Определить есть ли в массиве дубликаты, если найдется хоть один, вывести на экран (true).
//     * @param arr входной массив
//     * @return флаг
//     */
//    private static boolean isDuble(int[] arr) {
//        Map<Integer, Integer> mapCh = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (!mapCh.containsKey(arr[i])) {
//                mapCh.put(arr[i], 1);
//            } else {
//                mapCh.put(arr[i], mapCh.get(arr[i]) + 1);
//                return true;
//            }
//        }
//        return false;
//    }
}
