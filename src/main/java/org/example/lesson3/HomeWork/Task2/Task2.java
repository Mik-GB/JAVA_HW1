package org.example.lesson3.HomeWork.Task2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    //    2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
//    Получить наименования товаров заданного сорта с наименьшей ценой.
    public static void main(String[] args) {
        Product product1 = new Product("полироль блеск", "РФ", 2500, 310, 1);
        Product product2 = new Product("полироль onin", "КНР", 2000, 410, 2);
        Product product3 = new Product("полироль kiwa", "КНР", 1500, 420, 3);
        Product product4 = new Product("полироль tru", "США", 1700, 700, 2);
        Product product5 = new Product("полироль avt", "США", 3000, 685, 3);
        Product product6 = new Product("полироль 4 сезона", "РФ", 3300, 210, 1);
        Product product7 = new Product("полироль 2 сезона", "РФ", 3000, 210, 1);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        System.out.println(productList);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сорт товара: ");
        Integer gradeProd = sc.nextInt();
        Integer minPrice = 0;
        List<Product> resultList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getGrade().equals(gradeProd)) {
                resultList.add(productList.get(i));
            }
        }
        minPrice = resultList.get(0).getPrice();
        for (int i = 0; i < resultList.size(); i++) {
            if (minPrice > resultList.get(resultList.size() - 1 - i).getPrice()) {
                minPrice = resultList.get(resultList.size() - 1 - i).getPrice();
            }
        }
        for (Product product : resultList) {
            if (product.getPrice().equals(minPrice)) {
                System.out.println(product.getName());
            }
        }
    }
}
