package com.ibtech.relation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Relation {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost/dbibtech";
        String user = "postgres";
        String password = "root";

        String driver = "org.postgresql.Driver";
        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from Employee e \r\n"
                + " left join Department d on e.departmentid = d.departmentid";

        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            long employeeId = resultSet.getLong("employeeId");
            String employeeName = resultSet.getString("employeeName");
            double monthlySalary = resultSet.getDouble("monthlySalary");
            long departmentId = resultSet.getLong("departmentId");
            String departmentName = resultSet.getString("departmentName");
            System.out.println(employeeId + " "
                    + employeeName + " "
                    + monthlySalary + " "
                    + departmentId + " "
                    + departmentName);
        }
        connection.close();
    }
}
