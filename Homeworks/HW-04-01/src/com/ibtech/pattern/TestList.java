package com.ibtech.pattern;

import java.util.List;

public class TestList {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager();
        List<Customer> customerList = customerManager.list();
        for (Customer customer : customerList) {
            System.out.println(customer.getCustomerId() + " "
                    + customer.getCustomerName() + " "
                    + customer.getTotalCredit());
        }
    }
}
