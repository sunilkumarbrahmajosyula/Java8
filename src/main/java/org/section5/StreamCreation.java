package org.section5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {

        Stream.of(1,2,3,4);
        int[] intArray = {1,23,45,6};
        Arrays.stream(intArray);

       IntStream a = IntStream.range(1,10);
        IntStream b = IntStream.rangeClosed(1,10);
        IntStream.concat(a, b).forEach(System.out::println);

        System.out.println("Iterate");
       //iterate
        IntStream.iterate(2,e->e+2).limit(20).forEach(System.out::println);


        System.out.println("Boxed");
        //convert int to list
        System.out.println(IntStream.iterate(2,e->e+2).limit(20).boxed().collect(Collectors.toList()));


        System.out.println(IntStream.rangeClosed(1,50).reduce(1,(x,y)->x*y));

    }
}
