package com.stringmanupulation;

public class StringConcept {

	public static void main(String[] args) {
		
		//SCP String constant pool: part of heap memeory
		//String value will be stored in SCP
		//String variable will be stored in stack
		//no duplicate value in SCP
		
		
		//String literals
		String s ="Sneha Poojary";// Created in SCP
		String s0="Sneha Poojary";//NOt created in SCP. its duplicate
		String s1 = "sneha Poojary"; // created in SCP
		
		System.out.println(s==s0); // true
		System.out.println(s==s1); // false
		
		
		//String object with new keyword
		//Will be created in heap
		//s3 in stack
		String s3 = new String("JAVA"); // heap
		String s4 = new String("Sneha Poojary"); // heap
		
		System.out.println(s==s4);//false // memory address //variable reference is compared not value
		System.out.println(s.equals(s4));//true
		
		
		

	}

}
