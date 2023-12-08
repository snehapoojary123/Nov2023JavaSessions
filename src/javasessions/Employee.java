package javasessions;

public class Employee {
	
	//Class variable or class data meneber or global variable
	
	String name;//="Shweeta";
	int age;//=36;
	String city="Goa"; // hard coded defaut value to global variable : all obj reference will have same city
	
	

	public static void main(String[] args) {
		
		// inside a method = local varibale
		
		//String name ="sneha";
		//System.out.println(name);
		
		//class is a template or a blueprint of an object
		//object is a physical entity 
		
		//object of class: new keyword
		
		Employee obj = new Employee();
		//Type	obj reference Object
		
		obj.name="sneha";
		obj.age=34;
		obj.city="Milwaukee";
		
		System.out.println(obj.name+ " "+ obj.age+ " "+ obj.city);
		
		Employee obj1 = new Employee();
		//obj1.name="kannan";
		//obj1.age=42;
		//obj1.city="Milwaukee";
		
		System.out.println(obj1.name+ " "+ obj1.age+ " "+ obj1.city);
		
		//3rd object - no reference object not recommended due to memory
		new Employee().name="Shobha";
		new Employee().age=66;
		
		System.out.println(new Employee().name+ " "+ new Employee().age+ " "+ new Employee().city);
		
		
		

	}

}
