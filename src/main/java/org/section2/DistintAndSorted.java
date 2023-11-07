package org.section2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistintAndSorted {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,4,6, 10, 9);

        System.out.println(distinctAndSorted(integers));

    }

    private static List<Integer> distinctAndSorted(List<Integer> integers) {

        return integers.stream().distinct().sorted().collect(Collectors.toList());
    }


}
