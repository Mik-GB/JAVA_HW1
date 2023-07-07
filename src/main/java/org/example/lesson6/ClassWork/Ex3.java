package org.example.lesson6.ClassWork;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        List<String> mas1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> mas2 = new ArrayList<>(Arrays.asList("qwe", "v", "x"));
        Set<String> set = new HashSet<>(mas1);
        System.out.println("set.retainAll(mas2) = " + set.retainAll(mas2));
        System.out.println("set = " + set);
        int k = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String s : mas1) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s)+1);
        }
        for (String s : set) {
            for (int i = 0; i < mas1.size(); i++) {
                if (mas1.get(i).equals(s)) {
                    k++;
                }
            }
//            for (int i = 0; i < mas2.size(); i++) {
//                if (mas2.get(i).equals(s)) {
//                    k++;
//                }
            }
//            System.out.println(s + " = " +k);
//            k = 0;
        }

}
