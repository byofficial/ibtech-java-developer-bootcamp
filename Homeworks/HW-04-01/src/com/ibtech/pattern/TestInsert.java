package com.ibtech.pattern;

public class TestInsert {
    public static void main(String[] args) {
        try {
            CustomerManager customerManager = new CustomerManager();
            Customer customer = new Customer(0, "Neşet Ertaş", 4350);
            boolean inserted = customerManager.insert(customer);
            if (inserted) {
                System.out.println("Müşteri kaydedildi.");
            } else {
                System.out.println("Kayıt Başarısız");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
