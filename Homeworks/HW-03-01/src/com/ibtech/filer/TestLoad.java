package com.ibtech.filer;

import java.io.IOException;
import java.util.List;

public class TestLoad {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\burak\\IdeaProjects\\ExPath\\Customer.txt";
        CustomerFiler customerFiler = new CustomerFiler(filePath);
        List<Customer> customerList = customerFiler.load();

        for (Customer customer : customerList) {
            System.out.println(customer.getCustomerId() + " "
                    + customer.getCustomerName() + " "
                    + customer.getTotalCredit());
        }

    }
}
