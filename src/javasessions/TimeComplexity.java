package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		
		// Time to execute the code, how optimized the code is
		
		int i =1;
		System.out.println(i);
		
		//constant time complexity : Big O(1)
		
		String name ="tom";
		System.out.println(name);
		
		//constant time complexity : Big O(1)
		
		int n =10;
		for ( int e =1; e<=n; e++) {
			System.out.println(e);
		}
		// 1 +n +n + n = 3n +1 -> linear equation -> remove constant -> 3n --> remove print constant -> n
		
		//constant time complexity : Big O(n)
		
		//nested loop
		// 00 01 02 03 04
		// 10 11 12 12 14
		// 20 21 22 23 24
		// 30 31 32 33 34
		
		for( int m =0; m <4; m++) {
			for(int k =0; k <=4 ; k++ ) {
				System.out.print(m+""+k+" ");
				
			}
			System.out.println("");
		}
		
		//(1+n+n+n)(1+n+n+n) = (1+3n)(1+3n) = 1+3n+3n+9n^2 = 9n^2+6n+1--Quadratic equation
		//9n^2+6n = 3(3n^2+2n)=n^2+n = n(n+1) = B O(n^2)
		
		
		

	}

}
