package com.ibtech.manager;

import com.ibtech.entity.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserManager extends BaseManager<User> {
    public User findByUserName(String userName) throws Exception {
        User user = null;
        connect();
        String sql = "select * from User where userName=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, userName);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            user = parse(resultSet);
        }
        disconnect();
        return user;
    }

    public void create(User user) throws Exception {
        User isExistUser = findByUserName(user.getUserName());
        if (isExistUser == null) {
            connect();
            String sql = "insert into users_table(user_name, user_password) VALUES(?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, user.getUserName());
            statement.setString(2, user.getUserPassword());

            statement.executeUpdate();
            disconnect();
        }
    }

    @Override
    protected User parse(ResultSet resultSet) throws Exception {
        long userId = resultSet.getLong("userId");
        String userName = resultSet.getString("userName");
        String userPassword = resultSet.getString("userPassword");
        return new User(userId, userName, userPassword);
    }
}
