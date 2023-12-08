package javasessions;

public class FinalKeyword {

	public static void main(String[] args) {
	
		
		//constant value
		
		int x =10;
		x = 20;
		x=6;
		
		System.out.println(x);
		
		final int days =7;
		//days =10; cannot change the value of final variable 
		int salary = days * 100;
		System.out.println(salary);
		
		final int DEFAULT_TIMEOUT =10; // final variable should be in capital with underscoreS

		final String LOGIN_PAGE_TITLE = "login";
		//LOGIN_PAGE_TITLE = "SNEHA";
	}

}
