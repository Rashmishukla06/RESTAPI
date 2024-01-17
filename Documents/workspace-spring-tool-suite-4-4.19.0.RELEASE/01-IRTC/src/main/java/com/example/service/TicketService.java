//springboot concept binding --->service---->controller--->display data
//service available for ticket

package com.example.service;

import java.util.Collection;

import com.example.binding.Passenger;
import com.example.binding.Ticket;

//using Interface 

public interface TicketService {
	
public Ticket bookTicket(Passenger p); // ticket using binding class. // Passenger using binding class object 
	
	public Collection<Ticket> getAllTickets(); //The root interface in the collection hierarchy. A collectionrepresents a group of objects, known as its elements. Somecollections allow duplicate elements and others do not

	//getAllTickets(); we can use for controller to access the ticket information
}
