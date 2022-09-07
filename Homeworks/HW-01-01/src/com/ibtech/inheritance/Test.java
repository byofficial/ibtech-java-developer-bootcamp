package com.ibtech.inheritance;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee(201, "Erkan", "Ocaklı", 5470);
        employee.setEmailAddress("erkan@godoro.com");

        System.out.println(employee.getEmployeeId() + " "
                + employee.getFirstName() + " "
                + employee.getLastName() + " "
                + employee.getMonthlySalary() + " "
                + employee.getEmailAddress());

        sendEmail(employee);
    }

    private static void sendEmail(Person person) {
        System.out.println();
        System.out.println("Kime: " + person.getEmailAddress());
        System.out.println("Gövde: " + person.getFullName());
    }
}
