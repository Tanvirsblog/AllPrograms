package com.xworkz.java.constructor.noArgument;

public class NoArgumentConstructorDemo {
	public static void main (String[] args) {
		
		Flight indigo = new Flight("indigo","I500",400,"Delhi","UAE");
		
		Flight spicejet = new Flight("spicejet","S300",350,"Pune","USA");
		
		Flight airindia = new Flight();
		
		System.out.println(indigo.name);
		System.out.println(indigo.number);
		System.out.println(indigo.capacity);
		System.out.println(indigo.source);
		System.out.println(indigo.destination);
		
		
		
		System.out.println(airindia.name);
		System.out.println(airindia.number);
		System.out.println(airindia.capacity);
		System.out.println(airindia.source);
		System.out.println(airindia.destination);
		
		
		System.out.println(spicejet.name);
		System.out.println(spicejet.number);
		System.out.println(spicejet.capacity);
		System.out.println(spicejet.source);
		System.out.println(spicejet.destination);
	}

}
