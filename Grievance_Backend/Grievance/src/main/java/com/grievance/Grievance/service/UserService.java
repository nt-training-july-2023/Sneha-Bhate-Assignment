package com.grievance.Grievance.service;

import java.util.List;

import com.grievance.Grievance.entity.Login;
import com.grievance.Grievance.entity.UserLogin;

public interface UserService {

	public Boolean loginService(Login login);
    public List<UserLogin> getAllUsers();
    public UserLogin createUserLogin(UserLogin user);
	


}
