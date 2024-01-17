package com.example.service;

import java.util.Arrays;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.binding.Passenger;
import com.example.binding.Ticket;

@Service
public class MakeMyTripService {
	
	//Book the ticket logic
	
	public Ticket bookTicket(Passenger p)
	{
		String apiUrl = "http://43.205.144.253:8080/ticket";// this https is provider application
		
		RestTemplate rt = new RestTemplate(); // We can use RestTemplate to test HTTP based restful web services,
		
		ResponseEntity<Ticket> forEntity =
				rt.postForEntity(apiUrl, p , Ticket.class);//postForEntity Create a new resource by POSTing the given object to the URI template
		
		Ticket body = forEntity.getBody();
		
		return body;
	}
	
	//This logic provide show all the ticket from provider application
	
	public List<Ticket> getAllTickets(){
	
		String apiUrl = "http://43.205.144.253:8080/tickets";
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Ticket[]> forEntity =
				rt .getForEntity(apiUrl, Ticket[].class);//getForEntity Retrieve an entity by doing a GET on the specified URL
		
		Ticket[] body = forEntity.getBody();
		
		List<Ticket> tickets = Arrays.asList(body);//Changes made to the array will be visible in the returned list
		
		return tickets;
	}
	

}
