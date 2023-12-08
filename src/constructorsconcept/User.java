package constructorsconcept;

public class User {
	
	//WAF
	//User can be created if you have
	//1. fname, lname
	//2. fname
	//3. fname, ln, pwd, phone
	//4. fname, ln, pwd, email, phno,city
	//5.fname, lname, email
	
	
	//method: business loginn returns value
	//Cont: to initialize class variable with initial value, no return, no business logic
	
	String fname;
	String lname;
	String emailId;
	String phno;
	String password;
	String city;
	


	public User(String fname) {
	
		this.fname = fname;
	}



	public User(String fname, String lname, String emailId, String phno, String password, String city) {
		
		this.fname = fname;
		this.lname = lname;
		this.emailId = emailId;
		this.phno = phno;
		this.password = password;
		this.city = city;
	}



	public User(String fname, String lname) {
	
		this.fname = fname;
		this.lname = lname;
	}
	
	



	public User(String fname, String lname, String phno, String password) {
	
		this.fname = fname;
		this.lname = lname;
		this.phno = phno;
		this.password= password;
	}



	public User(String fname, String lname, String emailId) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.emailId = emailId;
	}
	



	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", emailId=" + emailId + ", phno=" + phno + ", password="
				+ password + ", city=" + city + "]";
	}



	public static void main(String[] args) {
		
		User obj = new User("Sneha", "Poojary");
		User obj1 = new User("Sneha", "Poojary","green.sneha@gmail.com","23323","city","sdsd");
		System.out.println(obj.fname + " "+ obj.lname);
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		

	}

}
