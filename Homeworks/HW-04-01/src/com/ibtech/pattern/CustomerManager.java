package com.ibtech.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private final String url = "jdbc:postgresql://localhost/dbibtech";
    private final String user = "postgres";
    private final String password = "root";

    public CustomerManager() {
        try {
            String driver = "org.postgresql.Driver";
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Customer find(long customerId) throws Exception {
        Customer customer = null;
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from Customer where customerId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, customerId);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            customer = parse(resultSet);
        }

        connection.close();
        return customer;
    }

    public List<Customer> list() throws Exception {
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from Customer";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Customer> customerList = parseList(resultSet);
        connection.close();
        return customerList;
    }

    public List<Customer> listByTotalCreditGreater(double totalCreditMin) throws Exception {
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from Customer where totalCredit >= ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setDouble(1, totalCreditMin);
        ResultSet resultSet = statement.executeQuery();
        List<Customer> customerList = parseList(resultSet);
        connection.close();
        return customerList;
    }

    public List<Customer> listByCustomerNameLike(String customerNamePattern) throws Exception {
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from Customer where customerName like ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "%" + customerNamePattern + "%");
        ResultSet resultSet = statement.executeQuery();
        List<Customer> customerList = parseList(resultSet);
        connection.close();
        return customerList;
    }

    public boolean delete(Long customerId) throws Exception {
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "delete from Customer where customerId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, customerId);
        int affected = statement.executeUpdate();
        connection.close();
        return affected > 0;
    }

    public boolean update(Customer customer) throws Exception {
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "update Customer set customerName = ?, totalCredit=? WHERE customerId=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customer.getCustomerName());
        statement.setDouble(2, customer.getTotalCredit());
        statement.setLong(3, customer.getCustomerId());
        int affected = statement.executeUpdate();

        connection.close();
        return affected > 0;
    }

    public boolean insert(Customer customer) throws Exception {
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "insert into Customer(customerName,totalCredit) values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, customer.getCustomerName());
        statement.setDouble(2, customer.getTotalCredit());
        int affected = statement.executeUpdate();

        connection.close();
        System.out.println("Etkilenmiş " + affected);
        return affected > 0;
    }

    private List<Customer> parseList(ResultSet resultSet) throws Exception {
        List<Customer> customerList = new ArrayList<>();
        while (resultSet.next()) {
            customerList.add(parse(resultSet));
        }
        return customerList;
    }

    private Customer parse(ResultSet resultSet) throws Exception {
        long customerId = resultSet.getLong("customerId");
        String customerName = resultSet.getString("customerName");
        double totalCredit = resultSet.getDouble("totalCredit");
        return new Customer(customerId, customerName, totalCredit);
    }
}
