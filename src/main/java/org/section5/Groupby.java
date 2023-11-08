package org.section5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Groupby {
    public static void main(String[] args) {

        List<Score> scores = List.of(new Score(20, "AFG", "SUNIL", 1),
                new Score(30, "AFG", "SUNIL", 2),
                new Score(100, "AFG", "SUNIL", 3),
                new Score(20, "AFG", "sharanya", 3),
                new Score(40, "AFG", "sharanya", 2)
        );

        System.out.println(scores.stream().collect(Collectors.groupingBy(Score::getMatchNumber)));

        System.out.println(scores.stream().collect(Collectors.groupingBy(Score::getMatchNumber,
                Collectors.maxBy(Comparator.comparing(Score::getScore)))));

        System.out.println(scores.stream().collect(Collectors.groupingBy(Score::getMatchNumber,
                Collectors.minBy(Comparator.comparing(Score::getScore)))));

        System.out.println(scores.stream().collect(Collectors.groupingBy(Score::getMatchNumber,
                Collectors.mapping(Score::getName, Collectors.toList()))));
    }
}
