package javasessions;

import java.util.Arrays;

public class LoopsWithForEachLoop {

	public static void main(String[] args) {
	
		// for each loop
		int a[] = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		for (int e: a) {
			System.out.println(e);
		}
		
		double d[] = new double[5];
		d[0]=2.3;
		d[1]=3.3;
		d[2]=4.3;
		d[3]=5.3;
		d[4]=d[3]+d[2];
		
		for( double e: d) {
			System.out.println(e);
		}
	
		
		String name[] = new String[3];
		name[0] = "sneha";
		name[1] = "kannan";
		name[2] = "shweeta";
		
		for(String e: name) {
			System.out.println(e);
		}
		
		Object emp[] = new Object[5];
		emp[0] ="Tom";
		emp[1] =32;
		emp[2] =23.33;
		emp[3] ='M';
		emp[4] = true;
		
		for(Object e: emp) {
			System.out.println(e);
			if(e.equals("Tom")) {
				System.out.println("he is a engineer");
			}
		}
		
		int a1[] = new int[4];
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		a1[3]=40;
		
		for ( int i =a1.length-1;i>=0; i --) {
			System.out.println(a[i]);// 3 2 1 0
		}
		
		

	}

}
