package org.section4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceImplementation {
    public static void main(String[] args) {
        List<Integer> integerNumbers = Arrays.asList(1,2,3,45,6,7,8);

       System.out.println(numeberSum(integerNumbers));
    }

    private static int numeberSum(List<Integer> integerNumbers) {


        BinaryOperator<Integer> integerBinaryOperator = (x, y) -> x * y;
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                return x * y;
            }
        };

        return integerNumbers.stream().reduce(2, binaryOperator);


    }
}
