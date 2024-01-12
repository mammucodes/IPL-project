package com.mamatha.ipl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Raju", LocalDate.of(1989, 7, 25));

        Statistics st1 = new Statistics();

        player1.setPlayerStatics(st1);

        Team cskTem  = new Team();
        cskTem.setTeamName("CHENNAI SUPER KINGS");
       List<Player> cskPlayers = new ArrayList<>();
        Player msDhono = new Player("MAHI", LocalDate.of(1986, 5, 24));
        cskPlayers.add(msDhono);

        cskTem.setPlayers(cskPlayers);

        Player rayudu = new Player("Ambati Rayadu",LocalDate.of(1989,6,30));
        cskTem.addNewPlayer(rayudu);

        Player raine = new Player("Raina",LocalDate.of(1989,6,30));
        cskTem.addNewPlayer(raine);

        List<Player> players = cskTem.getPlayers();
        players.forEach(System.out::println);

        //cskTem.getPlayerWithHighestRuns()





    }
}
