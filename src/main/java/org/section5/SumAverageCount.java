package org.section5;

import java.util.List;

public class SumAverageCount {
    public static void main(String[] args) {
        List<Score> scores = List.of(new Score(20, "AFG", "SUNIL", 1),
                new Score(30, "AFG", "SUNIL", 2),
                new Score(100, "AFG", "SUNIL", 3),
                new Score(20, "AFG", "sharanya", 3),
                new Score(40, "AFG", "sharanya", 2)
        );

        //sum
        System.out.println(scores.stream().mapToInt(score -> score.getScore()).sum());

        //average
        System.out.println(scores.stream().mapToInt(score -> score.getScore()).average());

        //count
        //average
        System.out.println(scores.stream().mapToInt(score -> score.getScore()).count());
    }


}
