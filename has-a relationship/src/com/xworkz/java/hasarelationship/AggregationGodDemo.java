package com.xworkz.java.hasarelationship;

public class AggregationGodDemo {

	public static void main(String[] args) {
		Temple temple = new Temple();
		temple.name = "Balaji";
		temple.location = "Tirupati";
		temple.noOfPeolplepray = 500;
		
		
		God god = new God();
		god.name = "Vishnu";
		god.location = "Tirupati";
		god.temple = temple;
		
		
		System.out.println("Temple detail of God ");
		System.out.println("name: "+god.temple.name);
		System.out.println("location: "+god.temple.location);
		System.out.println("noOfPeolplepray: "+god.temple.noOfPeolplepray);
		
	}
}
