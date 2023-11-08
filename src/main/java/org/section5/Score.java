package org.section5;


public class Score {
    public Score(int score, String team, String name, int matchNumber) {
        this.score = score;
        this.team = team;
        this.name = name;
        this.matchNumber = matchNumber;
    }

    private int score;
    private String team;

    private String name;

    private int matchNumber;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(int matchNumber) {
        this.matchNumber = matchNumber;
    }


    @Override
    public String toString() {
        return "Score{" +
                "score=" + score +
                ", team='" + team + '\'' +
                ", name='" + name + '\'' +
                ", matchNumber=" + matchNumber +
                '}';
    }



}
