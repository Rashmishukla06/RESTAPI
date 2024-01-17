package com.example.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.binding.Passenger;
import com.example.binding.Ticket;

@Service
public class TicketServiceImpl implements TicketService {
	
	//This logic provide ticket no 
	
	Map<Integer , Ticket> db = new HashMap<>();

	@Override
	public Ticket bookTicket(Passenger p) {
		Ticket t = new Ticket();
		Random r = new Random();
		int id = r.nextInt(10);
		t.setTicketnum(id);
		
		BeanUtils.copyProperties(p, t); //BeanUtils class provides a copyProperties method that copies the properties of source object to target object where the property name is same in both objects
		t.setStatus("CONFIRMED");
		
		db.put(id, t);
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return  db.values();
	}

}
