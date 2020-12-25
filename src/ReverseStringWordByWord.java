
public class ReverseStringWordByWord {
	public static void main (String [] args) {
		
		String str=" Hello I am A Santa";
		reverse(str);
	}
	
	public static void reverse(String s) {
		String [] str=s.split(" ");
		String rev="";
		
		for (int i=str.length-1; i>=0; i--) {
			rev+=str[i]+" ";
		}
		System.out.println(rev);
	}
	
	

}
