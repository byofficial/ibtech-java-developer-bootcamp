package com.ibtech.orm.relation.example;

import com.ibtech.orm.relation.entity.Player;
import com.ibtech.orm.relation.entity.Team;
import com.ibtech.orm.relation.repository.PlayerRepository;
import com.ibtech.orm.relation.repository.TeamRepository;

public class PlayerInsert {
    public static void main(String[] args) {
        long teamId = 2;
        TeamRepository teamRepository = new TeamRepository();
        Team team = teamRepository.find(teamId);

        Player player = new Player(0, "Celal Güzelses", 4.7);
        player.setTeam(team);

        PlayerRepository playerRepository = new PlayerRepository();
        playerRepository.insert(player);

        System.out.println("Sokuldu: " + player.getPlayerId());
    }
}
