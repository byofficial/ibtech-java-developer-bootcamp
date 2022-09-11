package com.ibtech.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EmployeeAggregate {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("MyPersistenceUnit");

        EntityManager manager = factory.createEntityManager();

        String jpql = "select avg(e.monthlySalary) from Employee e";
        TypedQuery<Double> query = manager.createQuery(jpql, Double.class);
        double monthlySalaryAverage = query.getSingleResult();

        manager.close();
        factory.close();

        System.out.println("Maaş Ortalama: " + monthlySalaryAverage);
    }
}
