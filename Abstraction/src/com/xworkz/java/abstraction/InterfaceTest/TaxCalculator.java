package com.xworkz.java.abstraction.InterfaceTest;

public class TaxCalculator implements StateTax,CentralTax {
	
	public void propertyTax() {
		System.out.println("property tax of State");
	}
	public void roadTax() {
		System.out.println("road tax of Central");	
	}
}
