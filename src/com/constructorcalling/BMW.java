package com.constructorcalling;

public class BMW extends Car{
	
	//super
	//1. will call parent class constructors
	//2. will call parent class variables
	//3.will call parent class method
	
	private int bmw_speed = 70;
	
	public void calSpeed() {
		System.out.println("BMW Speed: "+ bmw_speed);
		int carSpeed = super.bmw_speed;
		System.out.println("Car Speed: "+ carSpeed);
		int diff = carSpeed - bmw_speed;
		System.out.println("Diff SPeed: "+ diff);
	}
	
	public BMW() {
		//super(); // calling car class default constructor
		super("S!",40);
		
		System.out.println("BMW..");
		
		
	}
@Override	
public void display() {
		super.display();
		System.out.println("bmw display");
	}

}
