package com.mamatha.ipl;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> players;
    private String battingCoachName;
    private String bowlingCoachName;
    private int totalNumberOfTrophies;
    private Player captain;

    public Player getCaptain() {
        return captain;
    }

    public void setCaptain(Player captain) {
        this.captain = captain;
    }

    public Player getViceCaptain() {
        return viceCaptain;
    }

    public void setViceCaptain(Player viceCaptain) {
        this.viceCaptain = viceCaptain;
    }

    private Player viceCaptain;

    public Team() {
        this.players = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players.addAll(players);
    }

    // if only one player to be added use this method
    public void addNewPlayer(Player player) {
        this.players.add(player);
    }

    public String getBattingCoachName() {
        return battingCoachName;
    }

    public void setBattingCoachName(String battingCoachName) {
        this.battingCoachName = battingCoachName;
    }

    public String getBowlingCoachName() {
        return bowlingCoachName;
    }

    public void setBowlingCoachName(String bowlingCoachName) {
        this.bowlingCoachName = bowlingCoachName;
    }

    public int getTotalNumberOfTrophies() {
        return totalNumberOfTrophies;
    }

    public void setTotalNumberOfTrophies(int totalNumberOfTrophies) {
        this.totalNumberOfTrophies = totalNumberOfTrophies;
    }


    public Player getPlayerWithMostRuns() {
        int highest = 0;
        Player mostRunsPlayer = null;
        for (Player player : players) {
            int totalruns = player.getTotalRuns();
            if (totalruns > highest) {
                highest = totalruns;
                mostRunsPlayer = player;
            }
        }
        return mostRunsPlayer;

    }
//this method checks for  the player with highest batting average in the team
    //
    public Player getPlayerWithHighestBattingAverage() {
        double playerHigestBattingAverage = 0;
        Player highestBattingAveragePlayer = null;
        for (Player player : players) {
            double playerBattingAvg = player.getBattingAvg();
            if (playerBattingAvg > playerHigestBattingAverage) {
                playerHigestBattingAverage = playerBattingAvg;
                highestBattingAveragePlayer = player;
            }

        }
        return highestBattingAveragePlayer;
    }

//this methods returns number of players in the team
    //if  there are no players it returns 0;
    //if player object is nul it returns 0
    public int getNumberOfPlayers() {
        if (players == null)
            return 0;
        else {
            int totalCount = players.size();
            return totalCount;
        }
    }
//This method checks for oldest player in the team
    //if players dob years are same then it checks for year and month
    //if year and month also same it checks for day
    //return Player object
    public Player getOldestPlayer() {

        int maxYears = 0, maxMonths = 0, maxDays = 0;
        Player oldestPlayer = null;
//Period oldest = null;
        LocalDate currentDate = LocalDate.now();
        for (Player player : players) {
            Period period = Period.between(player.getDateOfBirth(), currentDate);
            if (maxYears < period.getYears() ||
                    (period.getYears() == maxYears) && (maxMonths < period.getMonths()) ||
                    (period.getYears() == maxYears) && (period.getMonths() == maxMonths) && (maxDays < period.getDays())) {
                maxYears = period.getYears();
                maxMonths = period.getMonths();
                maxDays = period.getDays();
                oldestPlayer = player;
            }

        }
        return oldestPlayer;
    }


    public Player getOldestPlayerNew() {
        if (players == null)
            return null;
        int maxYears = 0, maxMonths = 0, maxDays = 0;
        Player oldestPlayer = null;

        LocalDate currentDate = LocalDate.now();
        for (Player player : players) {
            Period period = Period.between(player.getDateOfBirth(), currentDate);
            if (maxYears < period.getYears() ||
                    (period.getYears() == maxYears) && (maxMonths < period.getMonths()) || // if years are same then check months
                    (period.getYears() == maxYears) && (period.getMonths() == maxMonths) && (maxDays < period.getDays()))
            //if years and moths are same check with days
            {

                maxYears = period.getYears();
                maxMonths = period.getMonths();
                maxDays = period.getDays();
                oldestPlayer = player;
            }

        }
        return oldestPlayer;
    }

    //This method checks for youngest player in the team
    //if players dob years are same then it checks for year and month
    //if year and month also same it checks for day
    //return Player object
    public Player getYoungestPlayer() {

        int minYears = Integer.MAX_VALUE, minMonths = Integer.MAX_VALUE, minDays = Integer.MAX_VALUE;
        Player youngestPlayer = null;
        LocalDate currentDate = LocalDate.now();
        for (Player player : players) {
            Period period = Period.between(player.getDateOfBirth(), currentDate);
            if (minYears > period.getYears() ||
                    (period.getYears() == minYears) && (minMonths > period.getMonths()) ||
                    (period.getYears() == minYears) && (period.getMonths() == minMonths) && (minDays > period.getDays())) {
                minYears = period.getYears();
                minMonths = period.getMonths();
                minDays = period.getDays();
                youngestPlayer = player;
            }

        }
        return youngestPlayer;
    }


}
