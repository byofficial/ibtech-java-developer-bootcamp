package com.ibtech.collections;

import com.ibtech.inventory.Product;

public class ProductTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(501, "Cep Telefonu", 1300),
                new Product(502, "Masaüstü Bilgisayar", 6540),
                new Product(503, "Dizüstü Bilgisayar", 7865)
        };

        for (Product product : products) {
            System.out.println(product.getProductId() + " "
                    + product.getProductName() + " "
                    + product.getSalesPrice());
        }
    }
}
