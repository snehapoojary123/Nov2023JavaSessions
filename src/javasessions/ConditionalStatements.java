package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =5;
		int b =10;
		
		//System.out.println(a==b);//false
		
	
		if(a==b) {
			System.out.println("hi");
		}
		else {
			System.out.println("hello");
		}
		int c =1;
		
		if(c>a) {
			System.out.println("bye");
		}
		
		if(true) {
		System.out.println("PASS");
	}
		else { // dead code this block will never be executed
			System.out.println("FALSE");
		}
		
		boolean flag = true;
		if(flag) {
			System.out.println("hi testing");
		}else {
			System.out.println("bye testing");
		}
		
		boolean test = true;
		if(!test) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
		
		// nested if
		int num =85;
		if(num<=100) {
			System.out.println("Calculating marks");
			if(num>=90) {
				System.out.println("Grade A");
				if(num==100) {
					System.out.println("100% scolarship");
				}else {
					System.out.println("You are not eligible for 100% scolarship");
				}
			}else {
				if(num>=80) {
					System.out.println("Grade B");	
				}
				
				
			}
		}else {
			System.out.println("Please pass the right marks");
		}
		// if if if else
//		String browser ="Firefox";
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome..");
//			//break; cannot use break without switch or loops
//		}
//		if(browser.equals("IE")) {
//			System.out.println("launch IE..");
//		}
//		if(browser.equals("Firefox")) {
//			System.out.println("launch Firefox..");
//		}else {
//			System.out.println("please pass right browser");
//		}
		
		//if elseif
		String browser ="IE";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome..");
		}
		else if(browser.equals("IE")) {
			System.out.println("launch IE..");
		}
		else if(browser.equals("Firefox")) {
			System.out.println("launch Firefox..");
		}else {
			System.out.println("please pass right browser");
		}
		
	}

}
