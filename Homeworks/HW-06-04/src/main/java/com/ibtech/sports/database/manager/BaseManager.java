package com.ibtech.sports.database.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseManager<E> {

    protected Connection connection;

    public BaseManager() {
        try {
            String driver = "org.postgresql.Driver";
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void connect() throws SQLException {
        String url = "jdbc:postgresql://localhost/dbibtech";
        String user = "postgres";
        String password = "root";
        connection = DriverManager.getConnection(url, user, password);
    }

    protected void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    protected List<E> parseList(ResultSet resultSet) throws Exception {
        List<E> entityList = new ArrayList<>();
        while (resultSet.next()) {
            E entity = parse(resultSet);
            entityList.add(entity);
        }
        return entityList;
    }

    protected abstract E parse(ResultSet resultSet) throws Exception;
}
