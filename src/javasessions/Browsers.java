package javasessions;

public class Browsers {
	
	String name;
	static String hq = "Bangalore";
	
	public int getBrowserVersion() {
		System.out.println("getBrowserVersion");
		return 100;
	}
	
	public static String getBrowserVendor() {
		System.out.println("getBrowserVendor");
		return "Mozilla";
	}

	public static void main(String[] args) {
		Browsers obj = new Browsers();
		int i = obj.getBrowserVersion();
		String name1 =obj.getBrowserVendor();
		System.out.println(i + " "+ name1);
		System.out.println(obj.name);
		System.out.println(obj.hq);
		System.out.println(hq);
		System.out.println(Browsers.hq);
		System.out.println(getBrowserVendor());
		System.out.println(Browsers.getBrowserVendor());

	}

}
