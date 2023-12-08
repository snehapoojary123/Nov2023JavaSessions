package javasessions;
import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray {

	public static void main(String[] args) {
		
		//ArrayList -- Java class
		
		//Create object of ArrayList class
		
		ArrayList ar = new ArrayList();
		System.out.println("size of array: "+ ar.size());
		
		
		ar.add(100); // 0 index
		ar.add(200); // 1 index
		
		System.out.println("size of array: "+ ar.size());
		
		ar.add(200);
		ar.add(500);
		System.out.println("size of array: "+ ar.size());
		
		System.out.println(ar.get(2));
	//	System.out.println(ar.get(4));// java.lang.IndexOutOfBoundsException
		//System.out.println(ar.get(-1)); // java.lang.IndexOutOfBoundsException
		
		ar.add(12.55);
		ar.add('r');
		ar.add("Sneha");
		ar.add(false);
		
		System.out.println("size of array: "+ ar.size());

		
		for( int i =0; i <ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
//		for(ArrayList e: a) {
//		System.out.println(Arrays.toString(ar));
//	}
		
		//generics with ArrayList
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		for(int i =100; i <=105; i++) {
			marks.add(i);
			
		}
		System.out.println("size:"+ marks.size());
		for(int i =0; i <marks.size(); i++) {
			System.out.println("--------"+ marks.get(i));
		}
		
ArrayList<Double> percent = new ArrayList<Double>();
		
		for(double i =100.5; i <=105.5; i++) {
			percent.add(i);
			
		}
		System.out.println("size:"+ percent.size());
		for(int i =0; i <percent.size(); i++) {
			System.out.println("----------"+percent.get(i));
		}
		
		ArrayList<String> browser = new ArrayList<String>();		
		browser.add("chrome");
		browser.add("firefox");
		browser.add("safari");
		browser.add("edge");
		browser.add("opera");
		System.out.println("browser size:"+ browser.size());
		System.out.println(browser);// to print all values
		
		
		// to print all values using for
		for(int i =0; i <browser.size(); i++) {
			System.out.println(browser.get(i));
			if(browser.get(i).equals("chrome")) {
				System.out.println("Google..");
			}
			if(browser.get(i).equals("firefox")) {
				System.out.println("Mozilla..");
				break;
			}
		}
		
		System.out.println("-------------------------------");
		
		// to print all values using for each loop
		for(String e: browser) {
			System.out.println(e);
			if(e.equals("chrome")) {
				System.out.println("Google..");
			}
			
		}
		
		
		ArrayList<Object> empInfoList = new ArrayList<Object>();
		empInfoList.add("Sneha");
		empInfoList.add("34");
		empInfoList.add("IT");
		empInfoList.add('F');
		empInfoList.add(45.5);
		empInfoList.add(true);
		
		System.out.println("Size: "+ empInfoList.size());
		
		for(Object e:empInfoList ) {
			System.out.println(e);
		}
		
		System.out.println(empInfoList);
		
		// use cases
		//uber: cast list
		//website: products list, userlist, employeelist
		// Links on the page
		

	}

}
