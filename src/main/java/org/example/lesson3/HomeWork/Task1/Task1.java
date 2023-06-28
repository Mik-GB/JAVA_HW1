package org.example.lesson3.HomeWork.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        1. Дан массив записей: наименование товара, цена, сорт.
//        Найти наибольшую цену товаров 1го или 2-го сорта среди товаров,
//        название которых содержит «высший».
        Product product1 = new Product("тушенка высший сорт", 250, 1);
        Product product2 = new Product("тушенка ГОСТ", 200, 2);
        Product product3 = new Product("тушенка от дяди Вани", 150, 2);
        Product product4 = new Product("тушенка", 170, 2);
        Product product5 = new Product("тушенка высшего сорта", 300, 1);
        Product product6 = new Product("высший сорт тушенка говяжья", 330, 1);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        System.out.println(productList);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сорт товара: ");
        Integer gradeProd = sc.nextInt();
        Integer hightPrice = 0;
        for (Product product : productList) {
            if (product.getGrade().equals(gradeProd)) {
                if (product.getName().contains("высший") && hightPrice < product.getPrice()) {
                    hightPrice = product.getPrice();
                }
            }
        }
//        for (int i = 0; i < productList.size(); i++) {
//            if (productList.get(i).getGrade() == gradeProd
//                    && productList.get(i).getName().contains("высший")
//                    && hightPrice < productList.get(i).getPrice()){
//                hightPrice = productList.get(i).getPrice();
//            }
//        }
        System.out.println(hightPrice);
    }
}
