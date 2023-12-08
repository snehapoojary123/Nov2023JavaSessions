package constructorsconcept;

public class EmployeeTest {
	
	String name;
	int age;
	double salary;
	
	//java will add a hidden constructor by default if no constructor created
	//initialize class/global variable
	public EmployeeTest(String name) {
		
		//namee = name;
		this.name = name;
		
		//global or class variable = local variable
		
	}
	
	public EmployeeTest(String name, int age) {
		this.name = name;
		this.age=age;
	}
	
	public EmployeeTest(String name, int age, double salary) {
		this.name = name;
		this.age=age;
		this.salary= salary;
	}
	
	
	

	public static void main(String[] args) {
		 EmployeeTest obj = new EmployeeTest("sneha"); // default constructor is called
		 System.out.println(obj.name);
		 System.out.println(obj.age);
		 System.out.println(obj.salary);
		 
		 EmployeeTest obj1 = new EmployeeTest("shweeta",36);
		 System.out.println(obj1.name);
		 System.out.println(obj1.age);
		 System.out.println(obj1.salary);
		 obj1.salary=34.5;
		 System.out.println(obj1.name);
		 System.out.println(obj1.age);
		 System.out.println(obj1.salary);
	}

}
