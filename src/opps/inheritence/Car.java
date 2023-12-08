package opps.inheritence;

public class Car extends Vehicle{ // if class is declared as final, it cannot be inherited
	
	//final keyword
	//to avoid inheritence: when class is defined as final
	// to prevent method overrridng
	// to create constant values
	
	public void start() {
		System.out.println("start car...");
	}
	
	public void stop() {
		System.out.println("stop car...");
	}
	
	public final void service() {// final keyword: Cannot Override this method
		System.out.println("Car Service..");
	}
	
	public static void billing() {
		System.out.println("Car billing..");
		
	}
	
	private void pickColor() {
		System.out.println("Car color..");
	}

}
