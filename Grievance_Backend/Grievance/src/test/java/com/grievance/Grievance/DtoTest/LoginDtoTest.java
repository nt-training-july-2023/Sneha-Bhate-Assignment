package com.grievance.Grievance.DtoTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.grievance.Grievance.entity.UserType;
import com.grievance.Grievance.payload.LoginDto;
import com.grievance.Grievance.payload.UserDto;

public class LoginDtoTest {

	@Autowired
	LoginDto loginDto;
	
	@Test
	void TestgetEmail() {
		LoginDto loginDto = new LoginDto();
		loginDto.setEmail("sneha.bhate@nucleusteq.com");
		Assertions.assertThat(loginDto.getEmail()).isEqualTo("sneha.bhate@nucleusteq.com");
		
	}
	@Test
	void TestgetPassword() {
		LoginDto loginDto = new LoginDto();
		loginDto.setPassword("Sneha@01");
		Assertions.assertThat(loginDto.getPassword()).isEqualTo("Sneha@01");
	}
	
	@Test
	void TestLoginDto() {
		LoginDto loginDto = new LoginDto("sneha.bhate@nucleusteq.com", "Sneha@01");
		Assertions.assertThat(loginDto.getEmail()).isEqualTo("sneha.bhate@nucleusteq.com");
		Assertions.assertThat(loginDto.getPassword()).isEqualTo("Sneha@01");
		
	}
}
