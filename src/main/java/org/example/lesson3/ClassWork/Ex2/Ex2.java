package org.example.lesson3.ClassWork.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Student> students = create();
        for (Student student : students) {
            int sumMarks = 0;
            for (int mark : student.getMarks()) {
                sumMarks += mark;
            }
            if (student.getSurname().endsWith("ова") && sumMarks % 2 == 0) {
                System.out.println(student.getSalary());
            }
        }
    }

    public static List<Student> create() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иванов", 1, 10000, List.of(3, 4, 3)));
        students.add(new Student("Гаврилов", 2, 30000, List.of(5, 5, 5)));
        students.add(new Student("Гаврилов", 3, 5000, List.of(2, 3, 3)));
        students.add(new Student("Матросов", 4, 20000, List.of(4, 4, 5)));
        students.add(new Student("Спорова", 1, 15000, List.of(4, 4, 4)));
        return students;
    }
}