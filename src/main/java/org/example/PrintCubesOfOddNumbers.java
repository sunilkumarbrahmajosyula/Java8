package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class PrintCubesOfOddNumbers {
    public static void main(String[] args) {
        printCubesOfOddNumbers(List.of(1,2,3,4,5,6,7,8,9,10));
    }

    private static void printCubesOfOddNumbers(List<Integer> integers) {
        integers.stream().peek(n -> System.out.println("Number: "+n)).filter(n-> n%2!=0)
                .peek(n-> System.out.println("Odd numbers: "+n)).map(PrintCubesOfOddNumbers::cubeOfANumber).peek(n-> System.out.println("Odd Cubes: "+n)).collect(Collectors.toList());

    }

    private static boolean isOdd(int number){
        return number%2!=0;
    }

    private static Integer cubeOfANumber(int n){
        return (int)Math.pow(n,3);
    }


}
