package javasessions;

public class Student {
	

	//WAF 
	//create a method  - getStudentMarks
	//pass a parameter : studentName(String)
	//return student marks-> int
	
	public int getStudentMarks(String name) {
		System.out.println("Marks for :"+ name);
		int marks=0;
		if(name.equalsIgnoreCase("sneha")) {
			marks = 80;
		}
		else if(name.equalsIgnoreCase("shweeta")) {
			marks = 90;
		}
		else {
			System.out.println("No Student found, please pass correct name:"+ name);
		}
		
		return marks;
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		int marks = s1.getStudentMarks("Naina");
		System.out.println(marks);

	}

}
