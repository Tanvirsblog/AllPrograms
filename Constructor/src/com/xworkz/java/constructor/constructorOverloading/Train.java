package com.xworkz.java.constructor.constructorOverloading;

public class Train {
	String name;
	String type;
	int number;
	String source;
	String destination;
	int capacity;
	
	Train(){
		name = "Shatabdi";
		type = "Fast train";
		number = 2021;
	
	}
	
	Train(String source,String destination ,int capacity){
	 this.source = source;
	 this.destination = destination;
	 this.capacity  = capacity;
	       
	      
	}

}
