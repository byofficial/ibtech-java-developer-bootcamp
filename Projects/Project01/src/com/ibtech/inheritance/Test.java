package com.ibtech.inheritance;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer(401, "Neşet", "Ertaş", 3450);
        customer.setEmailAddress("neset@godoro.com");

        Person person = new Customer(402, "Mahsuni", "Şerif", 6550);
        person.setEmailAddress("mahsuni@godoro.com");

        Supplier supplier = new Supplier(701, "Orhan", "Gencebay", 8125);
        supplier.setEmailAddress("orhan@godoro.com");

        System.out.println(customer.getGreeting() + " " + customer.getFullName());
        System.out.println(person.getGreeting() + " " + person.getFullName());
        System.out.println(supplier.getGreeting() + " " + supplier.getFullName());

        sendEmail(customer);
        sendEmail(person);
        sendEmail(supplier);
    }

    private static void sendEmail(Person person) {
        System.out.println();
        System.out.println("Kime: " + person.getEmailAddress());
        System.out.println("Konu: " + person.getGreeting());
        System.out.println("Gövde: " + person.getFullName());
    }
}
