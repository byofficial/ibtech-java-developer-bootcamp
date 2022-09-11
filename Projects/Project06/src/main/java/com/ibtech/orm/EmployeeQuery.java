package com.ibtech.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class EmployeeQuery {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("MyPersistenceUnit");

        EntityManager manager = factory.createEntityManager();

        String jpql = "select e from Employee e";
        TypedQuery<Employee> query = manager.createQuery(jpql, Employee.class);
        List<Employee> employeeList = query.getResultList();
        for (Employee employee : employeeList) {
            System.out.println(employee.getEmployeeId() + " "
                    + employee.getEmployeeName() + " "
                    + employee.getMonthlySalary());
        }

        manager.close();
        factory.close();

    }
}
