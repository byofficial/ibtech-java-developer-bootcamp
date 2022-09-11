package com.ibtech.orm.relation.repository;

import com.ibtech.orm.relation.entity.Player;

public class PlayerRepository extends BaseRepository<Player> {
    public PlayerRepository() {
        super(Player.class);
    }
}
