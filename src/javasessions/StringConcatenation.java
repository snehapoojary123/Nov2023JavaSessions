package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "sneha";
		String y ="Poojary";
		int a =10;
		int b =20;
		String z="30";
		String w="40";
		
		System.out.println(x+y);//snehaPoojary
		System.out.println(a+b);//30
		System.out.println(y+(b+a));//Poojary30
		System.out.println(a+z);//1030
		System.out.println(w+z);//4030
		System.out.println(a+b+x+y+a+b);//30snehaPoojary1020
		System.out.println(a+b+x+y+(a+b));//30snehaPoojary30
		
		double c = 20.77;
		double d = 34.67;
		
		System.out.println(x+y+c+d);//snehaPoojary20.7734.67
		System.out.println(a+b+c+d);//85.44
		
		char g ='m';
		char p ='n';
		String l ="tseting";
		String n = "automation";
		
		System.out.println(g+p);//219
		System.out.println(g+p+l+n);//219tsetingautomation
		
		System.out.println(g);//m
		System.out.println(p-g);//1
		System.out.println('g');//g
		System.out.println('g'+'p');//215
		System.out.println("a+b");//a+b
		
		//ASCII RANGE
		/* a-z = 97- 122
		 * A-B = 65 - 90
		 * 0-9 = 48 - 56
		 * 
		 * 
		 * 
		 * 
		 */
		
System.out.println((byte)'$');// ASCII 35

System.out.println((int)'a');// ASCII 97
	}

}
