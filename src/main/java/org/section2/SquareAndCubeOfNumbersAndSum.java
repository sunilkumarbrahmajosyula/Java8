package org.section2;

import java.util.Arrays;
import java.util.List;

public class SquareAndCubeOfNumbersAndSum {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(squareOfNumbersAndSum(integers));
        System.out.println(cubeOfNumbersAndSum(integers));
    }

    private static Integer squareOfNumbersAndSum(List<Integer> integers) {

        return integers.stream().map(num-> SquareAndCubeOfNumbersAndSum.squareOfNums(num, 2)).reduce(0,(x, y)-> x+y);
    }

    private static int squareOfNums(int num, int power){
        return (int)Math.pow(num, power);
    }

    private static Integer cubeOfNumbersAndSum(List<Integer> integers) {

        return integers.stream().map(num-> SquareAndCubeOfNumbersAndSum.squareOfNums(num, 3)).reduce(0,(x, y)-> x+y);
    }
}
