import java.util.Scanner;

public class SwitchScanner {

	/*
	 * Ask user to enter one of this country: USA,Turkey, Russia, Turkmenistan or Japan and capture it. Once values are captured
	 * print which language user speaks.
	 */
	String country;
	String language="";
	
	public String countryAndLanguage() {
		
		switch (country) {
		case "USA":
			language="English";
			break;
		case "Turkmenistan":
			language="Turkmen";
			break;
		case "Turkey":
		language="Turkish";
		break;
		case "Russia":
			language="Russian";
			break;
		case "Japan":
			language="Japanese";
			break;
			default:
				language="not recorded your country";
		}
		
		
		return language;
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("please enter your country name");
		
		SwitchScanner obj=new SwitchScanner();
		
		
		obj.country=scan.nextLine();
		System.out.println(obj.countryAndLanguage()); 
		
	}
	
	
}
