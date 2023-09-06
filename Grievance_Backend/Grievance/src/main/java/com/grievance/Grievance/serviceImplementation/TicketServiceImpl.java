package com.grievance.Grievance.serviceImplementation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grievance.Grievance.entity.Department;
import com.grievance.Grievance.entity.Ticket;
import com.grievance.Grievance.entity.TicketStatus;
import com.grievance.Grievance.entity.TicketType;
import com.grievance.Grievance.entity.UserDetails;
import com.grievance.Grievance.entity.UserType;
import com.grievance.Grievance.payload.DepartmentDto;
import com.grievance.Grievance.payload.TicketDto;
import com.grievance.Grievance.payload.UserDto;
import com.grievance.Grievance.repository.TicketRepository;
import com.grievance.Grievance.service.TicketService;


@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	TicketRepository ticketRepo;
	Ticket ticket;
	@Autowired
	private ModelMapper modelMapper;
    
	
	@Override
	public TicketDto createTicket(TicketDto ticketDto) {
		
		System.out.println("IN SERVICE IMPL="+ticketDto.getUserDetails());
		Ticket ticket = this.ticketDtoToTicket(ticketDto);
		System.out.println("before="+ticket);
		Ticket savedTicket = this.ticketRepo.save(ticket);
		System.out.println("Saved="+savedTicket);
		return this.ticketToTicketDto(savedTicket);
	}
	
	
	// TicketDto  to ticket.
	
	public Ticket ticketDtoToTicket(TicketDto ticketDto) {
		
		Ticket ticket = this.modelMapper.map(ticketDto, Ticket.class);
//		ticket.setTicketId(ticketDto.getTicketId());
//		ticket.setAssignedBy(ticketDto.getAssignedBy());
//		ticket.setAssignegTo(ticketDto.getAssignegTo());
//		ticket.setDescription(ticketDto.getDescription());
//		ticket.setTicketTitle(ticketDto.getTicketTitle());
//		ticket.setCreatedAt(ticketDto.getCreatedAt());
//		ticket.setUpdatedAt(ticketDto.getUpdatedAt());
//		DepartmentDto department = departmentToDepartmentDto(ticket.getDepartment());
//		ticket.setDepartment(ticketDto.getDepartment());
//		UserDto userDto =  userToDto(ticket.getUserDetails());
//		ticket.setUserDetails(ticketDto.getUserDetails());
//		ticket.setTicketStatus(TicketStatus.valueOf(ticketDto.getTicketStatus().name()));
//		ticket.setTicketType(TicketType.valueOf(ticketDto.getTicketType().name()));
//	
		return ticket;
		
		
	}
	
	
	// Ticket to TicketDto.
	
	public TicketDto ticketToTicketDto(Ticket ticket) {
		
		TicketDto ticketDto  =  this.modelMapper.map(ticket, TicketDto.class);
//		ticketDto.setTicketId(ticket.getTicketId());
//		ticketDto.setAssignedBy(ticket.getAssignedBy());
//		ticketDto.setAssignegTo(ticket.getAssignegTo());
//		ticketDto.setTicketTitle(ticket.getTicketTitle());
//		ticketDto.setCreatedAt(ticket.getCreatedAt());
//		ticketDto.setUpdatedAt(ticket.getUpdatedAt());
//		ticketDto.setDepartment(ticket.getDepartment());
//		ticketDto.setUserDetails(ticket.getUserDetails());
//		ticketDto.setTicketStatus(TicketStatus.valueOf(ticket.getTicketStatus().name()));
//		ticketDto.setTicketType(TicketType.valueOf(ticket.getTicketType().name()));
		return ticketDto;
	}
	
	// Dto to user

		public UserDetails dtoToUser(UserDto userDto) {
			UserDetails userdetails = this.modelMapper.map(userDto, UserDetails.class);
			
//			userdetails.setId(userDto.getId());
//			userdetails.setName(userDto.getName());
//			userdetails.setEmail(userDto.getEmail());
//			userdetails.setPassword(userDto.getPassword());
//			userdetails.setIsLoggedIn(userDto.getIsLoggedIn());
//			DepartmentDto department = departmentToDepartmentDto(userdetails.getDepartment());
//			userdetails.setDepartment(userDto.getDepartment());
//			userdetails.setUserType(userDto.getUserType());
//			userdetails.setUserType(UserType.valueOf(userDto.getUserType().name()));
//			// object
//			System.out.println(userDto.getUserType());
//			
//			//string
//			System.out.println(userDto.getUserType().name());
//			System.out.println((UserType.valueOf(userDto.getUserType().name())));
	//
//			System.out.println("____________________________________________-");
			return userdetails;
		}

		// User to dto

		public UserDto userToDto(UserDetails userdetails) {

	     UserDto userDto = this.modelMapper.map(userdetails, UserDto.class);
//	        userDto.setId(userdetails.getId());
//			userDto.setName(userdetails.getName());
//			userDto.setEmail(userdetails.getEmail());
//			userDto.setPassword(userdetails.getPassword());
//			userDto.setDepartment(userdetails.getDepartment());
//			userDto.setIsLoggedIn(userdetails.getIsLoggedIn());
//			userDto.setUserType(UserType.valueOf(userdetails.getUserType().name()));	
//			System.out.println(userdetails.getUserType());
//			System.out.println(userdetails.getUserType().name());
//			System.out.println(UserType.valueOf(userdetails.getUserType().name()));
	     
			return userDto;
		}
		
		// DepartmentDto to department

			public Department departmentDtoToDepartment(DepartmentDto departmentDto) {
				Department department = this.modelMapper.map(departmentDto, Department.class);
//				department.setDeptId(departmentDto.getDeptId());
//				department.setDeptName(departmentDto.getDeptName());
				return department;
			}

			// Department to departmentDto

			public DepartmentDto departmentToDepartmentDto(Department department) {
				DepartmentDto departmentDto = this.modelMapper.map(department, DepartmentDto.class);
//				departmentDto.setDeptId(department.getDeptId());
//				departmentDto.setDeptName(department.getDeptName());
//				System.out.println(departmentDto);
				return departmentDto;
			}
	
}
