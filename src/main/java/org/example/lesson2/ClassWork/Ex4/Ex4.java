package org.example.lesson2.ClassWork.Ex4;

public class Ex4 {
    public static void main(String[] args) {
        Vector vector = new Vector(1, 2 , 3);
//        vector.x = 0;
//        vector.y = 1;
//        vector.z = 2;
        System.out.println("vector.vectorLength() = " + vector.vectorLength());
        Vector vector2 = new Vector();
        System.out.println("vector.scalar(vector2) = " + vector.scalar(vector2));
        System.out.println("vector.vectorMulti(vector2) = " + vector.vectorMulti(vector2));
        System.out.println("vector.kosVector(vector2) = " + vector.kosVector(vector2));
        System.out.println("vector.sumVector() = " + vector.sumVector(vector2));
        System.out.println("vector.diffVector(vector2) = " + vector.diffVector(vector2));
        System.out.println(vector);
    }
}
