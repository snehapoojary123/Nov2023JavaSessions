package javasessions;

public class Shopping {
	
	// Method overloading: Same class if we have 
	//1.same method name but 
	//2.different method parameter
	//3.different no of parameter
	//4.different sequence o parameter
	//5.return type does not matter 

	public void test() {
		System.out.println("test..");
	}
	
	public void test(String name) {
		System.out.println("test..");
		System.out.println("test..");
	}
	public void test(String name,String sname) {
		System.out.println("test..");
		System.out.println("test..");
	}
	
	public void test(String name,int i) {
		System.out.println("test..");
		System.out.println("test..");
	}
	public void test(int i,String name) {
		System.out.println("test..");
		System.out.println("test..");
	}
	
	public void test(int i) {
		System.out.println("test..");
		System.out.println("test..");
	}
	
	public void login() {
		
	}
	public void login(String username,String pwd) {
		
	}
	public void login(String username,String pwd,String role) {
		
	}
	
	//
	public void search() {
		
	}
	public void search(String category) {
		
	}
	public void search(String category,String product) {
		
	}
	public void search(int price,String product) {
		
	}
	public void search(int price,String product, String color) {
		
	}
	
	//
	public void payment(String upi) {
		
	}
	public void payment(String paypal, String discount) {
		
	}
	public void payment(String creditcard, String location, int cvv) {
		
	}
	
	
	
	public static void main(String[] args) {
		
		

	}

}
