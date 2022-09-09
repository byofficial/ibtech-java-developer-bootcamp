package com.ibtech.relation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AggregatedList {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost/dbibtech";
        String user = "postgres";
        String password = "root";

        String driver = "org.postgresql.Driver";
        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select e.departmentid, departmentname, sum(monthlySalary) as salarySum \r\n"
                + "from employee e\r\n"
                + " right join department d  on e.departmentid  = d.departmentid \r\n"
                + "group  by e.departmentid , d.departmentname";

        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            long departmentId = resultSet.getLong("departmentId");
            String departmentName = resultSet.getString("departmentName");
            double salarySum = resultSet.getDouble("salarySum");
            System.out.format("%d %s %.2f\n", (long) departmentId, departmentName, salarySum);
        }
        connection.close();
    }
}
