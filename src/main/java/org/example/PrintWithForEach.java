package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class PrintWithForEach {
    public static void main(String[] args) {
        printListOfElements(List.of(1, 2, 3, 4, 5, 6));
        printListOfElementsWithPeek(List.of(1, 2, 3, 4, 5, 6));
    }

    private static void printListOfElements(List<Integer> integers) {
        integers.stream().forEach(PrintWithForEach::print);
    }

    private static void print(int number) {
        System.out.println(number);
    }

        private static void printListOfElementsWithPeek(List<Integer> integers) {
            System.out.println("With peek");
            List<Integer> evenNumbers = integers.stream()
                    .peek(s-> { System.out.println("before:"+s);}) // for debugging purposes
                    .filter(number -> number % 2 == 0)
                    .peek(s-> { System.out.println("after:"+s);}) // for debugging purposes
                    .collect(Collectors.toList());

           // evenNumbers.stream().forEach(PrintWithForEach::print);
        }

}