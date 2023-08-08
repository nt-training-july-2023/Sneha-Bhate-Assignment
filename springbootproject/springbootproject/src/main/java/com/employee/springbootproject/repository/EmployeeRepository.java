package com.employee.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.springbootproject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
