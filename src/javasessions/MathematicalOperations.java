package javasessions;

public class MathematicalOperations {

	public static void main(String[] args) {
		
		// ANy number divisible by 0 will give Arithmetic Exception
		//Any decimal number divided by 0 will give Infinity
		//0.0/0.0 will give NaN - Not a Number 
		
		System.out.println(9/3);//3
		System.out.println(9/2);//4
		System.out.println(9f/2f);//4.5
		System.out.println(9f/2);//4.5
		System.out.println(9/2f);//4.5
		System.out.println(9.0/2);//4.5
		System.out.println(9/2.0);//4.5
		System.out.println(9.2/2.0);//4.6
		System.out.println((float)9/2);//4.5
		
		System.out.println(0/9);//0
		System.out.println(0.0/9);//0.0
		//System.out.println(9/0);//Arithmetic Exception in thread "main" java.lang.ArithmeticException: / by zero

		
		//System.out.println(0/0);//Arithmetic Exception 
		
		System.out.println(9.0/0);// Infinity
		System.out.println(9/0.0);//Infinity
		//System.out.println('a'/0);Arithmetic Exception
		System.out.println("sneha"+0);
		System.out.println(0.0/0.0);//NaN - Not an Number
		System.out.println(5.0/0.0);//Infinity
		System.out.println(0.0/2.0);//0.0
		
		System.out.println((float)9/0);//Infinity
		System.out.println(0.0/0);//NaN
		System.out.println((float)0.0/0);//NaN
		System.out.println(0/0.0);//NaN
		
		System.out.println(9/0.0);//Infinity
		
		System.out.println('a'/2);//48
		System.out.println((float)'a'/2);//48.5
		
		System.out.println(9%3); //0
		System.out.println(9%2); //1 - 9 is odd number
		System.out.println(100 % 5);//0 even number is any number completely divisible by 2
		
		//System.out.println(0/0); Arithmetic Exception
		
		
	}

}
