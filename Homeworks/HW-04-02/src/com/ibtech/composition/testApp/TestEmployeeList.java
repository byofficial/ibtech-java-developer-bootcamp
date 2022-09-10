package com.ibtech.composition.testApp;

import com.ibtech.composition.entity.Employee;
import com.ibtech.composition.manager.EmployeeManager;

import java.util.List;

public class TestEmployeeList {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        try {
            List<Employee> employeeList = employeeManager.list();
            for (Employee employee : employeeList) {
                System.out.println(employee.getEmployeeId() + " "
                        + employee.getEmployeeName() + " "
                        + employee.getMonthlySalary());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
