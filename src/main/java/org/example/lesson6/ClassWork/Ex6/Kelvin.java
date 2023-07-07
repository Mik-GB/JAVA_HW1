package org.example.lesson6.ClassWork.Ex6;

public class Kelvin implements Converter{
    @Override
    public double convertValue(Double baseValue) {
        return baseValue + 273.15;
    }
}
