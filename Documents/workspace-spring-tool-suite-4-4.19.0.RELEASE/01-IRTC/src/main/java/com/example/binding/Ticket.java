
//Information for Ticket. This is the Provider application. 

package com.example.binding;

public class Ticket {
	
	private Integer ticketnum;
	private String name;
	private String email;
	private String from;
	private String to;
	private String doj;
	private String trainNum;
	private String status;
	
	//Setter and getter method
	
	public Integer getTicketnum() {
		return ticketnum;
	}
	public void setTicketnum(Integer ticketnum) {
		this.ticketnum = ticketnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//tostring method we can use for display data
	
	@Override
	public String toString() {
		return "Ticket [ticketnum=" + ticketnum + ", name=" + name + ", email=" + email + ", from=" + from + ", to="
				+ to + ", doj=" + doj + ", trainNum=" + trainNum + ", status=" + status + "]";
	}
	
	//Constructor using parameter
	
	public Ticket(Integer ticketnum, String name, String email, String from, String to, String doj, String trainNum,
			String status) {
		super();
		this.ticketnum = ticketnum;
		this.name = name;
		this.email = email;
		this.from = from;
		this.to = to;
		this.doj = doj;
		this.trainNum = trainNum;
		this.status = status;
	}
	
	//constructor using super object
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
