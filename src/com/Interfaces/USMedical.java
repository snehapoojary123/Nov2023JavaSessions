package com.Interfaces;

public interface USMedical {
	
	// ANstract Method: No Method body, only Method declaration
	
	// cannot create object of interface
	
	// Allows multiple inheritence with interfaces
	
	//Abstraction: business login is hidden
	
	//bydefault is static and final by nature
	int min_fee=10;
	
	public void physioService();
	
	public void cardioService();
	
	public void dental();
	
	public void emergencyServices();
	
	//After JDK 1.8 we can have static method body
	public static void billing() {
		System.out.println("US medical billing - static method");
	}
	
	////After JDK 1.8 we can have default method with body
	
	public default void medicalTest() {
		System.out.println("US Medical - medicalTest");
	}
}
