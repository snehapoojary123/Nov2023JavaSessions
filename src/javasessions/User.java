package javasessions;

public class User {
	
	String name;
	int age;
	String city;
	

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name="Sneha";
		u1.age=34;
		u1.city="Milwaukee";
		
		User u2 = new User();
		u2.name="kannan";
		u2.age=42;
		u2.city="Milwaukee";
		
		User u3 = new User();
		u3.name="shweeta";
		u3.age=36;
		u3.city="Goa";
		
		System.out.println(u1.name+ " "+ u1.age+ " "+ u1.city);
		System.out.println(u2.name+ " "+ u2.age+ " "+ u2.city);
		System.out.println(u3.name+ " "+ u3.age+ " "+ u3.city);
		
		System.out.println("---------------------------------");
		u1=u2;
		System.out.println(u1.name+ " "+ u1.age+ " "+ u1.city);
		System.out.println(u2.name+ " "+ u2.age+ " "+ u2.city);
		System.out.println(u3.name+ " "+ u3.age+ " "+ u3.city);
		
		u2 =u3;
		System.out.println("---------------------------------");
		System.out.println(u1.name+ " "+ u1.age+ " "+ u1.city);
		System.out.println(u2.name+ " "+ u2.age+ " "+ u2.city);
		System.out.println(u3.name+ " "+ u3.age+ " "+ u3.city);
		
		u3 =u1;
		System.out.println("---------------------------------");
		System.out.println(u1.name+ " "+ u1.age+ " "+ u1.city);
		System.out.println(u2.name+ " "+ u2.age+ " "+ u2.city);
		System.out.println(u3.name+ " "+ u3.age+ " "+ u3.city);
		
		

	}

}
