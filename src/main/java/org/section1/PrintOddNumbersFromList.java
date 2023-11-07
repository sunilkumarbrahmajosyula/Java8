package org.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PrintOddNumbersFromList {

    public static void main(String[] args) {
        printOddNumbers(List.of(1,2,3,4,5,6,7,8,9,10));
    }

    private static void printOddNumbers(List<Integer> integers) {

        integers.stream().peek(integer -> System.out.println("Before filter: "+integer)).filter(integer -> integer%2 !=0)
                .peek(integer->System.out.println("Odd number: "+integer)).collect(Collectors.toList());
    }
}
