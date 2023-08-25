package com.grievance.Grievance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grievance.Grievance.entity.Login;
import com.grievance.Grievance.entity.UserLogin;
import com.grievance.Grievance.serviceImplementation.UserServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/grievance")
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserServiceImpl userserviceimpl;

	// Login API

	@PostMapping("/login")
	public ResponseEntity<?> login(@Valid @RequestBody Login login) {
		Boolean boolean1 = this.userserviceimpl.loginService(login);
		if (boolean1) {
			return new ResponseEntity<>("Login Succesfully", HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<>("Invalid Credentials", HttpStatus.UNAUTHORIZED);
	
	}
	// To save the User

	@PostMapping("/save")
	public UserLogin createUser(@RequestBody UserLogin user) {
		UserLogin userSaved = this.userserviceimpl.createUserLogin(user);
		return userSaved;
	}

	// Get All Users 
	
	@GetMapping("/getAllUsers")
	public List<UserLogin> getAllUsers() {
		List<UserLogin> list = this.userserviceimpl.getAllUsers();
		return list;
	}
}
