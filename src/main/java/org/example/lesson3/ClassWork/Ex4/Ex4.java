package org.example.lesson3.ClassWork.Ex4;

import org.example.lesson3.ClassWork.Ex3.Cube;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Ex4 {
    //    4.	 Напишите метод, который на вход получает коллекцию объектов,
    //    а возвращает коллекцию уже без дубликатов.
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "red", "wood");
        Cube cube2 = new Cube(4, "yellow", "iron");
        Cube cube3 = new Cube(5, "green", "wood");
        Cube cube4 = new Cube(10, "red", "carton");
        Cube cube5 = new Cube(3, "red", "wood");
        Cube cube6 = new Cube(4, "yellow", "iron");
        Cube cube7 = new Cube(5, "green", "wood");
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

        System.out.println("unicCollection(cubeList) = " + unicCollection(cubeList)); // получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
    }

    private static Collection unicCollection(List<Cube> cubeList) {
        return new HashSet(cubeList);
    }

}
