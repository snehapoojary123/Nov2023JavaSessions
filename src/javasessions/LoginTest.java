package javasessions;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag =LoginPage.forgotPWD();
		if(flag) {
			System.out.println("change pwd");
		}
		
		LoginPage lp = new LoginPage();
		lp.login("green.sneha@gmail.com","tetsing");
		

	}

}
