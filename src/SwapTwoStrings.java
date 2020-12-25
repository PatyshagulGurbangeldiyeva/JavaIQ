
public class SwapTwoStrings {
	
	
	public static void main (String [] args) {
		
		String str1="Hello";
		String str2="Bye";
		
		str1=str1+str2; // helloBye
		
		str2=str1.substring(0,str1.length()-str2.length());
		System.out.println(str2);
		
		// str1----> HelloBye
		// str2----> Hello
		
		str1=str1.substring(str2.length());
		System.out.println(str1);
		
		
		
		
		
		
	}

}
