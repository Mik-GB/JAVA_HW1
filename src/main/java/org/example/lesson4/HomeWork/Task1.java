package org.example.lesson4.HomeWork;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
//        1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
//        Пример:
//        1 -> 2->3->4
//        Вывод:
//        4->3->2->1
        LinkedList<Integer> inLinkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int n = sc.nextInt();
        sc.close();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            inLinkedList.add(random.nextInt(10));
        }
        System.out.println("Исходный список 1:" + inLinkedList);
        System.out.println("Перевернутый список: ");
        Collections.reverse(inLinkedList);

        System.out.println("inLinkedList = " + inLinkedList);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Исходный список 2:" + list);
        List<Integer> reverse = reverseList(list);
        System.out.println("reverseList = " + reverse);
    }

    private static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reverse = new ArrayList<>(list.size());

        new LinkedList<>(list)
                .descendingIterator()
                .forEachRemaining(reverse::add);

        return reverse;
    }
}
