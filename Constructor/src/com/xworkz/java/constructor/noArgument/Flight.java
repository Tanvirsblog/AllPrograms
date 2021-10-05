package com.xworkz.java.constructor.noArgument;

public class Flight {
	String name;
	String number;
	int capacity;
	String source;
	String destination;
	
	Flight(){
		name ="Air India";
		number="N395";
		capacity =370;
		source ="Pune";
		destination ="Goa";
	}
	
	Flight(String name,String number,int capacity,String source,String destination){
		this.name = name;
		this.number = number;
		this.capacity = capacity;
		this.source = source;
		this.destination = destination;
		
	
	}

}
