//service data provide in to the controller

package com.example.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Passenger;
import com.example.binding.Ticket;
import com.example.service.TicketService;


@RestController  // A convenience annotation that is itself annotated with @Controller and @ResponseBody. 
public class TicketRestController {
	
	@Autowired //Inject annotation, 
	private TicketService service; // service inject
	
	// this logic Create a ticket
	
	@PostMapping("/tickets") // The POST HTTP method is used to create a resource 
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger p){ //ResponseEntity represents the whole HTTP response: status code, headers, and body
		                                                               //@RequestBody Annotation indicating a method parameter should be bound to the body of the web request.
		Ticket ticket = service.bookTicket(p);
		
		return new ResponseEntity<>(ticket , HttpStatus.CREATED);
				
	}
	
	//this logic Show all the ticket
	
	@GetMapping("/tickets")
	public ResponseEntity<Collection<Ticket>> getTickets(){
		
		Collection<Ticket> allTickets = service.getAllTickets();
		return new ResponseEntity<>(allTickets , HttpStatus.OK);
				
	}

}
