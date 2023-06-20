package org.example.lesson2.ClassWork.Ex4;

import static java.lang.Math.sqrt;

public class Vector {
    public double x;
    public double y;
    public double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x= " + x +
                ", y= " + y +
                ", z= " + z +
                '}';
    }

    /**
     * @return Длинна вектора
     */
    public double vectorLength() {
        return sqrt(x * x + y * y + z * z);
    }

    /**
     * @return Скалярное произведение
     */
    public double scalar(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    /**
     * @return вектор произведения
     */
    public Vector vectorMulti(Vector vector2) {
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x
        );
    }
    /**
     * @return угол между векторами(косинус угла)
     */
    public double kosVector(Vector vector2) {
        return scalar(vector2) / (vectorLength() * vector2.vectorLength());
    }
    /**
     * @return вектор суммы
     */
    public Vector sumVector(Vector vector2) {
        return new Vector(
                x + vector2.x,
                y + vector2.y,
                z + vector2.z
        );
    }
    /**
     * @return вектор разности
     */
    public Vector diffVector(Vector vector2) {
        return new Vector(
                x - vector2.x,
                y - vector2.y,
                z - vector2.z
        );
    }
}
