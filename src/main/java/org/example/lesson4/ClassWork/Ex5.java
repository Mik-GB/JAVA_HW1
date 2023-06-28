package org.example.lesson4.ClassWork;

import java.util.Stack;
import java.util.StringJoiner;

public class Ex5 {
    public static void main(String[] args) {
//        Если задана строка path, представляющая собой абсолютный путь (начинающийся с косой черты '/')
//        к файлу или каталогу в файловой системе в стиле Unix, преобразуйте ее в упрощенный канонический путь .
//
//        В файловой системе в стиле Unix точка '.'относится к текущему каталогу, двойная точка '..'
//        относится к каталогу на более высокий уровень, а любые несколько последовательных косых черт
//        (например, '//') рассматриваются как одна косая черта '/'. Для этой проблемы любой другой формат
//        точек, например, '...'рассматривается как имя файла/каталога.
//
//        Канонический путь должен иметь следующий формат:
//          Путь начинается с одной косой черты '/'.
//          Любые два каталога разделяются косой чертой '/'.
//          Путь не заканчивается трейлингом '/'.
//          Путь содержит только каталоги на пути от корневого каталога к целевому файлу или каталогу
//          (т. е. без точки '.'или двойной точки '..').
//
//        Вернуть упрощенный канонический путь .
        System.out.println("simplefyPath() = " + simplifyPath("/home/"));
        System.out.println("simplefyPath() = " + simplifyPath("/../"));
        System.out.println("simplefyPath() = " + simplifyPath("/home//foo/"));
    }
    public static String simplifyPath (String path){
        Stack<String> stack = new Stack();
        StringJoiner res = new StringJoiner("/");
        String[] subPath = path.split("/");
        for (String s: subPath) {
            if ("..".equals(s)){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else if (!".".equals(s) && !s.isEmpty()){
                stack.push(s);
            }
            if (stack.isEmpty()) return "/";
            while (!stack.isEmpty()){
                res.add(stack.pop());
            }
        }
        return "/" + res;
    }
}
