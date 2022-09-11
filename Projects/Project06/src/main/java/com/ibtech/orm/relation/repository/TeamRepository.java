package com.ibtech.orm.relation.repository;

import com.ibtech.orm.relation.entity.Team;

public class TeamRepository extends BaseRepository<Team> {
    public TeamRepository() {
        super(Team.class);
    }
}

