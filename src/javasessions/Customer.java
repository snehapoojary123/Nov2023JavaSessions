package javasessions;

public class Customer {
	
	String name;
	int age;
	double salary;
	char gender;
	boolean isActive;
	String dob;
	static final  String department ="IT";


	public static void main(String[] args) {
	
		Customer c1 = new Customer();
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);
		System.out.println(c1.gender);
		System.out.println(c1.isActive);
		System.out.println(c1.dob);
		
		c1.name="Sneha";
		c1.age=34;
		c1.salary =2500000;
		c1.gender='F';
		c1.isActive=true;
		c1.dob="04/20/1989";
		
	
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);
		System.out.println(c1.gender);
		System.out.println(c1.isActive);
		System.out.println(c1.dob);
		// Print static variable
		System.out.println(Customer.department);
		System.out.println(department);
		
		new Customer(); // no reference obj
		
		Customer c2 = new Customer();
		c2=null; // numm reference object
		
		//for memory optimization JVM will active garbage collector to destroy no reference and numm reference objects from heap
		
		
		
	}

}
