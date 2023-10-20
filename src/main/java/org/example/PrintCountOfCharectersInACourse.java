package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class PrintCountOfCharectersInACourse {
    public static void main(String[] args) {
        printCount(List.of("spring","hibernate","jpa","apachekafka","kubernetes","Java8"));
    }

    private static void printCount(List<String> courses) {
        courses.stream().peek(course-> {System.out.println(course.toCharArray().length);}).collect(Collectors.toList());

        courses.stream().forEach(course-> {System.out.println(course.toCharArray().length);});
    }
}
