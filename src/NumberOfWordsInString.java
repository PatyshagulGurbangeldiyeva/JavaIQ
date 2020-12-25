
public class NumberOfWordsInString {
	
	public static void main (String [] args) {
		
		String s= "Hello I am Santa bye";
		System.out.println(words(s));
	}
	
	
	public static int words(String s) {
		int len;
		
	String [] str=s.split(" ");
	 len=str.length;
	
	return len;
	}
	
	
	
	
}
