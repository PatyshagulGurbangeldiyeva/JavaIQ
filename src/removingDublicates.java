
public class removingDublicates {
	
	/*
	 * Write a return method that can remove the duplicated values from String
	 * ex: removeDup("AAABBBCCC")===> ABC
	 */

	
	public static void main(String[] args) {
		
		String str="AAABBBCCCddfgg";
		System.out.println(removeDup(str));
		
	}
	
	public static String removeDup(String str) {
		
		String result="";
		
		for (int i=0; i<str.length(); i++) {
			if (!result.contains(str.substring(i,i+1))) {
				result+=str.substring(i, i+1);
				
			}
		}
		
		return result;
	}
}
