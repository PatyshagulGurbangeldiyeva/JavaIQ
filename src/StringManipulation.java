
public class StringManipulation {
	
	public static void main (String[] args) {
	
	String str= "Hello I am a student in a Selenium class";
	
	String str2= "Hi I am glad to see you here";
	
	System.out.println(str.length()); // gives the length of the String
	
	System.out.println(str.charAt(6)); // gives the character on that inde
	
	System.out.println(str.indexOf('a')); //gives the first occurance of  that character
	
	System.out.println(str.indexOf('a', str.indexOf('a')+1)); // gives the second occurance of  that character
	
	System.out.println(str.indexOf("am")); // gives the index of String
	
	System.out.println(str.indexOf("hello")); // it will give -1 as "have" does not appear in string
	
	
	System.out.println(str.equalsIgnoreCase(str2)); // even the sentences same you need to be careffull with capital letters. Letters musrt be same

	System.out.println(str.substring(0,5));// gives the characters that are btw those index
	
	
	//trim
	String s="   hello and bye  ";
	System.out.println(s);
	
	
	System.out.println(s.trim()); // removing space from the beginning and end of the string
	
	
	//Replacing
	String str3="11-22-2020";

	System.out.println(str3.replace('-', '/'));// replacing the charachters
	
	// Split
	
	String str4="Hello_dear_friends";
	
	String str5 []=str4.split("_");
	for (int i=0; i<str5.length; i++) {
		System.out.println(str5[i]);
	}
	
	
	
	// adding new charachter
	String str6="mum";
	System.out.println(str6.concat("s"));
	}
}