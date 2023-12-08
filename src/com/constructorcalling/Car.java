package com.constructorcalling;

public class Car {
	
	String name;
	int price;
	protected int bmw_speed = 80;
	
	public Car() {
		System.out.println("Car..");
	}
	
	public Car(String name, int price) {
		
		this.name = name;
		this.price = price;
		System.out.println(name+ " "+ price);
	}

	
	public void display() {
		
		System.out.println("car display");
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
	
	

}
