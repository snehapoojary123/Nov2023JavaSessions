package javasessions;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =90;
		int b =3000;
		int c=7;
		
		if(a>b && a>c) {
			System.out.println("a is the greatest");
		}
		else if (b>c) {
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}

	}

}
