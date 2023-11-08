package org.section5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedAndComparator {
    public static void main(String[] args) {

        //get sorted scores
        List<Score> scores = List.of(new Score(20, "AFG", "SUNIL", 1),
                new Score(30, "AFG", "SUNIL", 2),
                new Score(100, "AFG", "SUNIL", 3),
                new Score(20, "AFG", "sharanya", 3),
                new Score(40, "AFG", "sharanya", 2)
        );

        Comparator<Score> scoreComparator = Comparator.comparing(Score::getScore).thenComparing(Score::getMatchNumber).reversed();
        System.out.println(scores.stream().sorted(scoreComparator).collect(Collectors.toList()));
    }
}
