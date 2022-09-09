package com.ibtech.pattern;

public class TestDelete {
    public static void main(String[] args) {
        try {
            ProductManager productManager = new ProductManager();
            long productId = 5;
            boolean deleted = productManager.delete(productId);
            if (deleted) {
                System.out.println("Silindi");
            } else {
                System.out.println("Silinemedi");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
