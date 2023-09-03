package com.grievance.Grievance.ControllerTest;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.autoconfigure.webservices.server.AutoConfigureMockWebServiceClient;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.grievance.Grievance.controller.UserController;
import com.grievance.Grievance.entity.UserType;
import com.grievance.Grievance.payload.LoginDto;
import com.grievance.Grievance.payload.UserDto;
import com.grievance.Grievance.serviceImplementation.UserServiceImpl;

import net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForGivenType;
 
//@AutoConfigureMockWebServiceClient
@WebMvcTest(controllers = UserController.class)
@AutoConfigureMockMvc(addFilters = false)
@ExtendWith(MockitoExtension.class)


public class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	
	
	@MockBean
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private UserDto userDto;
	private LoginDto logininputDto;
	
	@Test
	public void UserController_LoginService_ReturnsUserDto() throws Exception{
		
		UserDto userinputDto = new UserDto();
		userinputDto.setName("Sneha Bhate");
		userinputDto.setDepartment("IT");
		userinputDto.setEmail("sneha.bhate@nucleusteq.com");
		userinputDto.setId(1);
		userinputDto.setPassword("Sneha@01");
		userinputDto.setUserType(UserType.valueOf("MEMBER"));
		
		LoginDto logininputDto  = new LoginDto();
		logininputDto.setEmail("sneha.bhate@nucleusteq.com");
		logininputDto.setPassword("Sneha@01");
		
		UserDto expectedDto = new UserDto();
		
		expectedDto.setName("Sneha Bhate");
		expectedDto.setDepartment("IT");
		expectedDto.setEmail("sneha.bhate@nucleusteq.com");
		expectedDto.setId(1);
		expectedDto.setPassword("Sneha@01");
		expectedDto.setUserType(UserType.valueOf("MEMBER"));
		
//		 given(userServiceImpl.loginService(any(LoginDto.class))).willReturn(expectedDto);
//	        String requestJson = objectMapper.writeValueAsString(logininputDto);
//	        String expectedResponse = objectMapper.writeValueAsString(expectedDto);
//	        mockMvc.perform(post("/login")
//	                .contentType(MediaType.APPLICATION_JSON)
//	                .content(requestJson))
//	                .andExpect(status().isAccepted())
//	                .andExpect(content().json(expectedResponse));
		
		
			
		
//		@Test
//	    public void testLoginMember() throws Exception {
//	        MemberDto inputDto = new MemberDto();
//	        inputDto.setName(" ");
//	        inputDto.setEmail("smith@nucleusteq.com");
//	        inputDto.setPassword("Smith@123");
//	        inputDto.setRole(null);
//	        DepartmentDto inputDept = new DepartmentDto();
//	        inputDept.setDeptName(" ");
//	        inputDto.setDepartment(inputDept);
//	        MemberDto expectedDto = new MemberDto();
//	        expectedDto.setMemberId(3);
//	        expectedDto.setName("Smith");
//	        expectedDto.setEmail("smith@nucleusteq.com");
//	        expectedDto.setPassword("Smith@123");
//	        expectedDto.setRole(MemberRole.MEMBER);
//	        DepartmentDto expectedDept = new DepartmentDto();
//	        expectedDept.setDeptId(2);
//	        expectedDept.setDeptName("HR");
//	        expectedDto.setDepartment(expectedDept);
//	        given(memberService.loginMember(any(MemberDto.class))).willReturn(expectedDto);
//	        String requestJson = objectMapper.writeValueAsString(inputDto);
//	        String expectedResponse = objectMapper.writeValueAsString(expectedDto);
//	        mockMvc.perform(post("/api/login")
//	                .contentType(MediaType.APPLICATION_JSON)
//	                .content(requestJson))
//	                .andExpect(status().isAccepted())
//	                .andExpect(content().json(expectedResponse));
//	    }
	}
}

   
	
    



