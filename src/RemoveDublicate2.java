import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicate2 {
	
	/*
	 * Find and remove dublicates
	 */
	
	 
	public static void find(String [] str) {
		for (int i=0; i<str.length;i++) {
			for(int j=i+1; j<str.length; j++) {
				if (i!=j && str[i]==str[j]) {
					System.out.println("the dublicate string is "+str[i]);
				}
			}
		}
	}
	
	public static void remove(String [] str) {
		Set<String> set=new LinkedHashSet<>();
		
		for (int i=0; i<str.length; i++) {
			set.add(str[i]);
		}
		System.out.println(set);
	}
	
	
	public static void main (String [] args) {
		String [] str= {"J", "C", "P", "JS", "J"};
		
		remove(str);
		find(str);
	}

	
}
