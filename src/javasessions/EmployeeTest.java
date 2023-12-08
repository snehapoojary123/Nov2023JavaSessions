package javasessions;

public class EmployeeTest {
	
	String name;
	int age;
	
	public void getEmployee(EmployeeTest em) {
		em.name="Sneha";
		em.age=34;
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeTest obj = new EmployeeTest();
		obj.getEmployee(obj);// call by reference
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.name="Shweeta";
		obj.age=36;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.getEmployee(obj);// call by reference
	}

}
