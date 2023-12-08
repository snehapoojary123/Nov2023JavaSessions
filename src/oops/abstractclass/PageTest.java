package oops.abstractclass;

public class PageTest {
	
	public static void main(String argds[]) {
		
		LoginPage lp = new LoginPage(10);
		lp.url();
		lp.title();
		lp.pageLoad();
		lp.forgotPassword();
		lp.logoDisplay();
		lp.footer();
		
		System.out.println("----------------");
		
		Page pg = new LoginPage();
		pg.url();
		pg.title();
		pg.pageLoad();
		pg.logoDisplay();
		pg.footer();
	}

}
