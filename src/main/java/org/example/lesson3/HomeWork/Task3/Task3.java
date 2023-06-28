package org.example.lesson3.HomeWork.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    //    3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
//    Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания
//    после 2010 г, включительно.
    public static void main(String[] args) {
        Book book1 = new Book("Гарри Поттер", "Джоан Роулинг", 1000, 1997, 250);
        Book book2 = new Book("451 градус по Фаренгейту", "Рэя Брэдбери", 900, 1997, 350);
        Book book3 = new Book("Властелин колец", "Джон Рональд Руэл Толкин", 1200, 1954, 410);
        Book book4 = new Book("Маленький принц", "Антуана де Сент-Экзюпери", 700, 1978, 210);
        Book book5 = new Book("Шантарам", "Грегори Дэвидом Робертсом", 800, 1980, 350);
        Book book6 = new Book("Имя ветра", "Патрик Ротфусс", 500, 2010, 240);
        Book book7 = new Book("1Q84", "Харуки Мураками", 800, 2011, 370);
        Book book8 = new Book("Сказки старого Вильнюса", "Макс Фрай", 800, 2011, 139);
        Book book9 = new Book("Танец с драконами", "Дж. Р. Р. Мартин", 940, 2012, 400);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
//        System.out.println(bookList);
        Integer n = 0;
        String result = "";
        List<Book> resultList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().contains("а") && book.getYear() >= 2010 && primeNumb(book.getPages())) {
                resultList.add(book);
            }
        }
        for (Book book : resultList) {
            System.out.println(book.getName());
        }
    }

    public static boolean primeNumb(int a) {
        if (a <= 1) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
