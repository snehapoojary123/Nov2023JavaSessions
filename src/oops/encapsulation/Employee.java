package oops.encapsulation;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private String city;
	
	
	
	public Employee(String name, int age, double salary, String city) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", city=" + city + "]";
	}
	

}
