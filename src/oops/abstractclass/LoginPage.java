package oops.abstractclass;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("lp const...");
	}
	
	public LoginPage(int i) {
		System.out.println("lp const..."+i);
	}

	@Override
	public void url() {
		// TODO Auto-generated method stub
		int count = super.COUNT;
		System.out.println(count);
		
	}

	@Override
	public void title() {
		// TODO Auto-generated method stub
		
	}
	
	public void forgotPassword() {
		System.out.println("Login page - forgotPassword");
	}
	
	@Override
	public void pageLoad() {
		System.out.println("Page load should be 2 sec");
	}

}
