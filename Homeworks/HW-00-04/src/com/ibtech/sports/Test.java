package com.ibtech.sports;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        League leagueA = new League(601, "Süper Lig");
        leagueA.setTeamList(new ArrayList<>());

        Team teamA = new Team(801, "Godoro Spor");
        teamA.setPlayerList(new ArrayList<>());
        leagueA.getTeamList().add(teamA);

        Team teamB = new Team(802, "Fibiler Spor");
        teamB.setPlayerList(new ArrayList<>());
        leagueA.getTeamList().add(teamB);


        Player player1 = new Player(401, "Teoman Alpay", 4.67);
        player1.setTeam(teamA);
        teamA.getPlayerList().add(player1);

        Player player2 = new Player(402, "Yusuf Nalkesen", 7.89);
        player2.setTeam(teamA);
        teamA.getPlayerList().add(player2);

        Player player3 = new Player(403, "Yıldırım Gürses", 2.93);
        player3.setTeam(teamB);
        teamB.getPlayerList().add(player3);

        Player player4 = new Player(404, "Avni Anıl", 6.61);
        player4.setTeam(teamA);
        teamA.getPlayerList().add(player4);

        Player player5 = new Player(405, "Erdoğan Berker", 8.11);
        player5.setTeam(teamB);
        teamB.getPlayerList().add(player5);

        System.out.println(leagueA.getLeagueId() + " " + leagueA.getLeagueName());

        for (Team team : leagueA.getTeamList()) {
            System.out.println("\t" + team.getTeamId() + " " + team.getTeamName());

            for (Player player : team.getPlayerList()) {
                System.out.println("\t\t" + player.getPlayerId() + " "
                        + player.getPlayerName() + " "
                        + player.getAverageScore());
            }
        }
    }
}
