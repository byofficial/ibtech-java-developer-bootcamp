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

        double priceSum = 0;
        int counter = 0;
        for (Product product : products) {
            if (product.getSalesPrice() > 5000) {
                priceSum += product.getSalesPrice();
                counter++;
            }

        }
        double priceAverage = priceSum / counter;
        System.out.println("Ortalama Satış Fiyatı: " + priceAverage);
    }
}
