package com.ibtech.inventory;

public class ProductTest2 {
    public static void main(String[] args) {
        Product product = new Product(501, "Cep Telefonu", 1300);
        System.out.println("Ürün Özdeşliği: " + product.getProductId());
        System.out.println("Ürün Adı: " + product.getProductName());
        System.out.println("Ürün Ederi: " + product.getSalesPrice());
    }
}
