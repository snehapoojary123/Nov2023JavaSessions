package com.constructorcalling;


public class Employee {
	
	String name;
	int age;
	double salary;
	
	public Employee(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee(String name, int age) {
		this("Rama", 56,9823);
		this.name = name;
		this.age = age;
	}

	public Employee(String name) {
		this("Sneha", 34);
		
		this.name = name;
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
