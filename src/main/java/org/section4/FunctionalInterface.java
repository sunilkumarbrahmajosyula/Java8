package org.section4;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterface {

    public static void main(String[] args) {

        //map = Function
        List<Integer> integerList  = List.of(1,2,3,4,5,6);

        Function<Integer, Integer> squareOfNumber = x -> x*x;

        integerList.stream().map(squareOfNumber).collect(Collectors.toList());


        //filter Predicate
        Predicate<String> stringPredicate = x-> x.startsWith("S");
        Predicate<Integer> evenPredicate = x->x%2==0;
        integerList.stream().filter(evenPredicate).collect(Collectors.toList());

        //reduce BinaryOperator
        BinaryOperator<Integer> integerBinaryOperator = (x, y) -> x + y;
        integerList.stream().reduce(0, integerBinaryOperator);

        //foreach consumer

        Consumer<Integer> print = System.out::println;
        integerList.stream().forEach(print);


    }
}
