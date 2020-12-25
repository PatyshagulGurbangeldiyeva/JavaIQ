
public class ReverseOfString {

	public static void main(String[] args) {
		
		// 1. How you will reverse a string
		// what is the difference between String and StringBuffer classes.
		// do we have reverse function---> String is an immutable obj.
		
		String name="John";
		String reverse="";
		for (int i=name.length()-1;i>=0;i--) {
			reverse+=name.charAt(i);
		}
		System.out.println(reverse);
		System.out.println();
		
		System.out.println("second way of reversing: using StringBuffer()");
		
		StringBuffer name2=new StringBuffer("John");
		StringBuffer reverse2=name2.reverse();
		System.out.println(reverse2);
		

	}

}
