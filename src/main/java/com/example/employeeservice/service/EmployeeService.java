package com.example.employeeservice.service;

import com.example.employeeservice.entity.Employee;
import com.example.employeeservice.model.EmployeeVo;

public interface EmployeeService {

    public EmployeeVo getEmployeeRecord(Long id);
    public void insertEmployee(Employee employee);
    public void updateEmployeeRecord(Long salary,Long id);
    public void deleteEmployeeRecord(Long id);
}
