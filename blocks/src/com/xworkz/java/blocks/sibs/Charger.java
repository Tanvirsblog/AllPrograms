package com.xworkz.java.blocks.sibs;

public class Charger {
	
	static String brand;
	String color;
	double price;
	String consumption;
	
	
	{
	color = "black";
	price = 500;
	consumption = "5w";
	
	System.out.println("IIB 1");
	}
	
	{
		System.out.println("IIB 2");
	}
	
	static {
		System.out.println("SIB 1");
		brand ="Mi";
	}
   
	static {
		System.out.println("SIB 2");
		
	}
	Charger(){
		
		System.out.println("constructor");
	}

}
