package org.section5;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        List<Score> scores = List.of(new Score(20, "AFG", "SUNIL", 1),
                new Score(30, "AFG", "SUNIL", 2),
                new Score(100, "AFG", "SUNIL", 3),
                new Score(20, "AFG", "sharanya", 3),
                new Score(40, "AFG", "sharanya", 2)
        );

        Predicate<Score> scorePredicate = score -> score.getScore() > 30;
        System.out.println(scores.stream().anyMatch(scorePredicate));
        System.out.println(scores.stream().allMatch(scorePredicate));
        System.out.println(scores.stream().noneMatch(scorePredicate));


        //get for match number 1 who scored highest
        //option1
        Optional<Score> score = scores.stream()
                .filter(s -> s.getMatchNumber() == 1)
                .reduce((s1, s2) -> {
                    if (s1.getScore() > s2.getScore()) {
                        return s1;
                    } else {
                        return s2;
                    }
                });
        System.out.println(score.get().getName());


        //option2
        String name = scores.stream()
                .filter(s -> s.getMatchNumber() == 1)
                .reduce((s1, s2) -> {
                    if (s1.getScore() > s2.getScore()) {
                        return s1;
                    } else {
                        return s2;
                    }
                }).map(s -> s.getName()).get();

        //option 3
        BinaryOperator<Score> scoreBinaryOperator = (s1, s2) -> {
            if (s1.getScore() > s2.getScore()) {
                return s1;
            } else {
                return s2;
            }
        };


        String nameWithBinaryOperator = scores.stream()
                .filter(s -> s.getMatchNumber() == 1)
                .reduce(scoreBinaryOperator).map(s -> s.getName()).get();
    }
}
