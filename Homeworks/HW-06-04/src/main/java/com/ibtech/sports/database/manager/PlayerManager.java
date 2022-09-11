package com.ibtech.sports.database.manager;

import com.ibtech.sports.database.entity.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PlayerManager extends BaseManager<Player> {
    public Player find(long playerId) throws Exception {
        Player player = null;
        connect();
        String sql = "select * from Player where playerId=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, playerId);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            player = parse(resultSet);
        }
        disconnect();
        return player;
    }

    public List<Player> list() throws Exception {
        connect();
        String sql = "select * from Player";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Player> playerList = parseList(resultSet);
        disconnect();
        return playerList;
    }

    public boolean insert(Player player) throws SQLException {
        connect();
        String sql = "insert into Player(playerName,averageScore) values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, player.getPlayerName());
        statement.setDouble(2, player.getAverageScore());
        int affected = statement.executeUpdate();
        disconnect();
        return affected > 0;
    }

    public boolean update(Player player) throws SQLException {
        connect();
        String sql = "update Player set playerName = ?, averageScore = ? where playerId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, player.getPlayerName());
        statement.setDouble(2, player.getAverageScore());
        statement.setLong(3, player.getPlayerId());
        int affected = statement.executeUpdate();
        disconnect();
        return affected > 0;
    }

    public boolean delete(long playerId) throws SQLException {
        connect();
        String sql = "delete from Player where playerId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, playerId);
        int affected = statement.executeUpdate();
        disconnect();
        return affected > 0;
    }

    @Override
    protected Player parse(ResultSet resultSet) throws Exception {
        long playerId = resultSet.getLong("playerId");
        String playerName = resultSet.getString("playerName");
        double averageScore = resultSet.getDouble("averageScore");
        return new Player(playerId, playerName, averageScore);
    }
}
