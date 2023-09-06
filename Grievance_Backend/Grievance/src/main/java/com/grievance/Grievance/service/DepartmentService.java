package com.grievance.Grievance.service;

import java.util.List;

import com.grievance.Grievance.payload.DepartmentDto;


public interface DepartmentService {
	
    public List <DepartmentDto> getAllDepartment();
	public DepartmentDto getDepartmentById(long deptId);
	public DepartmentDto createDepartment(DepartmentDto departmentDto);
	public DepartmentDto updateDepartment(DepartmentDto departmentDto , long deptId);
	public void deleteDepartmentById(long deptId);
}
