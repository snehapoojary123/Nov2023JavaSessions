package javasessions;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		
		//without using new keywork - array literals
		
		int a [] = {1,2,3,4,5};
		int a1[] = new int [5];// only allocating memory location and no values

		
		char ch[] = {'a','e','i','o','u'};
		
		System.out.println(Arrays.toString(ch));
		
		for(int i =0; i <ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		String browser[] = {"chrome","ie","firefox","safari"};
		
		for ( int i=0; i <browser.length; i++) {
			System.out.println(browser[i]);
			switch (browser[i]) {
			case "chrome":
				System.out.println("chrome..");
				
				break;
			case "ie":
				System.out.println("not supported..");
				
				break;
			case "firefox":
				System.out.println("mozrella..");
				
				break;
			case "safari":
				System.out.println("mac..");
				
				break;

			default:
				break;
			}
		}
		
	}

}
