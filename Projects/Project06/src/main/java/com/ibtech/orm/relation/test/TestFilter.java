package com.ibtech.orm.relation.test;

import com.ibtech.orm.relation.entity.Player;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class TestFilter {
    public static void main(String[] args) {
        long teamId = 2;

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("MyPersistenceUnit");

        EntityManager manager = factory.createEntityManager();

        String jpql = "select p from Player p where p.team.teamId = :teamId";
        TypedQuery<Player> query = manager.createQuery(jpql, Player.class);
        query.setParameter("teamId", teamId);

        List<Player> playerList = query.getResultList();
        for (Player player : playerList) {
            System.out.println(player.getPlayerId() + " "
                    + player.getPlayerName() + " "
                    + player.getAverageScore());
        }

        manager.close();
        factory.close();
    }
}
