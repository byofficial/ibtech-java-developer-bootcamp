package com.ibtech.pattern;

import java.util.List;

public class TestFilter {
    public static void main(String[] args) throws Exception {
        ProductManager productManager = new ProductManager();
        double salesPriceMin = 5000;
        List<Product> productList = productManager.listBySalesPriceGreater(salesPriceMin);
        for (Product product : productList) {
            System.out.println(product.getProductId() + " "
                    + product.getProductName() + " "
                    + product.getSalesPrice());
        }
    }
}
