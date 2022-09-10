package com.ibtech.pattern;

import java.util.List;

public class TestFilterLikeQuery {
    public static void main(String[] args) throws Exception {
        ProductManager productManager = new ProductManager();
        String productNamePattern = "Bil";
        List<Product> productList = productManager.listByProductNameLike(productNamePattern);
        for (Product product : productList) {
            System.out.println(product.getProductId() + " "
                    + product.getProductName() + " "
                    + product.getSalesPrice());
        }
    }
}
