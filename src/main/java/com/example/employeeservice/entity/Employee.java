package com.example.employeeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name="EMPLOYEE")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMPLOYEE_DATA")
    @SequenceGenerator(name = "SEQ_EMPLOYEE_DATA", sequenceName = "SEQ_EMPLOYEE_DATA", allocationSize = 1)
    @Column(name = "ID",nullable=false,updatable = false)
    public Long id;

    @Column(name="FIRST_NAME")
    public String firstName;

    @Column(name="LAST_NAME")
    public String lastName;

    @Column(name="DESIGNATION")
    public String designation;

    @Column(name="SALARY")
    public Long salary;

    @Column(name="JOINING_DATE")
    public Date joiningDate;

    @Column(name="CREATION_DATE")
    @CreationTimestamp
    public Date creationDate;

    @Column(name="UPDATED_DATE")
    @UpdateTimestamp
    public Date updatedDate;


}
