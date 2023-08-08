package com.employee.springbootproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employee.springbootproject.controller.EmployeeController;
import com.employee.springbootproject.service.EmployeeServiceImpl;

@SpringBootTest
class SpringbootprojectApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	EmployeeController controller;
	
	@Autowired
	EmployeeServiceImpl service;
	
	@Test
	void getList() {
		System.out.println(service.getAllEmployees());
		System.out.println(controller.getAllEmployees());
	}

}
