package oops.encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//Page Object Model is an example for encapsulation
		//Hiding private data members and giving access via public methods
		
		Employee obj = new Employee("Sneha Poojary", 34, 200.0,"Milwaukee");
		obj.setName("Shweeta");
		String name = obj.getName();
		System.out.println(obj.toString());
		Employee obj1 = new Employee("Rama Poojary", 34, 200.0,"Milwaukee");
		System.out.println(obj1.toString());
	}

}
