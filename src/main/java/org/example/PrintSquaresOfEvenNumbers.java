package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class PrintSquaresOfEvenNumbers {
    public static void main(String[] args) {

        printSquaresOfTheEvenNumbers(List.of(1,2,3,4,5,6,7,8,9,10));
    }

    private static void printSquaresOfTheEvenNumbers(List<Integer> integers) {

       //integers.stream().filter(integer -> integer%2 ==0).peek(number -> System.out.println("Even number: "+number)).map(number -> number * number).peek(System.out::println).collect(Collectors.toList());

        integers.stream().filter(PrintSquaresOfEvenNumbers::isEven).peek(number -> System.out.println("Even number: "+number)).map(PrintSquaresOfEvenNumbers::cubeOfANumber).peek(System.out::println).collect(Collectors.toList());

    }

    private static boolean isEven(int number){
        return  number%2 ==0;
    }

    private static Integer cubeOfANumber(int number){
        return  number*number*number;
    }
}
