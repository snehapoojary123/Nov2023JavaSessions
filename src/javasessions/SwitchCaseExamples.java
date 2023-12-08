package javasessions;

public class SwitchCaseExamples {

	public static void main(String[] args) {
		
		// byte , shot, int, char is allowed in switch case
		
		// float, double, long, boolean is not allowed in switch case
		int  num =10;
		
		switch (num) {
		case 10:
			System.out.println(10);
			
			break;

		default:
			break;
		}
		
		String studentname ="sneha poojary";
		int marks =0;
		
		switch (studentname) {
		case "sneha poojary":
			System.out.println("passed");
			marks =100 -10;
			
			break;
		case "shweeta poojary":
			System.out.println("passed");
			marks =100;
			
			break;
		case "shobha poojary":
			System.out.println("passed");
			marks =100;
			
			break;

		default:
			System.out.println("No Student: "+ studentname);
			marks = -1;
			break;
		}
		System.out.println(marks);
		if(marks>=0) {
			System.out.println("print marksheet");
		}

	}

}
