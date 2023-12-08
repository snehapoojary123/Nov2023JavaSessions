package com.Interfaces;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndiaInterface  {

	//int min_fee=50;
	@Override
	public void physioService() {
	System.out.println("Fortis - physioService");	
		
	}

	@Override
	public void cardioService() {
		
		System.out.println("Fortis - cardioService");	
		
		
	}

	@Override
	public void dental() {
		System.out.println("Fortis - dental");	
		
	}

	@Override
	public void neuroServices() {
		System.out.println("Fortis - neuro");	
		
	}

	@Override
	public void pediaServices() {
		System.out.println("Fortis - pedia");	
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("Fortis - oncology");	
		
	}

	@Override
	public void orthoServices() {
		System.out.println("Fortis - ortho");	
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("Fortis - emergency");	
		
	}
	
	//individual method
	public void medicalTraiing() {
	System.out.println("Medical Training");	
	}
	
	public void medicalClaim() {
		System.out.println("Medical Claim");	
		}

	@Override
	public void genericGudelines() {
		
		System.out.println("Covid guidelines");
		
	}
	
public static void billing() {
		System.out.println("Fortis billing");
	}

//@Override // Default Method can be overriden
//public  void medicalTest() {
//	System.out.println("Fortis Medical - medicalTest");
//}

	

}
