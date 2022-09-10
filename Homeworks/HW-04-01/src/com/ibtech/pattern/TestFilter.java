package com.ibtech.pattern;

import java.util.List;

public class TestFilter {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager();
        double totalCreditMin = 5000;
        List<Customer> customerList = customerManager.listByTotalCreditGreater(totalCreditMin);
        for (Customer customer : customerList) {
            System.out.println(customer.getCustomerId() + " "
                    + customer.getCustomerName() + " "
                    + customer.getTotalCredit());
        }
    }
}
