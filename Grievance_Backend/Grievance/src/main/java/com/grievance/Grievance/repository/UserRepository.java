package com.grievance.Grievance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grievance.Grievance.entity.UserLogin;

public interface UserRepository extends JpaRepository<UserLogin,Long>{
	UserLogin findByEmail(String email);
}