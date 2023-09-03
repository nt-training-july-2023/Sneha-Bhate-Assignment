package com.grievance.Grievance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class UserLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long Id;
	private String name;
	private String userType;
//	@NotEmpty(message = "Password is required")
//	@Size(min = 8, message = "Password should be at least 8 characters")
	private String password;
	private String department;
	
//	@NotEmpty(message = "Email is required")
//	@Pattern(regexp = "^[A-Za-z0-9._%+-]+@gmail.com+$")
	@Column(unique=true)
	private String email;
	
	/**
	 * @return the id
	 */
	public long getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		Id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "UserLogin [Id=" + Id + ", name=" + name + ", userType=" + userType + ", email=" + email + ", password="
				+ password + ", department=" + department + "]";
	}
	
	
}
