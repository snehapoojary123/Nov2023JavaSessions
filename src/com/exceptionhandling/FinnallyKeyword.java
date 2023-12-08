package com.exceptionhandling;

public class FinnallyKeyword {

	public static void main(String[] args) {
		
		System.out.println("hi");
		try {
		int i = 9/0;
		}
		catch(NullPointerException e) { // catch is not madatory if finally os written
			e.printStackTrace();
		}
		catch(ArithmeticException e) { // catch is not madatory if finally os written
			e.printStackTrace();
		}
		finally {
			// always execute this code with or without exception
			// cannot have two finally block
			System.out.println("bye");
		}
		

	}

}
