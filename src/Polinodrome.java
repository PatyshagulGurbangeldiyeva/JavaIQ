
public class Polinodrome {
	public static void main (String [] args) {
		String str= "aabbac";
		
		polindrome(str);
		
		System.out.println(isPolindrome(str));
		
	}
	
	
	public static void polindrome(String s) {
		
		String reverse="";
		
		for (int i=s.length()-1; i>=0; i--) {
			reverse+=s.charAt(i);
		}
		System.out.println("the reverse of '"+s+"' is: "+reverse);
	}
	
	public static boolean isPolindrome(String s) {
		boolean isPol=true;
		String reverse="";
		for (int i=s.length()-1; i>=0; i--) {
			reverse+=s.charAt(i);
		}
		if (reverse.equalsIgnoreCase(s)) {
			isPol=true;
		}else {
			isPol=false;
		}
		
		
		return isPol;
	}
	

}
