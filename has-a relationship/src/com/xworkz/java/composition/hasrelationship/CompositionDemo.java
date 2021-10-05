package com.xworkz.java.composition.hasrelationship;

public class CompositionDemo {
	
	public static void main(String[] args) {
	
		Bird bird = new Bird ();
		bird.name = "Parrot";
		bird.color = "Green";
	
		
		Wing wing = new Wing ();
		wing.color = "Green";
		wing.noofwings = 2;
		
		System.out.println("Bird has-a wings");
		System.out.println("name: "+bird.name);
		System.out.println("color: "+bird.color);
		System.out.println("noofwings: "+wing.noofwings);
		
		
	}

}
