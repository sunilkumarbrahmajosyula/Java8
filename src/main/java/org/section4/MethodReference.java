package org.section4;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MethodReference {
    public static void main(String[] args) {

        //constructor method reference
        List<String> courses = List.of("kubernetes","docker","apachekafka", "java8");

        //
        courses.stream().map(String::toUpperCase).collect(Collectors.toList());


        Supplier<String> supplier = String::new;


    }
}
