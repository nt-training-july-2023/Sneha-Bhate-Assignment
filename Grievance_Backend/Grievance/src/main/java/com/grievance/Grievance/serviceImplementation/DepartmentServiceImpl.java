package com.grievance.Grievance.serviceImplementation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grievance.Grievance.entity.Department;
import com.grievance.Grievance.payload.DepartmentDto;
import com.grievance.Grievance.repository.DepartmentRepository;
import com.grievance.Grievance.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepo;
	Department department;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	// Create the Department
	
	@Override
	public DepartmentDto createDepartment(DepartmentDto departmentDto) {
		Department department = this.departmentDtoToDepartment(departmentDto);
		System.out.println(department);
		Department savedDepartment = this.departmentRepo.save(department);
		System.out.println(savedDepartment);
		return this.departmentToDepartmentDto(savedDepartment);
	}
	
	// get All department 
	
	@Override
	public List<DepartmentDto> getAllDepartment() {
		List<Department> departments = this.departmentRepo.findAll();
		List<DepartmentDto> departmentList = departments.stream().map(department -> this.departmentToDepartmentDto(department)).collect(Collectors.toList());
		return departmentList;
	}


	// Get department by Id 
	
	@Override
	public DepartmentDto getDepartmentById(long deptId) {
		// TODO Auto-generated method stub
	   Department department = this.departmentRepo.findById(deptId).get();
		return this.departmentToDepartmentDto(department);
	}

	// Updating the Department.
	
		@Override
		public DepartmentDto updateDepartment(DepartmentDto departmentDto, long deptId) {
			// TODO Auto-generated method stub
			Department department = this.departmentRepo.findById(deptId).get();
			department.setDeptName(departmentDto.getDeptName());
			Department updateDepartment =  this.departmentRepo.save(department);
			return this.departmentToDepartmentDto(updateDepartment);
		}


	// Delete department by Id.

	@Override
	public  void deleteDepartmentById(long deptId) {
		this.departmentRepo.deleteById(deptId);	
	}
	
	
	// DepartmentDto to department

	public Department departmentDtoToDepartment(DepartmentDto departmentDto) {
		Department department = this.modelMapper.map(departmentDto, Department.class);
		return department;
	}

	// Department to departmentDto

	public DepartmentDto departmentToDepartmentDto(Department department) {
		DepartmentDto departmentDto = this.modelMapper.map(department, DepartmentDto.class);
		return departmentDto;
	}
	
	// update department 

//		@Override
//		public DepartmentDto updateDepartment(DepartmentDto departmentDto, long deptId) {
//			Department department = this.departmentDtoToDepartment(departmentDto);
//			System.out.println("department : "+department);
//			Optional<Department> oldDepartment = this.departmentRepo.findById(deptId);
//			System.out.println("Old Department : " + oldDepartment.get());
//			if (oldDepartment.isEmpty()) {
//				return null;
//			}
//			oldDepartment.get().setDeptName(department.getDeptName());
//			System.out.println("Old Department : "+oldDepartment.get());
//			return departmentToDepartmentDto(oldDepartment.get());
//			
//		}

}
