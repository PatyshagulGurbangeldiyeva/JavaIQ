
public class FindDublicateWord {
	
	public static void main (String [] args) {
		findDublicates ("Hello Sam Hello");
		
	}
	
	public static void findDublicates (String s) {
		
		String [] str=s.split(" ");
		
		for (String str1:str) {
			System.out.println(str1);
		}
		

	}
	
	
	

}
