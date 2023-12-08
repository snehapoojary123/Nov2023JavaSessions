package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser =" chromE";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("starting chrome..");
			
			break;
		case "ie":
			System.out.println("starting ie..");
			
			break;
		case "firefox":
			System.out.println("starting firefox..");
			
			break;
		case "safari":
			System.out.println("starting safari..");
			
			break;
		default:
			System.out.println("invalid browser"+ browser);
			break;
		}
		
String ch ="p";
		
		switch (ch) {
		case "a":
			System.out.println("vowel");
			
			break;
		case "e":
			System.out.println("vowel");
			
			break;
		case "i":
			System.out.println("vowel");
			
			break;
		case "o":
			System.out.println("vowel");
			
			break;
		case "u":
			System.out.println("vowel");
			
			break;
		default:
			System.out.println("not vowel");
			break;
		}
		
		

	}

}
