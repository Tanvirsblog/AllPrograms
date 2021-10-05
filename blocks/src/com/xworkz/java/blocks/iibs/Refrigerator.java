package com.xworkz.java.blocks.iibs;

public class Refrigerator {
	
	String brand;
	String color;
	String capacity;
	String powerconsumption;
	
	{
		System.out.println("calling sib1");
	brand = "LG";
	color = "Red";
	capacity = "175liter";
	powerconsumption = "230v";
	}
	
	{
		System.out.println("calling sib2");
		brand = "BPL";
		color = "Black";
		capacity = "195liter";
		powerconsumption = "230v";
	}
}
