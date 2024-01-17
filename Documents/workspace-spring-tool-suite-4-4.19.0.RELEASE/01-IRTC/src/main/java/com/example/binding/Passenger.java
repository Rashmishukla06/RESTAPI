
//Information for Passenger. This is the Provider application. 

package com.example.binding;

public class Passenger {
	
	private String name;
	private String email;
	private String from;
	private String to;
	private String doj;
	private String trainNum;
	
	//Setter and getter method
	
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
	
	//tostring method we can use for display data
	
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", email=" + email + ", from=" + from + ", to=" + to + ", doj=" + doj
				+ ", trainNum=" + trainNum + "]";
	}
	
	//Constructor using parameter
	
	public Passenger(String name, String email, String from, String to, String doj, String trainNum) {
		super();
		this.name = name;
		this.email = email;
		this.from = from;
		this.to = to;
		this.doj = doj;
		this.trainNum = trainNum;
	}
	
	//constructor using super object
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
