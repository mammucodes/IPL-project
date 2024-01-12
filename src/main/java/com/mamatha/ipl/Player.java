package com.mamatha.ipl;

import java.time.LocalDate;
import java.util.List;

public class Player {
    private String name;
    private LocalDate dateOfBirth;
    private String playerType;
    private Team currentTeam;
    private List<Team> teamsPlayed;
    private Statistics playerStatics;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Player(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPlayerType() {
        return playerType;
    }

    public Team getCurrentTeam() {
        return currentTeam;
    }

    public List<Team> getTeamsPlayed() {
        return teamsPlayed;
    }

    public Statistics getPlayerStatics() {
        return playerStatics;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public void setCurrentTeam(Team currentTeam) {
        this.currentTeam = currentTeam;
    }

    public void setTeamsPlayed(List<Team> teamsPlayed) {
        this.teamsPlayed = teamsPlayed;
    }

    public void setPlayerStatics(Statistics playerStatics) {
        this.playerStatics = playerStatics;
    }

    ////////////////////////

    //if this player has no statistics, 0 is returned
    public int getTotalRuns() {
        if (this.playerStatics == null)
            return 0;
        return this.playerStatics.getTotalScore();
    }
//if playerstatics is null (object not created) then average returned as 0
    //if number of innings played is 0 average is returned as 0;
    public double getBattingAvg() {
        if(playerStatics==null){
            return 0.0;
        }
        if (playerStatics.getMatchInningsPlayed() == 0)
            return 0.0;
        else {
            double battingAverage = playerStatics.getTotalScore() / playerStatics.getMatchInningsPlayed();
            return battingAverage;
        }
    }

    public double getBowlingAvg() {
        double bowlingAverage = playerStatics.getTotalWickets();
        return 0.0;
    }

    public int getTotalWickets() {
        return playerStatics.getTotalWickets();
    }

    public double getBowlingEconomy() {
        return 0.0;
    }

    public double getBattingStrikeRate() {
        //need total numbers of runs and total no of balls played
        return 0.0;
    }

    public int getTotalManOfMatcheAwardsInSeason() {
        return playerStatics.getTotalManOfTheMatches();
    }

    public int getTotalManOfTheSeriesInIPL() {
        return playerStatics.getTotalManOfTheSeries();
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", playerType='" + playerType + '\'' +
                ", currentTeam=" + currentTeam +
                ", teamsPlayed=" + teamsPlayed +
                ", playerStatics=" + playerStatics +
                ", salary=" + salary +
                '}';
    }
}
