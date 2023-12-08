package constructorsconcept;

public class Employee {

	String name;
	int age;
	double salary;
	
	
	//constructor name is same as class name
	//does not have return type
	//constructor will be called when the object is created
	//const.. can be overloaded
	
	public Employee() {// default constructor, no value constructor
		System.out.println("Const..");
		
	}
	
	public Employee(String name, int age, double salary) { // parameterized constructor
		System.out.println("Const overload..");
		
	}
	
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.name="Sneha";
		obj.age=34;
		obj.salary=2000000;
		
		Employee obj1 = new Employee("shweeta",36,4000000);
		Employee obj2= new Employee();
		

	}

}
