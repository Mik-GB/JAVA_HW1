package org.example.lesson1.ClassWork;

public class Ex3 {
    public static void main(String[] args) {
        //    Дан массив целых чисел. Верно ли, что массив является симметричным.
        int[] myArray = {1, 2, 3, 4, 5, 4, 3, 2, 1,};
        System.out.println("palindrom(myArray) = " + palindrom(myArray));
    }

    /**
     * @param array входной массив
     * @return симметричен или нет в виде строки
     * @apiNote Дан массив целых чисел
     */
    private static String palindrom(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return "Не симметричный !";
            }
        }
        return "Симмитричный !";
    }


}
