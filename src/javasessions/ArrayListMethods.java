package javasessions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
	
		ArrayList<Integer> ar = new ArrayList<Integer>(20);// Default virtual segment = 10, Assign 20 manually
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		numList.add(500);
		System.out.println("size: "+numList.size());
		numList.remove(2);
		System.out.println("size: "+numList.size());
		System.out.println(numList.get(2));
		
		
		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("sneha","shobha","didi","sanjeev"));
		System.out.println("size: "+empList.size());
		System.out.println(empList);
		empList.add("kannan");
		System.out.println("size: "+empList.size());
		System.out.println(empList);
		empList.add(0,"dheer");
		System.out.println(empList);
		//empList.add(8,"dheeraj");//java.lang.IndexOutOfBoundsException: 
		
		List<Integer> num = Arrays.asList(1,2,3,45);
		System.out.println(num.size());
		
		List<String> name = Arrays.asList("chrome","ie","firefox","safari");
		System.out.println(name);

		List<String> empList1 = new ArrayList<String>();
		
		ArrayList<Integer> randomList = new ArrayList<Integer>(Arrays.asList(3,5,6,3,23,67,8));
		System.out.println(randomList);
		Collections.sort(randomList);
		Collections.reverse(randomList);
		System.out.println(randomList);
		
		for(int i =0 ; i <randomList.size(); i++) {
			System.out.println(randomList.get(i));
		}
		
		int test[]= {2,5,34,21,1,3,};
//		System.out.println(Arrays.toString(test));
//		Arrays.sort(test);
//		System.out.println(Arrays.toString(test));
		
		System.out.println("------------------------");
		
		ArrayList<String> copyList = new ArrayList<String>(Collections.nCopies(5, "Phone"));
		System.out.println(copyList);
		
		
	}

}
