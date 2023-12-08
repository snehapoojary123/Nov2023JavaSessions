package javasessions;

public class MethodsInJava {
	 String name ="sneha";
	 int amount;
	
	public  void print() {
		
		System.out.println("Hello"+ name);
		
	}
	//no input no return type
	public void test() {
		System.out.println("Hello");
		
		
	}
	
	// no input void returns
	public int totalAmount() {
		
		int i =10;
		int qty = 200;
		amount = i * qty;
		//System.out.println(amount);
		return amount;
		
		
	}
	
	public void printAmount() {
		totalAmount();
		System.out.println(amount);
	}

	public String trainerName() {
		System.out.println("Trainer name");
		String name ="sneha";
		return name;
	}
	
	//some input some return
	
	public String getName(String fname, String lname) {
		
		return fname + " " + lname;
	}
	
	public int sum( int a, int b) 
	// method parameter
	{
		
		int sum = a+b;
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		MethodsInJava obj1 = new MethodsInJava();
		obj1.print();
		//obj1.printAmount();
		int val = obj1.totalAmount();
		System.out.println(val);
		obj1.printAmount();
		String name =obj1.trainerName();
		System.out.println(name);
		if(name.equals("sneha")) {
			System.out.println("sneha automation expert");
		}
		
		System.out.println(obj1.getName("sneha", "poojary"));
		
		int sum = obj1.sum(2, 45); // arguments the values that are passed
		int sum2=obj1.sum(40, 200);
		System.out.println(sum2-10);
		
		System.out.println(sum);
		
	
		
		
		
	}

}
