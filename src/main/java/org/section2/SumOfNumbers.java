package org.section2;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.concurrent.ThreadLocalRandom;

public class SumOfNumbers {
    public static void main(String[] args) {
        int[] ints =ThreadLocalRandom.current().ints(1,20).toArray();
        System.out.println(sumOfNumbers(ints));

    }

    private static OptionalInt sumOfNumbers(int[] ints) {
        return Arrays.stream(ints).reduce((a,b)-> a+b);
    }
}
