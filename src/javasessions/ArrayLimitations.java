package javasessions;

import java.util.Arrays;

public class ArrayLimitations {

	public static void main(String[] args) {
		
		
		int product[] = new int[50];
		
		//limitations of array
		//1. size is fixed:static array -> we need to use dynamic array - ArrayList
		//2. Can only store similar data type in an array - > we need to use ObjectArray
		
		
		//Object is a class in Java
		
		Object emp[] = new Object[5];
		emp[0] ="Tom";
		emp[1] =32;
		emp[2] =23.33;
		emp[3] ='M';
		emp[4] = true;
		
		System.out.println(Arrays.toString(emp));
		
		for(int i =0; i <emp.length; i++) {
			System.out.println(emp[i]);
		}
		
		//static array examples
		
		//1.bookmyshow --->200 tickets 
		//2. Flight/Bus booking system
		//3. E-Commerce App ---> Category od projects
		//4. Country dropdown
		
		
		
		
		
	}

}
