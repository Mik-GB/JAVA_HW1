package org.example.lesson6.ClassWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 5, 6, 7));
        Set<Integer> resSet = new HashSet<>(set1);
        resSet.retainAll(set2);
        System.out.println(resSet);
        System.out.println(set1);
        System.out.println(set2);
    }
}
