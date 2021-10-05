package com.xworkz.java.composition.hasrelationship;

public class CompositionPenDemo {
	public static void main(String[] args) {
		
		Pen pen = new Pen();
		pen.name = "cello";
		pen.price = "10rupees";
		pen.type = "ballpen";
		
		Ink ink = new Ink();
		ink.name = "cello";
		ink.color = "black";
		ink.price = "5rupees";
		
		
		System.out.println("details of pen");
		System.out.println("name: "+pen.name);
		System.out.println("type: "+ pen.type);
		System.out.println("inkcolor: "+ ink.color);
		System.out.println("price: "+ pen.price);
		
	}

}
