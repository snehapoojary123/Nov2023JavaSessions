package javasessions;

public class DataTypesConcepts {

	public static void main(String[] args) {
		
		/**
		 * Data types - type of data that we need to store. Java is strict type data
		 * 
		 * 1. Primitive - Takes space in memory without creating object
		 *  e.g boolean ( true, false),
		 *   Numeric 
		 *   	character type: char
		 *   	Integral Value: Integer(byte, short, integer, long), Floating point(float, double)
		 * 2. Non Primitive - Takes space in memory with creating object e.g Class, Arrays, String, Interface --OOPS
		 *  
		 * 
		 * 
		 */
		
		//byte
		//size: 1 byte = 8bits
		//range: -128 to 128
		byte b1 =10;
		b1=30;
		System.out.println(b1);
		byte b2 =20;
		System.out.println(b2);
		byte b3=0;
	//	byte b4=-129; will give error as it is out of range
		
		//size: 2 bytes, 16 bits
		//range: -32768 to 32767
		short s1 = 234;
		short s2 = 32767;
		
		//size = 4bytes 32 bits
		//range = -2147483648 to 2147483647 ( -2^31 to 2^31 -1)
		int i = 214748364;
		//int i1=100.00; not allowed
		
		//size 8bytes 64 bits
		//range -2^63 to 2^63 -1
		long l1 = 2147483648L;// write l or L after number
		long l2 = 214748364;
		long phno = 9892671959l; // not recommended.. if no calculation then do not use long instead use String
		// long examples population, vaccine given 
		System.out.println(phno);
		
		//BigInteger for greater than 8 bytes
		
		//Decimal, floating points
		//size: 4 bytes 32 bits
		//range: after decimal upto 7 digits
		 float f1=18.40f;
		 
		 float f2=(float)2323.56;
		 float f3=100;
		 float f4 = 21878798798765657693.34567886986986875875407878932f;
		 System.out.println(f1+ ": " +f3);
		 
		 //size 8 bytes 64bits
		 //range adter decimal 15 digits
		 double d1 = 12112122.4545454;
		 double d2 =34.65d;
		 
		 //Big Decimal greater than 8 bytes
		 
		 //char: 2byte 16 bits( unicode , japanese language specific ch)
		 //size:
		 //range:0 - 9, a-z, A-Z
		 
		 char a = 'q';
		 char b ='A';
		 char c='!';
		 char d='1';//numeric character
		// char e='-1';// two digits not allowed
		 
		 System.out.println(a);
		 
		 //String - group of characters
		 
		 //size: ~1 bit
		 boolean test;
		 boolean flag = true;
		// System.out.println(test);
		 
		 String name ="sneha";
		 
		
		int num1 =20;
		int num2 =30;
		num2 =-100;
		int num3 = num1 + num2;
		int num4;
		System.out.println("sum is:"+ num3);
		//System.out.println(num4);
		System.out.println(39937687);

	}

}
