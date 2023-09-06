package com.grievance.Grievance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grievance.Grievance.payload.TicketDto;
import com.grievance.Grievance.serviceImplementation.TicketServiceImpl;

@RestController
@RequestMapping("/grievance")
public class TicketController {

	@Autowired 
	TicketServiceImpl ticketServiceImpl;
	
	//  Create new Ticket API.
	
			@PostMapping("/saveTicket")
			public ResponseEntity<TicketDto> createTicket(@Validated @RequestBody TicketDto ticketDto) {
			System.out.println("CONTROLLER="+ticketDto);
			TicketDto savedTicketDto  = this.ticketServiceImpl.createTicket(ticketDto);
				return new ResponseEntity<>(savedTicketDto, HttpStatus.CREATED);
			}
	
}
