package javasessions;
import java.util.ArrayList;

public class Concept {
	
	//WAF:
	// To supply a browser name: String
	//Business logic: launch browser
	//return true
	
	public boolean launchBrowser(String browser) {
		
		boolean flag = true;
		
		System.out.println("browser name:" + browser);
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome...");
			
			break;
			
		case "ie":
			System.out.println("launch ie...");
			
			break;
		case "firefox":
			System.out.println("launch firefox...");
			
			break;

		default:
			System.out.println("please pass right browser..."+ browser);
			flag = false;
			break;
		}
		
		return flag;
	}

	
	//WAF:
	//supply input param: Company name: IMB, Google
	//return list of employee of company: ArrayList<String>
	
	public ArrayList<String> getEMpList(String company){
		
		System.out.println("Company name: "+ company);
		ArrayList<String> empList = new ArrayList<String>();
		
		if(company.trim().equalsIgnoreCase("IBM")) {
			empList.add("sneha");
			empList.add("radha");
			empList.add("priya");
		}else if(company.trim().equalsIgnoreCase("Google")) {
			empList.add("asha");
			empList.add("shobha");
			empList.add("kannan");
		}
			else {
				System.out.println("incorrect compaby name");
			}
		return empList;
	}
	
	
	
	public static void main(String[] args) {
		
		Concept obj1 = new Concept();
		boolean flag =obj1.launchBrowser("firefox");
		if(flag) {
			System.out.println("enter the url...");
		}
		else {
			System.out.println("do no enter url..");
		}
		
		ArrayList<String> ibmList=obj1.getEMpList("IBM  ");
		System.out.println(ibmList);
		ArrayList<String> gList=obj1.getEMpList("Google");
		System.out.println(gList);
		ArrayList<String> dList=obj1.getEMpList("Tata");
		System.out.println(dList);
		
		
		
	}

}
