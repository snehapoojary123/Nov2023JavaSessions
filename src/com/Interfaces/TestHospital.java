package com.Interfaces;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital obj = new FortisHospital();
		obj.cardioService();// interface implementation
		obj.dental(); // interface implementation
		obj.emergencyServices(); // interface implementation
		obj.medicalClaim(); // interface implementation
		obj.medicalTesting();// inheritence from class
		FortisHospital.billing();
		obj.medicalTest();// Override interface default method
		System.out.println(obj.min_fee);
		System.out.println(FortisHospital.min_fee);
		System.out.println("-----------");
		
// top casting: child class objects can be reffered by parent interface variable
		// can only access overrriden methods
		USMedical us = new FortisHospital();
		us.cardioService();
		us.medicalTest();
		USMedical.billing();
		
		//static final interface class varibale 
		System.out.println(USMedical.min_fee);
		

	}
}
