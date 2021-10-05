package com.xworkz.java.mobile.hasarelationship;

public class AggregationMobileDemo {
	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
			mobile.name = "Iphone";
			mobile.brand ="Apple";
			mobile.model ="12";
			mobile.phonenumber =959552011;
			
			
		Internet internet = new Internet();
		internet.name = "Airtel";
		internet.speed = "1mbps";
		
		
		System.out.println("Mobile details for internet");
		System.out.println("name: "+mobile.name);
		System.out.println("brand: "+mobile.brand);
		System.out.println("model: "+mobile.model);
			
			
		}
	}
