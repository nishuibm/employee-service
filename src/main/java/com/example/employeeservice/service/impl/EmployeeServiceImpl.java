package com.example.employeeservice.service.impl;


import com.example.employeeservice.entity.Employee;
import com.example.employeeservice.model.EmployeeVo;
import com.example.employeeservice.repository.EmployeeRepository;
import com.example.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeVo getEmployeeRecord(Long id) {
        Employee employee = employeeRepository.getEmployeeRecord(id);
        return new EmployeeVo(employee.getId(), employee.getFirstName()
                , employee.getLastName(), employee.getDesignation()
                , employee.getSalary(), employee.getJoiningDate());
    }

    @Override
    public void insertEmployee(Employee employee) {
        employeeRepository.saveAndFlush(employee);
    }

    @Override
    public void updateEmployeeRecord(Long salary, Long id) {
        employeeRepository.updateSalary(salary, id);
    }

    @Override
    public void deleteEmployeeRecord(Long id) {
        employeeRepository.deleteById(id);
    }
}
