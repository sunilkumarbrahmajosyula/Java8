package org.section5;

import java.util.Comparator;
import java.util.List;

public class MinMaxFindFirstFindAny {
    public static void main(String[] args) {
        List<Score> scores = List.of(new Score(20, "AFG", "SUNIL", 1),
                new Score(30, "AFG", "SUNIL", 2),
                new Score(100, "AFG", "SUNIL", 3),
                new Score(20, "AFG", "sharanya", 3),
                new Score(40, "AFG", "sharanya", 2)
        );

        //Min
        Comparator<Score> scoreComparator = Comparator.comparing(Score::getScore).reversed();
        System.out.println(scores.stream().min(scoreComparator).get());

        //Max
        System.out.println(scores.stream().max(scoreComparator).get());

        //findFirst
        System.out.println(scores.stream().sorted(scoreComparator).findFirst().get());


        //find any
        //findFirst
        System.out.println(scores.stream().sorted(scoreComparator).findAny().get());
    }
}
