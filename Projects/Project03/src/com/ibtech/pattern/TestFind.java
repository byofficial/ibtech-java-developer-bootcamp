package com.ibtech.pattern;

public class TestFind {
    public static void main(String[] args) throws Exception {
        ProductManager productManager = new ProductManager();
        long productId = 13;
        Product product = productManager.find(productId);
        if (product != null) {
            System.out.println(product.getProductId() + " "
                    + product.getProductName() + " "
                    + product.getSalesPrice());
        }

    }
}
