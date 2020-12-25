
public class SwapTwoStrings2 {
	
	public static void swap(String s1, String s2) {
		
		s1=s1+s2; // HelloBye
		s2=s1.substring(0,s1.length()-s2.length() ); // hello
		s1=s1.substring(s2.length());
		
		System.out.println(s1+" "+s2);
		
		
	}
	
	public static void replace(String s1, String s2) {
		
		s1=s1+s2; // helloBye
		s2=s1.replaceAll(s2, ""); // hello  ---> here you are replacing s2 with empty
		System.out.println(s2);
		s1=s1.replaceAll(s2, ""); // helloBye---> s2=hello will be replaced with empty
		System.out.println(s1);
	}
	
	
	public static void main (String [] args) {
		
		swap("Hello", "Bye");
		
		replace("Say", "Silent");
	}

}
