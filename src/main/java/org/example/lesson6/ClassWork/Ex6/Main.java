package org.example.lesson6.ClassWork.Ex6;

public class Main {
    public static void main(String[] args) {
        double temp = 1.0;
        System.out.println("temp C =" + new  Celsiy().convertValue(temp));
        System.out.println("temp Kelvin =" + new  Kelvin().convertValue(temp));
        System.out.println("temp Fare =" + new  Farengheit().convertValue(temp));
    }
}
