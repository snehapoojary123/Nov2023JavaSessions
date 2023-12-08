package opps.inheritence;

public class BMW extends Car {
	
	//Method Overriding: Run Time Polymorphism : compiler cannot take decision 
	//when you have a menthod in parent and child class
	//with same name
	//with same no of parameters
	//with same return type
	
	@Override
	public void start() {
		System.out.println("start BMW car...");
	}
	
	public void autoPark() {
		System.out.println("autoPark BMW car...");
	}

	@Override
	public void petrolEngine() {
		System.out.println("BMW petrol engine...");
	}
	
	//@Override // Cannot Override static method
//	public static void billing() { 
//		// Method hiding
//		// Static method in parent and child calss is called method hiding
		// can be inherited by child class
//		System.out.println("BMW Car billing..");
//		
//	}
	
//	public  void service() { // Cannot Override final method from parent class
//		System.out.println("Car Service..");
//	}
	
	//@Override// Cannot Override private methods
	private void pickColor() {
		System.out.println("Car color..");
	}
}
