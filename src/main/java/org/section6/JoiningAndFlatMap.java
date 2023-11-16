package org.section6;

import org.section5.Score;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JoiningAndFlatMap {
    public static void main(String[] args) {

        List<Score> scores = List.of(new Score(20, "AFG", "SUNIL", 1),
                new Score(30, "AFG", "SUNIL", 2),
                new Score(100, "AFG", "SUNIL", 3),
                new Score(20, "AFG", "sharanya", 3),
                new Score(40, "AFG", "sharanya", 2)
        );

        //get all the letters from name

        String allNames = scores.stream()
                .map(Score::getName)
                .peek(System.out::println)
                .collect(Collectors.joining(","));

        Set<Character> uniqueLetters = allNames.chars()
                .peek(System.out::println)
                .mapToObj(c -> (char) c)
                .peek(System.out::println)
                .collect(Collectors.toSet());




        //save the letters into set
        //seperate with comma

           }
}
