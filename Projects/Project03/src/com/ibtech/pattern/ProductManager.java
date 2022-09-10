package com.ibtech.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private final String url = "jdbc:postgresql://localhost/dbibtech";
    private final String user = "postgres";
    private final String password = "root";

    public ProductManager() {
        try {
            String driver = "org.postgresql.Driver";
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Product find(long productId) throws Exception {
        Product product = null;
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from Product where productId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, productId);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            product = parse(resultSet);
        }

        connection.close();
        return product;
    }

    public List<Product> list() throws Exception {
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from Product";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Product> productList = parseList(resultSet);
        connection.close();
        return productList;
    }

    public List<Product> listBySalesPriceGreater(double salesPriceMin) throws Exception {
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from Product where salesPrice >= ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setDouble(1, salesPriceMin);
        ResultSet resultSet = statement.executeQuery();
        List<Product> productList = parseList(resultSet);
        connection.close();
        return productList;
    }

    public List<Product> listByProductNameLike(String productNamePattern) throws Exception {
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from Product where productName like ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "%" + productNamePattern + "%");
        ResultSet resultSet = statement.executeQuery();
        List<Product> productList = parseList(resultSet);
        connection.close();
        return productList;
    }

    public boolean delete(Long productId) throws Exception {
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "delete from Product where productId = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, productId);
        int affected = statement.executeUpdate();
        connection.close();
        return affected > 0;
    }

    public boolean update(Product product) throws Exception {
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "update Product set productName = ?, salesPrice=? WHERE productId=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, product.getProductName());
        statement.setDouble(2, product.getSalesPrice());
        statement.setLong(3, product.getProductId());
        int affected = statement.executeUpdate();

        connection.close();
        return affected > 0;
    }

    public boolean insert(Product product) throws Exception {
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "insert into Product(productName,salesPrice) values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, product.getProductName());
        statement.setDouble(2, product.getSalesPrice());
        int affected = statement.executeUpdate();

        connection.close();
        System.out.println("Etkilenmiş " + affected);
        return affected > 0;
    }

    private List<Product> parseList(ResultSet resultSet) throws Exception {
        List<Product> productList = new ArrayList<>();
        while (resultSet.next()) {
            productList.add(parse(resultSet));
        }
        return productList;
    }

    private Product parse(ResultSet resultSet) throws Exception {
        long productId = resultSet.getLong("productId");
        String productName = resultSet.getString("productName");
        double salesPrice = resultSet.getDouble("salesPrice");
        return new Product(productId, productName, salesPrice);
    }
}
