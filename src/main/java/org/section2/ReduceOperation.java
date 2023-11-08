package org.section2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ReduceOperation {
    public static void main(String[] args) {


        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        System.out.println(sumOfAllNumbers(integerList));
    }

    private static int sumOfAllNumbers(List<Integer> integerList) {
        return integerList.stream().reduce(0,Integer::sum);
        //return integerList.stream().reduce(0,(x,y)->x+y);
    }


}
