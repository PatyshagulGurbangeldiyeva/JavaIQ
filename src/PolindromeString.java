
public class PolindromeString {
	
	//Write a program to check if given String is palindrome.
	
	// Polindrome means that the string or number must be same with the reverse

	// for example madam--> when you read backward you will get the same meaning same letters ot 121---> the same number
	
	public static void PolindromeString(String str) {
		String reverse="";
		int len=str.length();
		for (int i=len-1; i>=0;i-- ) {
			reverse+=str.charAt(i);
		}
		if (reverse.equalsIgnoreCase(str)) {
			System.out.println("it is a polindrome");
			
		}else {
			System.out.println("is not polindrome");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolindromeString ("Madam");
		PolindromeString ("126");

	}

}
