package com.employee.springbootproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.springbootproject.entity.Employee;
import com.employee.springbootproject.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> list = this.employeeServiceImpl.getAllEmployees();
		System.out.println(list.isEmpty());
		if (list.size() == 0) {
			return (ResponseEntity.status(HttpStatus.NOT_FOUND).build());
		} else
			return new ResponseEntity<>(employeeServiceImpl.getAllEmployees(), HttpStatus.OK);
	}

	@GetMapping("/getEmployeeById/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long emp_id) {

		Optional<Employee> employee = employeeServiceImpl.getEmployeeById(emp_id);
		if (employee.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return new ResponseEntity(employee, HttpStatus.OK);
	}

	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> createEmployees(@RequestBody Employee employee) {

		return new ResponseEntity(employeeServiceImpl.createEmployees(employee), HttpStatus.CREATED);
	}

	@PutMapping("/updateEmployeeById/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable("id") long emp_id) {
		Optional<Employee> optional = employeeServiceImpl.updateEmployee(employee, emp_id);
		if (optional.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return new ResponseEntity(employeeServiceImpl.updateEmployee(employee, emp_id), HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteEmployeeById/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("id") long emp_id) {
		Optional<String> result = employeeServiceImpl.deleteEmployee(emp_id);
		if (result.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return new ResponseEntity(employeeServiceImpl.deleteEmployee(emp_id), HttpStatus.OK);
		}
	}
}
