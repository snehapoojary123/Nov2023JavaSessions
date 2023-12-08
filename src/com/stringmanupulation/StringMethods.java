package com.stringmanupulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String name ="Sneha Poojary";
		System.out.println(name.charAt(0));///S
		System.out.println(name.indexOf('o'));//7
		System.out.println(name.indexOf('o', name.indexOf('o')+1)); //8
		System.out.println(name.indexOf("Sneha"));//0
		System.out.println(name.indexOf("pSneha")); //-1
		
		String msg = "Welcome Admin";
		
		if(msg.indexOf("Admin")==8) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		String na = "   sneha poojary..";
		System.out.println(na.trim());
		System.out.println(na.replace(" ", ""));
		
		String date = "01/23/89";
		System.out.println(date.replace('/', '-'));
		
		String st = "hello";
		String st1="hellO";
		
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
		System.out.println(st.equalsIgnoreCase(st1));
		
		//split
		String language ="JAVA_RUBY_PYTHON";
		String arrr[]= language.split("_");
		System.out.println(Arrays.toString(arrr));
		
		String yu = "xXSELENIUMxXxJavaXxPythonxX";
		String g[]=yu.split("xX");
		System.out.println(Arrays.toString(g));
		
		String emp = "Sneha|Poojary|Lead QA Engineer|US|Google";
		String elist[] = emp.split("\\|");
		for(String e : elist) {
			System.out.println(e);
			
			String x = "100.0";
			String a = x.replace(".", "");
			int i = Integer.parseInt(a);
			//double a = Double.parseDouble(x);
			System.out.println(i+20);
			
			
			//int to String
			int k = 10808;
			String m = String.valueOf(k);
			System.out.println(m+k);
			
			
			//String to boolean
			String flag = "true";
			Boolean b  = Boolean.parseBoolean(flag);
			if(b) {
				System.out.println("pass");
			}
			
		}
		
	}

}
