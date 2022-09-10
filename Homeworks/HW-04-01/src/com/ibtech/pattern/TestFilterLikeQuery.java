package com.ibtech.pattern;

import java.util.List;

public class TestFilterLikeQuery {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager();
        String customerNamePattern = "Neş";
        List<Customer> customerList = customerManager.listByCustomerNameLike(customerNamePattern);
        for (Customer customer : customerList) {
            System.out.println(customer.getCustomerId() + " "
                    + customer.getCustomerName() + " "
                    + customer.getTotalCredit());
        }
    }
}
