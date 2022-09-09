package com.ibtech.filer;

import java.util.ArrayList;
import java.util.List;

public class TestStore {
    public static void main(String[] args) {

        try {
            List<Customer> customerList = new ArrayList<>();
            customerList.add(new Customer(601, "Cem Karaca", 6540));
            customerList.add(new Customer(602, "Barış Manço", 7645));
            customerList.add(new Customer(602, "Fikret Kızılok", 3450));

            String filePath = "C:\\Users\\burak\\IdeaProjects\\ExPath\\Customer.txt";
            CustomerFiler customerFiler = new CustomerFiler(filePath);
            customerFiler.store(customerList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
