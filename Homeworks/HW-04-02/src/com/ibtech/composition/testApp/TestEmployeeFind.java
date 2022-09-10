package com.ibtech.composition.testApp;

import com.ibtech.composition.entity.Employee;
import com.ibtech.composition.manager.EmployeeManager;

public class TestEmployeeFind {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        try {
            Employee employee = employeeManager.find(3);
            if (employee != null) {
                System.out.println(employee.getEmployeeId() + " "
                        + employee.getEmployeeName() + " "
                        + employee.getMonthlySalary());
            } else {
                System.out.println("Kayıt bulunamadı!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
