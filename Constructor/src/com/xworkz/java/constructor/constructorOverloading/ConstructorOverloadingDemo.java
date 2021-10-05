package com.xworkz.java.constructor.constructorOverloading;

public class ConstructorOverloadingDemo {
	
	public static void main(String[] args) {
		
		
	
		Train train = new Train();
		System.out.println(train.name);
		System.out.println(train.type);
		System.out.println(train.number);
		
		Train train1 = new Train("Delhi","Pune",1500);
		
		System.out.println(train1.source);
		System.out.println(train1.destination);
		System.out.println(train1.capacity);
	}

}
