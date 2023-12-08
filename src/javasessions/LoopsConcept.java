package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//while loop
		//1 to 100
		
		
//		int i =1;
//		while( i<=10) {
//			System.out.println(i);
//			i =i+2;
//		}
//		int k =1;
//		while(true) {
//			System.out.println("welcome");
//			if(k==5) {
//				break;	
//			}
//			k++;
			
			
			
	//	}
//		for( i =1; i <=10; i++) {
//			System.out.println(i);
//		}
		
//		int j =1;
//		for(;j <=10;) {
//			System.out.println(j);
//			j++;
//		}
	//	j++;
		// infinite loop
//		for(;;) {
//			System.out.println("hello");
//		}
		
		for(char ch ='a'; ch <='z'; ch++) {
			System.out.println(ch+ "="+ (byte)ch);
		}
		
		// double, float, int, short, byte, long, char can be used in for/while
		
		for(double d = 1.1; d<=5.5; d++) {
			System.out.println(d);
		}
		
		for(float f = 9.8f; f<=19.8;f++) {
			System.out.println(f);
		}
		
		for(int w=1; w<=10;w++) {
			
		}
		for(int w=1; w<=10;w++) {
			if( w% 2==0) {
				System.out.println(w+": even no");
			}else {
				System.out.println(w+": odd no");
			}
			
		}
		
		//use cases of while loop
		//when no of iterations are not fixed
		//total no of links/images on a web page
		//webtable pagination
		//webelement to appear on page
		//pageload timeout
		//calendar: future or past dates
		//build execution time 	is unknown
		
		//use cases of for loop
		// select a month from dropdown
		// select days of a month
		// if no categories is fixed
		//Array, ArrayList
		//excel data -- test data - rows =1 to rowSize()
		//country list
		//Read data: JSON/XML
		//Read data from database
		
		
		//do while loop
		 int e =1;
		 do {
			 e++; //2 - 11
			System.out.println(e); 
			
		 }
		 while(e<=10);
		 
		 // use cases for do while
		 //webtable pagination : check if element is already present on page 1 then select and end loop
		 //check if element present on page
		 //calendar : if date is already present on landing page
		
	}

}
