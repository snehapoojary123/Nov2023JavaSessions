package opps.inheritence;

public class TestCar {

	public static void main(String[] args) {
		BMW obj = new BMW();
		obj.start();//Overriden
		obj.stop();//Inherited
		obj.autoPark();//Individual
		obj.engine();//Inherited
		obj.petrolEngine();//Overriden
		BMW.billing();// Inherited car class static
		
		System.out.println("-----------");
		Car obj1 = new Car();
		obj1.start();//Individual
		obj1.stop();//Individual
		obj1.engine();//Inherited
		Car.billing();
		
		
		System.out.println("-----------");
		Car obj2 = new BMW(); 
		// Top/UP Casting: Child class object can be reffered by parent class ref variable
		// only overriden and inherited methods allowed
		
		obj2.start();//Child BMW 
		obj2.stop();//Individual
		obj2.engine();//Inherited
		obj2.petrolEngine();//Child BMW
		//obj2.autoParking();// not allowed -ref type check is failed
		
		System.out.println("-----------");
		Vehicle obj3 = new Vehicle();
		obj3.engine();//Individual
		obj3.stop();//Individual
		
		// down casting: parent car object referenced by child BMW
		//BMW obj4 = (BMW) new Car(); //-- Not Allowed// Run  time exception: ClassCasException
		
		
		
	}

}
