package org.example.lesson3.ClassWork.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
//    3.	 Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
//    его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
//    Найти:
//            - количество кубиков желтого цвета и их суммарный объем;
//           - количество деревянных кубиков с ребром 3 см

    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "red", "wood");
        Cube cube2 = new Cube(4, "yellow", "iron");
        Cube cube3 = new Cube(5, "green", "wood");
        Cube cube4 = new Cube(10, "red", "carton");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        System.out.println("cubeList = " + cubeList);
        Integer k = 0;
        Integer sumVolume = 0;
        Integer kWood = 0;

        for (Cube cube : cubeList) { //cubeList.iter
            if (cube.getColor().equals("yellow")) {
                k++;
//                Integer volCube = cube.getSize() * cube.getSize() * cube.getSize();
//                sumVolume += volCube;
                sumVolume += cube.volumeCube();
            }
            if (cube.getMaterial().equals("wood") && cube.getSize() == 3) {
                kWood++;
            }
        }
        System.out.println("k = " + k);
        System.out.println("sumVolume = " + sumVolume);
        System.out.println("kWood = " + kWood);
    }
}
