package com.example.employeeservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeVo {

    public Long id;
    public String firstName;
    public String lastName;
    public String designation;
    public Long salary;
    public Date joiningDate;

}
