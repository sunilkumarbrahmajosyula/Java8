package org.section4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapMethodParameterization {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,45,6,7,8);
        List<Integer> square = squareOfNumbers(integerList);
    }

    private static List<Integer> squareOfNumbers(List<Integer> integerList) {
        Function<Integer, Integer> integerFunction = x -> (int) Math.pow(x,2);
        return integerList.stream().map(integerFunction).collect(Collectors.toList());
    }

}
