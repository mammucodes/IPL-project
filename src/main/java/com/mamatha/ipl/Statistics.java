package com.mamatha.ipl;

import java.util.List;

public class Statistics {
   private  int totalScore;
  private   int totalWickets;
  private   int  matchInningsPlayed;
  private   int totalManOfTheMatches;
  private int totalManOfTheSeries;

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }

    public int getMatchInningsPlayed() {
        return matchInningsPlayed;
    }

    public void setmatchInningsPlayed(int matchInningsPlayed) {

        this.matchInningsPlayed = matchInningsPlayed;
    }

    public int getTotalManOfTheMatches() {
        return totalManOfTheMatches;
    }

    public void setTotalManOfTheMatches(int totalManOfTheMatches) {
        this.totalManOfTheMatches = totalManOfTheMatches;
    }

    public int getTotalManOfTheSeries() {
        return totalManOfTheSeries;
    }

    public void setTotalManOfTheSeries(int totalManOfTheSeries) {
        this.totalManOfTheSeries = totalManOfTheSeries;
    }
}
