package com.ibtech.composition.manager;

import com.ibtech.composition.entity.Department;

import java.sql.ResultSet;

public class DepartmentManager extends BaseManager<Department> {
    @Override
    protected Department parse(ResultSet resultSet) throws Exception {
        long departmentId = resultSet.getLong("departmentId");
        String departmentName = resultSet.getString("departmentName");
        Department department = new Department(departmentId, departmentName);
        return department;
    }
}
