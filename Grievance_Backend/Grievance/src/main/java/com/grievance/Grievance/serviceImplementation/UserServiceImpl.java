package com.grievance.Grievance.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grievance.Grievance.entity.Login;
import com.grievance.Grievance.entity.UserLogin;
import com.grievance.Grievance.repository.UserRepository;
import com.grievance.Grievance.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	UserLogin userlogin;

	@Override
	public Boolean loginService(Login login) { // user login password
		// TODO Auto-generated method stub
		System.out.println("From API (frontend) Email :"+login.getEmail());
		System.out.println("From API (frontend) Password :"+login.getEmail());
		
		System.out.println(userRepo.findByEmail("sneha.bhate@nucleusteq.com"));
		UserLogin userdblogin = userRepo.findByEmail(login.getEmail());
		System.out.print("from database : "+userdblogin);
		if (userdblogin != null) {
			if (userdblogin.getPassword().equals(login.getPassword())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public UserLogin createUserLogin(UserLogin user) {
		UserLogin usersaveLogin = userRepo.save(user);
		// System.out.println(user);
		// System.out.println(usersaveLogin);
		return usersaveLogin;

	}

	@Override
	public List<UserLogin> getAllUsers() {
		List<UserLogin> list = userRepo.findAll();
		return list;
	}
}