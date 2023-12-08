package com.constructorcalling;

public class TestEmployee {

	public static void main(String[] args) {
		
		
		Employee emp = new Employee("Shweeta");
		System.out.println(emp.toString());
		Employee emp2 = new Employee("Shweeta",36);
		System.out.println(emp2.toString());
	}

}
