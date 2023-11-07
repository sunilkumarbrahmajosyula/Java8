package org.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PrintCoursesWithAtleast4Letters {
    public static void main(String[] args) {
        printCoursesWithAtleast4letters(List.of("spring", "hibernate", "jpa", "apachekafka", "kubernetes", "Java8"));
        printCoursesWithAtleastCount(List.of("spring", "hibernate", "jpa", "apachekafka", "kubernetes", "Java8"), 5);
    }

    private static boolean isCharCountGreaterThan4(String string) {
        return string.toCharArray().length > 4;
    }

    private static boolean isCharCountGreaterThan4(String string, int count) {
        return string.toCharArray().length > count;
    }


    private static void printCoursesWithAtleast4letters(List<String> courses) {
        courses.stream().filter(PrintCoursesWithAtleast4Letters::isCharCountGreaterThan4).peek(System.out::println).collect(Collectors.toList());
    }

    private static void printCoursesWithAtleastCount(List<String> courses,int count) {
        courses.stream().filter( course -> PrintCoursesWithAtleast4Letters.isCharCountGreaterThan4(course,count)).peek(System.out::println).collect(Collectors.toList());
    }
}
