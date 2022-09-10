package com.ibtech.composition.manager;

import com.ibtech.composition.entity.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class EmployeeManager extends BaseManager<Employee> {
    public Employee find(long employeeId) throws Exception {
        Employee employee = null;
        connect();
        String sql = "select * from Employee where employeeId=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, employeeId);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            employee = parse(resultSet);
        }
        disconnect();
        return employee;
    }

    public List<Employee> list() throws Exception {
        connect();
        String sql = "select * from Employee";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Employee> employeeList = parseList(resultSet);
        disconnect();
        return employeeList;
    }

    @Override
    protected Employee parse(ResultSet resultSet) throws Exception {
        long employeeId = resultSet.getLong("employeeId");
        String employeeName = resultSet.getString("employeeName");
        double monthlySalary = resultSet.getDouble("monthlySalary");
        Employee employee = new Employee(employeeId, employeeName, monthlySalary);
        return employee;
    }
}
