package com.ibtech.pattern;

public class TestFind {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager();
        long customerId = 13;
        Customer customer = customerManager.find(customerId);
        if (customer != null) {
            System.out.println(customer.getCustomerId() + " "
                    + customer.getCustomerName() + " "
                    + customer.getTotalCredit());
        }

    }
}
