package com.xworkz.java.composition.hasrelationship;

public class Pen {
	String name;
	String price;
	String type;
	Ink ink;
	
	void Write() {
		System.out.println("by using pen we can write");
	}

}
