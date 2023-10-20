package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class PrintCoursesWithSpecificString {
    public static void main(String[] args) {
        printCoursesWithSearchString(List.of("spring","hibernate","jpa","apachekafka","kubernetes","Java8"),"Java8");
    }

    private static void printCoursesWithSearchString(List<String> courses, String searchString) {
        courses.stream().filter(course -> course.equals(searchString)).peek(System.out::println).collect(Collectors.toList());
    }
}
