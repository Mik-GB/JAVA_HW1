package org.example.lesson3.HomeWork.Task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private Integer grade;
}
