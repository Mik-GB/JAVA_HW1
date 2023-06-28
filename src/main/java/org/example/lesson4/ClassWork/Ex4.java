package org.example.lesson4.ClassWork;

import java.util.Arrays;
import java.util.LinkedList;

public class Ex4 {
    public static void main(String[] args) {
//        4. Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
        LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(1, -1, -2, 5, 9));
//        LinkedList<Integer> myList = new LinkedList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите количество чисел: ");
//        int size = sc.nextInt();
//        for (int i = 0; i < size; i++) {
//            System.out.println("Enter a namber: ");
//            myList.add(sc.nextInt());
//        }
        oneDeletNegativNumber(myList);
        System.out.println("myList = " + myList);
    }

    private static void oneDeletNegativNumber(LinkedList<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) < 0) {
                myList.remove(i);
                i--;
            }
        }
    }
    private static void twoDeletNegativNumber(LinkedList<Integer> myList) {
        for (int i = myList.size() - 1; i > 0; i--) {
            if (myList.get(i) < 0) {
                myList.remove(i);
            }
        }
    }
}
