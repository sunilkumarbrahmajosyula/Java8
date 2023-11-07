package org.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PrintAllCourses {
    public static void main(String[] args) {
        printAllCourses(List.of("spring","hibernate","jpa","apachekafka","kubernetes","Java8"));
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream().peek(System.out::println).collect(Collectors.toList());
    }
}
