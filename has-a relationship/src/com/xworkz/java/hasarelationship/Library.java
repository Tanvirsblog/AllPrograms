package com.xworkz.java.hasarelationship;

public class Library {
	String name;
	String location;
	long contactNumber;
	Student student;

	
	void searchbook(String bookName) {
		System.out.println("Found"+ bookName);
	}
}
