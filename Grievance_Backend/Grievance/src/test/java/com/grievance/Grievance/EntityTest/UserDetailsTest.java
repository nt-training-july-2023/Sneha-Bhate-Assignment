package com.grievance.Grievance.EntityTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.grievance.Grievance.entity.UserDetails;
import com.grievance.Grievance.entity.UserType;
import com.grievance.Grievance.payload.UserDto;


public class UserDetailsTest {
	
	@Autowired
	UserDetails userDetails;
	
	@BeforeEach
	void setUp() {
//		UserDetails userDetails = new UserDetails();
//		userDetails.setId(1);
//		userDetails.setName("Sneha Bhate");
//		userDetails.setEmail("sneha.bhate@nucleusteq.com");
//		userDetails.setDepartment("IT");
//		userDetails.setPassword("Sneha@01");
//		userDetails.setUserType(UserType.valueOf("MEMBER"));
//		userDetails.setIsLoggedIn(true);
		
	}
	
	@Test 
	void TestgetName() {
		UserDetails userDetails = new UserDetails();
		userDetails.setId(1);
		userDetails.setName("Sneha Bhate");
		userDetails.setEmail("sneha.bhate@nucleusteq.com");
		userDetails.setDepartment("IT");
		userDetails.setPassword("Sneha@01");
		userDetails.setUserType(UserType.valueOf("MEMBER"));
		userDetails.setIsLoggedIn(true);
		Assertions.assertThat(userDetails.getName()).isEqualTo("Sneha Bhate");
	}
	
	@Test
	void TestgetEmail() {
		UserDetails userDetails = new UserDetails();
		userDetails.setId(1);
		userDetails.setName("Sneha Bhate");
		userDetails.setEmail("sneha.bhate@nucleusteq.com");
		userDetails.setDepartment("IT");
		userDetails.setPassword("Sneha@01");
		userDetails.setUserType(UserType.valueOf("MEMBER"));
		userDetails.setIsLoggedIn(true);
		Assertions.assertThat(userDetails.getEmail()).isEqualTo("sneha.bhate@nucleusteq.com");
		
	}
	
	@Test
	void TestgetDepartment() {
		UserDetails userDetails = new UserDetails();
		userDetails.setId(1);
		userDetails.setName("Sneha Bhate");
		userDetails.setEmail("sneha.bhate@nucleusteq.com");
		userDetails.setDepartment("IT");
		userDetails.setPassword("Sneha@01");
		userDetails.setUserType(UserType.valueOf("MEMBER"));
		userDetails.setIsLoggedIn(true);
		Assertions.assertThat(userDetails.getDepartment()).isEqualTo("IT");
	}
	
	@Test
	void TestgetPassword() {
		UserDetails userDetails = new UserDetails();
		userDetails.setId(1);
		userDetails.setName("Sneha Bhate");
		userDetails.setEmail("sneha.bhate@nucleusteq.com");
		userDetails.setDepartment("IT");
		userDetails.setPassword("Sneha@01");
		userDetails.setUserType(UserType.valueOf("MEMBER"));
		userDetails.setIsLoggedIn(true);
		Assertions.assertThat(userDetails.getPassword()).isEqualTo("Sneha@01");
	}
	
	@Test
	void TestgetUserType() {
		UserDetails userDetails = new UserDetails();
		userDetails.setId(1);
		userDetails.setName("Sneha Bhate");
		userDetails.setEmail("sneha.bhate@nucleusteq.com");
		userDetails.setDepartment("IT");
		userDetails.setPassword("Sneha@01");
		userDetails.setUserType(UserType.valueOf("MEMBER"));
		userDetails.setIsLoggedIn(true);
		Assertions.assertThat(userDetails.getUserType()).isEqualTo(UserType.valueOf("MEMBER"));
	}
	
	@Test
	void TestgetIsLoggedIn() {
		UserDetails userDetails = new UserDetails();
		userDetails.setId(1);
		userDetails.setName("Sneha Bhate");
		userDetails.setEmail("sneha.bhate@nucleusteq.com");
		userDetails.setDepartment("IT");
		userDetails.setPassword("Sneha@01");
		userDetails.setUserType(UserType.valueOf("MEMBER"));
		userDetails.setIsLoggedIn(true);
		Assertions.assertThat(userDetails.getIsLoggedIn()).isEqualTo(true);
	}
	
	@Test
	void TestgetId() {
		UserDetails userDetails = new UserDetails();
		userDetails.setId(1);
		userDetails.setName("Sneha Bhate");
		userDetails.setEmail("sneha.bhate@nucleusteq.com");
		userDetails.setDepartment("IT");
		userDetails.setPassword("Sneha@01");
		userDetails.setUserType(UserType.valueOf("MEMBER"));
		userDetails.setIsLoggedIn(true);
		Assertions.assertThat(userDetails.getId()).isEqualTo(1);
	}
	
	@Test
	void TestUserDto() {
		UserDetails userDetails = new UserDetails(1,"Sneha Bhate",UserType.valueOf("MEMBER"),"Sneha@01","IT","sneha.bhate@nucleusteq.com");

		Assertions.assertThat(userDetails.getId()).isEqualTo(1);
		Assertions.assertThat(userDetails.getName()).isEqualTo("Sneha Bhate");
		Assertions.assertThat(userDetails.getDepartment()).isEqualTo("IT");
		Assertions.assertThat(userDetails.getUserType()).isEqualTo(UserType.valueOf("MEMBER"));
		Assertions.assertThat(userDetails.getEmail()).isEqualTo("sneha.bhate@nucleusteq.com");
		Assertions.assertThat(userDetails.getPassword()).isEqualTo("Sneha@01");
		
	}
	}
	


