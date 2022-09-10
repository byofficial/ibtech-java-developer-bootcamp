package com.ibtech.composition.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaseManager {
    private final String url = "jdbc:postgresql://localhost/dbibtech";
    private final String user = "postgres";
    private final String password = "root";

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
        connection = DriverManager.getConnection(url, user, password);
    }

    protected void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
        }

    }
}
