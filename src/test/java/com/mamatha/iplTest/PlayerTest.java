package com.mamatha.iplTest;

import com.mamatha.ipl.Player;
import com.mamatha.ipl.Statistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PlayerTest {

    //        privat oid
//        Player  msd = new Player("MS Dhoni", LocalDate.of(1983,5,22));
//        msd.setPlayerType("Batsmen/WicketKeeper");
    @Test
    public void getTotalRunsTest() {
        Player msd = new Player("MS Dhoni", LocalDate.of(1983, 5, 22));
        Statistics msdStatistics = new Statistics();
        msdStatistics.setTotalScore(350);
        msd.setPlayerStatics(msdStatistics);
        int expected = 350;
        int result = msd.getTotalRuns();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getTotalRunsWhenStaticsIsNull() {
        Player ruthu = new Player("Ruthuraj Gaikwad", LocalDate.of(1996, 7, 17));
        int expected = 0;
        int result = ruthu.getTotalRuns();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getBattingAverageTest() {
        Player robin = new Player("RobinUthappa", LocalDate.of(1989, 11, 15));
        Statistics robinStatistics = new Statistics();
        robinStatistics.setTotalScore(400);
        robinStatistics.setmatchInningsPlayed(4);
        robin.setPlayerStatics(robinStatistics);
        double expected = 100.0;
        double result = robin.getBattingAvg();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getBattingAverageIfNumberOfInningsPlayedZeroTest() {
        Player robin = new Player("RobinUthappa", LocalDate.of(1989, 11, 15));
        Statistics robinStatistics = new Statistics();
        robinStatistics.setTotalScore(400);
        robinStatistics.setmatchInningsPlayed(0);
        robin.setPlayerStatics(robinStatistics);
        double expected = 0.0;
        double result = robin.getBattingAvg();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void getBattingAverageWhenStatisticsIsNull() {
        Player robin = new Player("RobinUthappa", LocalDate.of(1989, 11, 15));
        double expected = 0.0;
        double result = robin.getBattingAvg();
        Assertions.assertEquals(expected, result);
    }
}
