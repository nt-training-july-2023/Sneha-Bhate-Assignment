package com.employee.springbootproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.springbootproject.entity.Employee;
import com.employee.springbootproject.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeRepository employeeRepository;

	// Get All Employees
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	// Get Employee by Id
	public Optional<Employee> getEmployeeById(long emp_id) {
		return employeeRepository.findById(emp_id);
	}

	// Create an Employee
	public Optional<Employee> createEmployees(Employee employee) {
		Employee employee2 = employeeRepository.save(employee);
		return Optional.ofNullable(employeeRepository.save(employee2));
	}

	// Update Employee by id
	public Optional<Employee> updateEmployee(Employee employee, long emp_id) {

		Optional<Employee> oldEmployee = employeeRepository.findById(emp_id);
		if (oldEmployee.isEmpty()) {
			return Optional.empty();
		}
		oldEmployee.get().setEmail(employee.getEmail());
		oldEmployee.get().setName(employee.getName());
		oldEmployee.get().setRole(employee.getRole());
		return Optional.ofNullable(employeeRepository.save(oldEmployee.get()));
	}

	// Delete Employee by id
	public Optional<String> deleteEmployee(long emp_id) {
		Optional<Employee> employee = employeeRepository.findById(emp_id);
		if (employee.isEmpty()) {
			return Optional.empty();
		} else {
			employeeRepository.deleteById(emp_id);
			String string;
			string = "Deleted";
			return Optional.ofNullable(string);
			}
	}

}
