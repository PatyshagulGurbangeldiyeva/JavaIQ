
public class PolindromeNumber {
	
	public static boolean polindromeNum(String num ) {
		boolean isPolindrom=true;
		String reverse="";
		
		for (int i=num.length()-1; i>=0; i--) {
			reverse+=num.charAt(i);
		}
			if (reverse.equalsIgnoreCase(num)) {
				isPolindrom=true;
				
			}else {
				isPolindrom=false;
			}
			
		
	return isPolindrom;
		
	}


	public static void main(String[] args) {
		
		
System.out.println(polindromeNum("125"));
System.out.println(polindromeNum("454"));
	}

}
