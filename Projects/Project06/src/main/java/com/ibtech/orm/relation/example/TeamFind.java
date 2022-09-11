package com.ibtech.orm.relation.example;

import com.ibtech.orm.relation.entity.Team;
import com.ibtech.orm.relation.repository.TeamRepository;

public class TeamFind {
    public static void main(String[] args) {
        long teamId = 2;
        TeamRepository teamRepository = new TeamRepository();
        Team team = teamRepository.find(teamId);
        System.out.println(team.getTeamId() + " " + team.getTeamName());
    }
}
