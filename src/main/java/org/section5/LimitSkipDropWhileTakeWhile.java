package org.section5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkipDropWhileTakeWhile {
    public static void main(String[] args) {
        List<Score> scores = List.of(new Score(20, "AFG", "SUNIL", 1),
                new Score(30, "AFG", "SUNIL", 2),
                new Score(100, "AFG", "SUNIL", 3),
                new Score(20, "AFG", "sharanya", 3),
                new Score(40, "AFG", "sharanya", 2)
        );

        Comparator<Score> scoreComparator = Comparator.comparing(score -> score.getScore());
        scoreComparator = scoreComparator.thenComparing(score -> score.getMatchNumber()).reversed();
       //limit, skip, comparing
        System.out.println(scores.stream().limit(3).sorted(scoreComparator).skip(1).collect(Collectors.toList()));

        //takeWhile
        //take records while condition met
        System.out.println(scores.stream().limit(3)
                .sorted(scoreComparator).takeWhile(score -> score.getScore()>30).collect(Collectors.toList()));

        //dropWhile
        //drop records while condition met
        System.out.println(scores.stream()
                .sorted(scoreComparator).dropWhile(score -> score.getScore()>30).collect(Collectors.toList()));


    }
}
