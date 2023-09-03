package com.grievance.Grievance.DtoTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.grievance.Grievance.entity.UserType;
import com.grievance.Grievance.payload.UserDto;

public class UserDtoTest {

	@Autowired
	UserDto userDto;
	
	@BeforeEach
	void setUp() {
//		UserDto userDto = new UserDto();
//		userDto.setId(1);
//		userDto.setName("Sneha Bhate");
//		userDto.setEmail("sneha.bhate@nucleusteq.com");
//		userDto.setDepartment("IT");
//		userDto.setPassword("Sneha@01");
//		userDto.setUserType(UserType.valueOf("MEMBER"));
//	
	}
	
	@Test 
	void TestgetName() {
		UserDto userDto = new UserDto();
		userDto.setId(1);
		userDto.setName("Sneha Bhate");
		userDto.setEmail("sneha.bhate@nucleusteq.com");
		userDto.setDepartment("IT");
		userDto.setPassword("Sneha@01");
		userDto.setUserType(UserType.valueOf("MEMBER"));
		Assertions.assertThat(userDto.getName()).isEqualTo("Sneha Bhate");
	}
	
	@Test
	void TestgetEmail() {
		UserDto userDto = new UserDto();
		userDto.setId(1);
		userDto.setName("Sneha Bhate");
		userDto.setEmail("sneha.bhate@nucleusteq.com");
		userDto.setDepartment("IT");
		userDto.setPassword("Sneha@01");
		userDto.setUserType(UserType.valueOf("MEMBER"));
		Assertions.assertThat(userDto.getEmail()).isEqualTo("sneha.bhate@nucleusteq.com");
		
	}
	
	@Test
	void TestgetDepartment() {
		UserDto userDto = new UserDto();
		userDto.setId(1);
		userDto.setName("Sneha Bhate");
		userDto.setEmail("sneha.bhate@nucleusteq.com");
		userDto.setDepartment("IT");
		userDto.setPassword("Sneha@01");
		userDto.setUserType(UserType.valueOf("MEMBER"));
		Assertions.assertThat(userDto.getDepartment()).isEqualTo("IT");
	}
	
	@Test
	void TestgetPassword() {
		UserDto userDto = new UserDto();
		userDto.setId(1);
		userDto.setName("Sneha Bhate");
		userDto.setEmail("sneha.bhate@nucleusteq.com");
		userDto.setDepartment("IT");
		userDto.setPassword("Sneha@01");
		userDto.setUserType(UserType.valueOf("MEMBER"));
		Assertions.assertThat(userDto.getPassword()).isEqualTo("Sneha@01");
	}
	
	@Test
	void TestgetUserType() {
		UserDto userDto = new UserDto();
		userDto.setId(1);
		userDto.setName("Sneha Bhate");
		userDto.setEmail("sneha.bhate@nucleusteq.com");
		userDto.setDepartment("IT");
		userDto.setPassword("Sneha@01");
		userDto.setUserType(UserType.valueOf("MEMBER"));
		Assertions.assertThat(userDto.getUserType()).isEqualTo(UserType.valueOf("MEMBER"));
	}
	
	@Test
	void TestgetId() {
		UserDto userDto = new UserDto();
		userDto.setId(1);
		userDto.setName("Sneha Bhate");
		userDto.setEmail("sneha.bhate@nucleusteq.com");
		userDto.setDepartment("IT");
		userDto.setPassword("Sneha@01");
		userDto.setUserType(UserType.valueOf("MEMBER"));
		Assertions.assertThat(userDto.getId()).isEqualTo(1);
	}
	
	// Constructor
	
	@Test
	void TestUserDto() {
		UserDto userDto = new UserDto(1,"Sneha Bhate",UserType.valueOf("MEMBER"),"Sneha@01","IT","sneha.bhate@nucleusteq.com");

		Assertions.assertThat(userDto.getId()).isEqualTo(1);
		Assertions.assertThat(userDto.getName()).isEqualTo("Sneha Bhate");
		Assertions.assertThat(userDto.getDepartment()).isEqualTo("IT");
		Assertions.assertThat(userDto.getUserType()).isEqualTo(UserType.valueOf("MEMBER"));
		Assertions.assertThat(userDto.getEmail()).isEqualTo("sneha.bhate@nucleusteq.com");
		Assertions.assertThat(userDto.getPassword()).isEqualTo("Sneha@01");
		
	}
}
