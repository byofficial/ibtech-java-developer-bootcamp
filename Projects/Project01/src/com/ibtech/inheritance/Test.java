package com.ibtech.inheritance;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer(401, "Neşet", "Ertaş", 3450);
        Person person = new Customer(402, "Mahsuni", "Şerif", 6550);
        Supplier supplier = new Supplier(701, "Orhan", "Gencebay", 8125);

        System.out.println(customer.getGreeting() + " " + customer.getFullName());
        System.out.println(person.getGreeting() + " " + person.getFullName());
        System.out.println(supplier.getGreeting() + " " + supplier.getFullName());
    }
}
