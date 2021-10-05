package com.xworkz.java.hasarelationship;

public class AggregationDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Tanvir";
		student.id = 100;
		student.collageName = "GHR";
		
		Library library = new Library();
		library.name = "Sharada";
		library.location = "Jalgaon";
		library.contactNumber = 990240857;
		library.student =student;
		
		System.out.println("student details of the library:");
		System.out.println("name: "+library.student.name);
		System.out.println("id: "+library.student.id);
		System.out.println("collage: "+library.student.collageName);
	}

}
