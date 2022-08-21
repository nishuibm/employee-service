package com.example.employeeservice.controller;

import com.example.employeeservice.entity.Employee;
import com.example.employeeservice.model.EmployeeVo;
import com.example.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeeservice")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public EmployeeVo getEmployeRecord(@PathVariable Long id){
        return  employeeService.getEmployeeRecord(id);
    }
    @PostMapping ("/employee")
    public void addEmployeRecord(@RequestBody Employee employee){
        employeeService.insertEmployee(employee);
    }
    @PutMapping("/employee/{salary}/{id}")
    public void updateEmployeRecord(@PathVariable Long salary,@PathVariable Long id){
        employeeService.updateEmployeeRecord(salary, id);
    }
    @DeleteMapping("/employee/{id}")
    public void deleteEmployeRecord(@PathVariable Long id){
        employeeService.deleteEmployeeRecord(id);
    }
}
