
public class SwapTwoNumbers {
	
	
	public static void swap(int x, int y) {
		System.out.println(x+" "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x+" "+y);
	}
	

	public static void main (String [] args) {
		
		int a=10;
		int b=25;
		
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		swap(20, 40);
		
	}
}
