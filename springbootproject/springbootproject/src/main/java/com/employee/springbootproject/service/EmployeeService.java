package com.employee.springbootproject.service;

import java.util.List;

import com.employee.springbootproject.entity.Employee;

interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(long emp_id);

	public Employee createEmployees(Employee employee);

	public Employee updateEmployee(Employee employee, long emp_id);

	public String deleteEmployee(long emp_id);

}
