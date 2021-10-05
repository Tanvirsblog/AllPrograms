package com.xworkz.java.blocks.iibs;

public class InstanceInitializationBlockDemo {

	public static void main(String[] args) {
		
		Refrigerator lg = new Refrigerator();
		
		System.out.println(lg.brand);
		System.out.println(lg.color);
		System.out.println(lg.capacity);
		System.out.println(lg.powerconsumption);
	}
}
