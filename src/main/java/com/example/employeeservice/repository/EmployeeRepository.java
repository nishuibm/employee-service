package com.example.employeeservice.repository;

import com.example.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query(value="select * from EMPLOYEE where ID=?",nativeQuery=true)
    public Employee getEmployeeRecord(Long id);

    @Modifying
    @Transactional
    @Query(value = "update EMPLOYEE set SAlARY =? WHERE ID=?", nativeQuery = true)
    public Integer updateSalary(Long salary,Long id);

}
