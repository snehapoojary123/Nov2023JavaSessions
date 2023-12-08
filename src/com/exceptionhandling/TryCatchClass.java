package com.exceptionhandling;

public class TryCatchClass {
	
	
	public void m1() {
		
	}
	
	public void m2() {
		try {
		m3();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void m3() throws ArithmeticException {
		
		
			int i = 9/0; 
			System.out.println(i);
		
		}
		
	

	public static void main(String[] args) {
		
		TryCatchClass t1 = new TryCatchClass();
		t1.m2();

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
//		try{
//			int i = 9/0; 
//		}catch(Exception e) {
//			System.out.println("AE is coming");
//			e.printStackTrace();
//		}
		// RunTime Exception java.lang.ArithmeticException:
		//Unchecked Exception
		
		System.out.println("bye");
		System.out.println("bye");
		System.out.println("bye");
		System.out.println("bye");
	}

}
