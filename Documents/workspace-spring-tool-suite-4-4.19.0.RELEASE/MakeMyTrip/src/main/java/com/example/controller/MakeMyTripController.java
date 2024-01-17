package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.binding.Passenger;
import com.example.binding.Ticket;
import com.example.service.MakeMyTripService;

@Controller
public class MakeMyTripController {
	
	@Autowired
	private MakeMyTripService service;
	
	//this logic shows book the ticket and shows succeed msg
	
	@PostMapping("/ticket")
	public String ticketBooking(Passenger p ,Model model) {
		
		Ticket bookTicket = service.bookTicket(p);
		model.addAttribute("msg", "Your Ticket Booked");
		return "bookTicket.html";
		
		
	}
	
	// book ticket
	
	@GetMapping("/book-ticket")
	public String bookTicket(Model model) {
		
		model.addAttribute("p", new Passenger());
		
		return "bookTicket.html";
	}
	
	 //shows all the ticket from provider
	
	@GetMapping("/")
	public String index(Model model) {
		
		List<Ticket> allTickets = service.getAllTickets();
		
		model.addAttribute("tickets",allTickets);
		
		return "index.html";
	}

}
