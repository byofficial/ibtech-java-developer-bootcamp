package com.ibtech.filer;

public class CustomerFiler extends BaseFiler<Customer> {

    public CustomerFiler(String filePath) {
        super(filePath);
    }

    @Override
    protected String format(Customer customer) {
        StringBuilder builder = new StringBuilder();
        builder.append(customer.getCustomerId()).append(DELIMITER);
        builder.append(customer.getCustomerName()).append(DELIMITER);
        builder.append(customer.getTotalCredit());
        return builder.toString();
    }

    @Override
    protected Customer parse(String line) {
        String[] tokens = line.split(DELIMITER);
        Customer customer = new Customer();
        customer.setCustomerId(Long.parseLong(tokens[0]));
        customer.setCustomerName(tokens[1]);
        customer.setTotalCredit(Double.parseDouble(tokens[2]));
        return customer;
    }
}
