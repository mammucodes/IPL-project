package com.mamatha.iplTest;

import com.mamatha.ipl.Player;
import com.mamatha.ipl.Statistics;
import com.mamatha.ipl.Team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class TeamTest {
    @Test
    public void getPlayerWithMostRunsTest() {

        // create team object
        //create list of player object
        //add 3 players msd(500), rayudu(600), raina(400) to the team
        //expected rayudu player object
        //call getPlayerWithMostRuns for the team and catch the result
        //Assert if result is equal to the expected

        Team csk = new Team();
        List<Player> cskTeamPlayers = new ArrayList<>();
        Player msd = new Player("MS Dhoni", LocalDate.of(1983, 5, 22));
        Statistics msdStatistics = new Statistics();
        msdStatistics.setTotalScore(1500);
        //msdStatistics.setmatchInningsPlayed(5); // bavg 300;
        msd.setPlayerStatics(msdStatistics);

        cskTeamPlayers.add(msd);

        //  csk.addNewPlayer(msd); // if only one player to be added use this

        Player ruthu = new Player("Ruthuraj Gaikwad", LocalDate.of(1996, 7, 17));
        Statistics ruthuStatistics = new Statistics();
        ruthuStatistics.setTotalScore(200);
      //  ruthuStatistics.setmatchInningsPlayed(2); // 100
        ruthu.setPlayerStatics(ruthuStatistics);
        cskTeamPlayers.add(ruthu);


        Player robin = new Player("RobinUthappa", LocalDate.of(1989, 11, 15));
        Statistics robinStatistics = new Statistics();
        robinStatistics.setTotalScore(600);
        //robinStatistics.setmatchInningsPlayed(3); // avg   ; 200
        robin.setPlayerStatics(robinStatistics);
        cskTeamPlayers.add(robin);


        Player raina = new Player("SureshRaina", LocalDate.of(1990, 6, 10));
        Statistics rainaStatics = new Statistics();
        rainaStatics.setTotalScore(1600);
       // rainaStatics.setmatchInningsPlayed(3); // avg  400
        raina.setPlayerStatics(rainaStatics);
        cskTeamPlayers.add(raina);

        csk.setPlayers(cskTeamPlayers); // adding all players to the list

        Player excpected = raina;
        Player result = csk.getPlayerWithMostRuns();
        Assertions.assertEquals(excpected, result);

    }
    @Test
    public void getPlayerWithHighestBattingAverage(){

        Team csk = new Team();
        List<Player> cskTeamPlayers = new ArrayList<>();
        Player msd = new Player("MS Dhoni", LocalDate.of(1983, 5, 22));
        Statistics msdStatistics = new Statistics();
        msdStatistics.setTotalScore(1500);
        msdStatistics.setmatchInningsPlayed(5); // bavg 300;
        msd.setPlayerStatics(msdStatistics);

        cskTeamPlayers.add(msd);

        //  csk.addNewPlayer(msd); // if only one player to be added use this

        Player ruthu = new Player("Ruthuraj Gaikwad", LocalDate.of(1996, 7, 17));
        Statistics ruthuStatistics = new Statistics();
        ruthuStatistics.setTotalScore(200);
        ruthuStatistics.setmatchInningsPlayed(2); // avg 100
        ruthu.setPlayerStatics(ruthuStatistics);
        cskTeamPlayers.add(ruthu);


        Player robin = new Player("RobinUthappa", LocalDate.of(1989, 11, 15));
        Statistics robinStatistics = new Statistics();
        robinStatistics.setTotalScore(600);
        robinStatistics.setmatchInningsPlayed(3); // avg   ; 200
        robin.setPlayerStatics(robinStatistics);
        cskTeamPlayers.add(robin);


        Player raina = new Player("SureshRaina", LocalDate.of(1990, 6, 10));
        Statistics rainaStatics = new Statistics();
        rainaStatics.setTotalScore(1200);
        rainaStatics.setmatchInningsPlayed(3); // avg  400
        raina.setPlayerStatics(rainaStatics);
        cskTeamPlayers.add(raina);

        csk.setPlayers(cskTeamPlayers); // adding all players to the list

        Player excpected = raina;
        Player result = csk.getPlayerWithHighestBattingAverage();
        Assertions.assertEquals(excpected, result);


    }

    @Test
    public void getTotalPlayersCountTest() {
        Team csk = new Team();
        List<Player> cskTeamPlayers = new ArrayList<>();

        Player msd = new Player("MS Dhoni", LocalDate.of(1983, 5, 22));
        cskTeamPlayers.add(msd);
        Player raina = new Player("SureshRaina", LocalDate.of(1990, 6, 10));
        cskTeamPlayers.add(raina);
        Player robin = new Player("RobinUthappa", LocalDate.of(1989, 11, 15));
        cskTeamPlayers.add(robin);
        Player ruthu = new Player("Ruthuraj Gaikwad", LocalDate.of(1996, 7, 17));
        cskTeamPlayers.add(ruthu);
        csk.setPlayers(cskTeamPlayers);
        int expected = 4;
        int result = csk.getNumberOfPlayers();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getTotalPlayersCountTestWhenPlayerObjectIsNull() {
        Team csk = new Team();
        int expected = 0;
        int result = csk.getNumberOfPlayers();
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void testPreiod() {

        LocalDate riyaDOB = LocalDate.of(2014, 01, 18);
        //expected 5 years

        Period age = Period.between(riyaDOB, LocalDate.now());

        System.out.println("age: " + age);

        System.out.println("age years: " + age.getYears());

        System.out.println("age months " + age.getMonths());

        System.out.println("age days " + age.getDays());

    }

    @Test
            //test player with old age
    public void getOldestPlayerTestWhenYearMonthANdDateDifferent() {
        Team csk = new Team();
        List<Player> cskPlayers = new ArrayList<>();
        Player msd = new Player("MS Dhoni", LocalDate.of(2014, 1, 8));
        cskPlayers.add(msd);
        Player raina = new Player("SureshRaina", LocalDate.of(2015, 2, 10));
        cskPlayers.add(raina);
        Player robin = new Player("RobinUthappa", LocalDate.of(2016, 1, 30));
        cskPlayers.add(robin);
        csk.setPlayers(cskPlayers);
        Player expected = msd;
        Player result = csk.getOldestPlayer();
        Assertions.assertEquals(expected, result);
    }

    @Test
    //test when year is same but different months
    public void getOldestPlayerTestWhenYearIsSame() {
        Team csk = new Team();
        List<Player> cskPlayers = new ArrayList<>();
        Player msd = new Player("MS Dhoni", LocalDate.of(2014, 2, 8));
        cskPlayers.add(msd);
        Player raina = new Player("SureshRaina", LocalDate.of(2014, 2, 10));
        cskPlayers.add(raina);
        Player robin = new Player("RobinUthappa", LocalDate.of(2014, 1, 30));
        cskPlayers.add(robin);
        csk.setPlayers(cskPlayers);
        Player expected = robin;
        Player result = csk.getOldestPlayer();
        Assertions.assertEquals(expected, result);
    }
    @Test
    //test when year and month are same
    public void getOldestPlayerTestWhenPlayerHasSameDOB() {
        Team csk = new Team();
        List<Player> cskPlayers = new ArrayList<>();
        Player msd = new Player("MS Dhoni", LocalDate.of(2014, 1, 8));
        cskPlayers.add(msd);
        Player raina = new Player("SureshRaina", LocalDate.of(2014, 1, 7));
        cskPlayers.add(raina);
        Player robin = new Player("RobinUthappa", LocalDate.of(2014, 1, 30));
        cskPlayers.add(robin);
        csk.setPlayers(cskPlayers);
        Player expected = raina;
        Player result = csk.getOldestPlayer();
        Assertions.assertEquals(expected, result);
    }
    @Test
    //test when year,month and date are same
    public void getOldestPlayerTestWhenYearAndMonthAndDateSame() {
        Team csk = new Team();
        List<Player> cskPlayers = new ArrayList<>();
        Player msd = new Player("MS Dhoni", LocalDate.of(2014, 1, 10));
        cskPlayers.add(msd);
        Player raina = new Player("SureshRaina", LocalDate.of(2014, 1, 10));
        cskPlayers.add(raina);
        Player robin = new Player("RobinUthappa", LocalDate.of(2014, 1, 10));
        cskPlayers.add(robin);
        csk.setPlayers(cskPlayers);
        Player expected = msd;
        Player result = csk.getOldestPlayer();
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void getOldestPlayerAgeWhenNoPlayers() {
        Team csk = new Team();
        List<Player> cskPlayers = new ArrayList<>();
        Player expected = null;
        Player result = csk.getOldestPlayer();
        Assertions.assertEquals(expected, result);

    }
    //==========All possible Test cases for youngest player============
    @Test
            //it returns player with young age here robin is youngest among three
    public void getYoungestPlayerTestWhenYearMonthAndDateDifferent() {
        Team csk = new Team();
        List<Player> cskPlayers = new ArrayList<>();
        Player msd = new Player("MS Dhoni", LocalDate.of(2014, 1, 18));
        cskPlayers.add(msd);
        Player raina = new Player("SureshRaina", LocalDate.of(2016, 1, 10));
        cskPlayers.add(raina);
        Player robin = new Player("RobinUthappa", LocalDate.of(2018, 1, 25));
        cskPlayers.add(robin);
        csk.setPlayers(cskPlayers);
        Player expected = robin;
        Player result = csk.getYoungestPlayer();
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void getYoungestPlayerTestWhenYearIsSame() {
        Team csk = new Team();
        List<Player> cskPlayers = new ArrayList<>();
        Player msd = new Player("MS Dhoni", LocalDate.of(2014, 1, 02)); //9 years 11 mohr
        cskPlayers.add(msd);
        Player raina = new Player("SureshRaina", LocalDate.of(2014, 4, 10));
        cskPlayers.add(raina);
        Player robin = new Player("RobinUthappa", LocalDate.of(2014, 3, 25));
        cskPlayers.add(robin);
        csk.setPlayers(cskPlayers);
        Player expected = raina;
        Player result = csk.getYoungestPlayer();
        Assertions.assertEquals(expected, result);
    }


    //This test if both year and month are same
    //returns youngest player
    @Test
    public void getYoungestPlayerTestWhenMonthYearSame() {
        Team csk = new Team();
        List<Player> cskPlayers = new ArrayList<>();
        Player msd = new Player("MS Dhoni", LocalDate.of(2014, 1, 18)); //10 year 0 m 7 days
        cskPlayers.add(msd);
        Player raina = new Player("SureshRaina", LocalDate.of(2014, 1, 12)); //10 years 0 month 1 days
        cskPlayers.add(raina);
        Player robin = new Player("RobinUthappa", LocalDate.of(2014, 1, 25)); //
        cskPlayers.add(robin);
        csk.setPlayers(cskPlayers);
        Player expected = robin;
        Player result = csk.getYoungestPlayer();
        Assertions.assertEquals(expected, result);
    }

    @Test
    //when all are year , month, date are same it returns first player from the list
    public void getYoungestPlayerTestWhenMonthYearDateSame() {
        Team csk = new Team();
        List<Player> cskPlayers = new ArrayList<>();
        Player msd = new Player("MS Dhoni", LocalDate.of(2014, 1, 10));
        cskPlayers.add(msd);
        Player raina = new Player("SureshRaina", LocalDate.of(2014, 1, 10));
        cskPlayers.add(raina);
        Player robin = new Player("RobinUthappa", LocalDate.of(2014, 1, 10));
        cskPlayers.add(robin);
        csk.setPlayers(cskPlayers);
        Player expected = msd;
        Player result = csk.getYoungestPlayer();
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void getYoungestPlayerAgeWhenNoPlayers() {
        Team csk = new Team();
        //The below code is tested for  understanding  if players are set to the team and if players are zero
//        List<Player> cskPlayers = new ArrayList<>();
//        csk.setPlayers(cskPlayers);
//        int  expectedSize = 0 ;
//       List<Player> result =  csk.getPlayers();
//       int resultSize= result.size();
//        Assertions.assertEquals(expectedSize, resultSize);


        Player expected = null;
        Player result = csk.getYoungestPlayer();
        Assertions.assertEquals(expected, result);


    }
}