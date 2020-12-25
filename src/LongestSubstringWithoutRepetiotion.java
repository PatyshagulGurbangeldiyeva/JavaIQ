import java.util.HashSet;

public class LongestSubstringWithoutRepetiotion {

	/*
	 * Given "abcdefgabcd"
	 * Find the longest first substring
	 */
	
	
	public static void main (String [] args) {
	String str="abcdefgabc";
	firstSubstring(str);
}
	
	
	public static String firstSubstring(String str) {
		
		HashSet <Character> set= new HashSet <>();
		
		String longest="";
		String longestTillNow="";
		
		for (int i=0; i<str.length(); i++) {
			char c=str.charAt(i);
			if (set.contains(c)) {
				longestTillNow="";
				set.clear();
			}
			set.add(c);
			longestTillNow+=c;
			
			if (longestTillNow.length()>longest.length()) {
				longest=longestTillNow;
			}
		}
		
		
		
		return longest;
	}
	
	

}
