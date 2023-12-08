package javasessions;

public class PolymorphismConcept {
	
	public void setBrowser(String browserName) {
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Initialise chrome browser...");
			break;
			
		case "ie":
			System.out.println("Initialise ie browser...");
			break;
		case "firefox":
			System.out.println("Initialise firefox browser...");
			break;
		case "safari":
			System.out.println("Initialise safari browser...");
			break;

		default:
			System.out.println("Please enter the correct browser.."+ browserName);
			break;
		}
	}

	public static void main(String[] args) {
		
		PolymorphismConcept obj = new PolymorphismConcept();
		obj.setBrowser("test");
		
		//Polymorphism: Manyforms: Method Overloading , Method Overriding
		
		//Method Overloading is Compile time polymorphism or static binding
		//Compiler is taking the decision of which method to call on the basis of argument passed
		
		//Method Overriding: Run time ( Dynamic binding ) during run time by interpretur
		
		
		

		
	}

}
