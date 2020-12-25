
public class FindAlphaCharacters {
	
	public static void main (String [] args) {
		
		String s="AXNAKLfvdd32029fbakANX";
		alpha(s);
		
	}

	
	public static void alpha(String s) {
		String replaced=s.replaceAll("[^A-Za-z]", "");
		System.out.println(replaced);
	}
	
	
}
