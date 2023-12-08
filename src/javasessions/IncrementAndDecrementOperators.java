package javasessions;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ++ - increase variable value by 1
		// -- decrease variable value by 1
		
		
		// post increment 
		int a =1;
		int b =a++; // original value of a will be assigned to b, then increament a by 1
		System.out.println(a); //2
		System.out.println(b); //1
		
		int c = a+3;
		System.out.println(c);
		
		int d =-98;
		int e = d++;
		System.out.println(d); // -97
		System.out.println(e);// -98
		
		//pre increment
		int g =1;
		int f =++g;
		
		System.out.println(g);// 2
		System.out.println(f); //2
		
		int x1 =-99;
		int x2 =++x1;
		System.out.println(x1);
		System.out.println(x2);
		
		int y =1;
		int y2 =y--;
		System.out.println(y);
		System.out.println(y2);
		
		int x3 =1;
		System.out.println(x3++);//1
		System.out.println(x3);//2
		System.out.println(x3--);//2
		System.out.println(x3);//1
		
		int v1 =3;
		System.out.println(++v1);
		
		int amount =10;
		int finalamt = amount +1;
		
		System.out.println(amount); //10
		System.out.println(finalamt); //11
		
		int rest =-99;
		int rest1 =--rest;
		System.out.println(rest); //-100
		System.out.println(rest1);//-100
		
		int s3=40;
		System.out.println(s3--); //40
		System.out.println(s3); //39
		
		int p3 =50;
		System.out.println(--p3); //49
		System.out.println(p3); //49
		System.out.println(p3+1);//50
		
		int na =1;
		int t1 = na+++na+++na+++na++; //1 + 2 + 3 + 4 =10
				System.out.println(t1);
				System.out.println(na); //5
		
		
		
		
		
	}

}
