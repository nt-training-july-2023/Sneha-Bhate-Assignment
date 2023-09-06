package com.grievance.Grievance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grievance.Grievance.payload.DepartmentDto;
import com.grievance.Grievance.payload.UserDto;
import com.grievance.Grievance.serviceImplementation.DepartmentServiceImpl;

@RestController
@RequestMapping("/grievance")
@CrossOrigin("*")
public class DepartmentController {

	@Autowired
	private DepartmentServiceImpl departmentServiceImpl;

	// When the userType is ADMIN.
	// save department API / Create new Department API.

	@PostMapping("/saveDepartment")
	public ResponseEntity<DepartmentDto> createDepartment(@Validated @RequestBody DepartmentDto departmentDto) {
		DepartmentDto departmentSavedDto = this.departmentServiceImpl.createDepartment(departmentDto);
		return new ResponseEntity<>(departmentSavedDto, HttpStatus.CREATED);
	}

	// get all departments

	@GetMapping("/getAllDepartments")
	public ResponseEntity<List<DepartmentDto>> getAllDepartment() {
		List<DepartmentDto> departmentList = this.departmentServiceImpl.getAllDepartment();
		return ResponseEntity.ok(departmentList);
	}

	// update the department

	@PostMapping("/updateDepartment/{dept_id}")
	public ResponseEntity<DepartmentDto> updateDepartment(@RequestBody DepartmentDto departmentDto,
			@PathVariable("dept_id") long deptId) {
		DepartmentDto updatedSaveDepartmentDto = this.departmentServiceImpl.updateDepartment(departmentDto, deptId);
		return new ResponseEntity<>(updatedSaveDepartmentDto, HttpStatus.OK);
	}

	// get department by Id

	@GetMapping("/getDepartmentById/{dept_id}")
	public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable("dept_id") long deptId) {
		DepartmentDto departmentDto = this.departmentServiceImpl.getDepartmentById(deptId);
		return new ResponseEntity<>(departmentDto, HttpStatus.OK);

	}

	// Delete department by Id

	@DeleteMapping("/deleteDepartmentById/{dept_id}")
	public void deleteDepartmentById(@PathVariable("dept_id") long deptId) {
		this.departmentServiceImpl.deleteDepartmentById(deptId);
		return;
	}
}
