package org.example.lesson6.ClassWork.Ex6;

public class Farengheit implements Converter{

    @Override
    public double convertValue(Double baseValue) {
        return baseValue *1.8 + 32;
    }
}
