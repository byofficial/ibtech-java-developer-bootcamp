package com.ibtech.orm.relation.example;

import com.ibtech.orm.relation.entity.Player;
import com.ibtech.orm.relation.repository.PlayerRepository;

public class PlayerList {
    public static void main(String[] args) {
        PlayerRepository playerRepository = new PlayerRepository();

        for (Player player : playerRepository.list()) {
            System.out.println(player.getPlayerId() + " "
                    + player.getPlayerName() + " "
                    + player.getAverageScore());
        }
    }
}
