package com.grievance.Grievance.ServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;

import com.grievance.Grievance.entity.UserDetails;
import com.grievance.Grievance.entity.UserType;
import com.grievance.Grievance.payload.LoginDto;
import com.grievance.Grievance.payload.UserDto;
import com.grievance.Grievance.repository.UserRepository;
import com.grievance.Grievance.serviceImplementation.UserServiceImpl;

@SpringBootApplication
@RunWith(SpringRunner.class) 
@ExtendWith(MockitoExtension.class)

public class UserServiceImplTest {

	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private UserServiceImpl userserviceImpl;
	
	@Test
	void loginServiceTest_ReturnsUserDetails() {
		
		UserDetails userDetails = new UserDetails();
		userDetails.setId(1);
		userDetails.setName("Sneha Bhate");
		userDetails.setDepartment("IT");
		userDetails.setEmail("sneha.bhate@nucleusteq.com");
		userDetails.setPassword("Sneha@01");
      	userDetails.setUserType(UserType.valueOf("MEMBER"));
		
		
		LoginDto loginDto = new LoginDto();
		loginDto.setEmail("sneha.bhate@nucleusteq.com");
		loginDto.setPassword("Sneha@01");
		
	
	    when(userRepository.findByEmail("sneha.bhate@nucleusteq.com")).thenReturn(userDetails);
		
	    UserDto userDto =  userserviceImpl.loginService(loginDto);

	    Assertions.assertThat(userDto).isNotNull();	   
	 
	}
	
//	@Test
//     void loginServiceTest_ReturnsNull() {
//		
//		UserDetails userDetails = new UserDetails();
//		userDetails.setId(7);
//		userDetails.setName("Aayushi Chourey");
//		userDetails.setDepartment("IT");
//		userDetails.setEmail("aayushi.chourey@nucleusteq.com");
//		userDetails.setPassword("Aayushi@01");
//      	userDetails.setUserType(UserType.valueOf("MEMBER"));
//      	
//      	LoginDto loginDto = new LoginDto();
//		loginDto.setEmail("aayushi.chourey@nucleusteq.com");
//		loginDto.setPassword("Aayushi@01");
//		
//        when(userRepository.findByEmail("aayushi.chourey@nucleusteq.com")).thenReturn(null);
//	//	System.out.println("Aayushi"+userRepository.findByEmail("aayushi.chourey@nucleusteq.com"));
////	    UserDto usrDto =  userserviceImpl.loginService(loginDto);
//	    
////	    Assertions.assertThat(usrDto).isNull();
//	    assertEquals(null , userserviceImpl.loginService(loginDto));
//	}
	
//	@Test
//    void loginServiceTest_ReturnsNull() {
//		
//		UserDetails userDetails = new UserDetails();
//		userDetails.setId(1);
//		userDetails.setEmail("ayushi@nucleusteq.com");
//		userDetails.setName("Ayushi");
//		userDetails.setPassword("Ayushi@123");
//		userDetails.setUserType(UserType.valueOf("MEMBER"));
//		
//		LoginDto loginDto = new LoginDto();
//		loginDto.setEmail("ayushi.choure@nucleusteq.com");
//		loginDto.setPassword("Aayushi@01");
//		
//        when(userRepository.findByEmail("ayushi.choure@nucleusteq.com")).thenReturn(null);
//	    assertEquals(null , userserviceImpl.loginService(loginDto));
//       assertThrows(ResourceNotFoundException.class, () -> {
//           memberservice.loginMember(memberDto);
       
}
