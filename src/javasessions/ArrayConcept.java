package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//1. declare with new keyword
		
		int a[] = new int[4];
		
		
		System.out.println(a[1]);// 0 - default value of int is 0
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		System.out.println(a[1]); //20
		//System.out.println(a[4]); //ArrayIndexOutOfBounds exception
		//System.out.println(a[-1]);//ArrayIndexOutOfBounds exception
		//System.out.println(a[1.1]); //Error
		
		
		int len = a.length;
		System.out.println(len + ": length of array");
		
		int hi = len -1;
		System.out.println("highest index=" + hi);
		
		System.out.println("lowest index=" + 0);
		
		// print all the values from array
		
		for(int j = 0; j<a.length; j++) {
			System.out.println(a[j]);
		}
		
		//without using for loop
		
		System.out.println(a);// memory address of array a
		
		System.out.println(Arrays.toString(a));
		//double array
		
		double d[] = new double[5];
		d[0]=2.3;
		d[1]=3.3;
		d[2]=4.3;
		d[3]=5.3;
		d[4]=d[3]+d[2];
		
		System.out.println(Arrays.toString(d));
		
		String name[] = new String[3];
		name[0] = "sneha";
		name[1] = "kannan";
		name[2] = "shweeta";
		
		System.out.println(Arrays.toString(name));
		System.out.println("total employees: "+name.length);
		
		for(int i =0; i <name.length; i++) {
			System.out.println(name[i]);
			if(name[i].equals("sneha")) {
				System.out.println("sneha slary is $250,000");
				break;
			}
		}
		
		
		
		

	}

}
