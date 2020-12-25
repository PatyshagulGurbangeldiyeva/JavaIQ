
public class Fibonnacci {
	
	// 0 1 (0+1)=2  (1+2)....
	
	public static void main (String [] args) {
		int a=0;
		int b=1;
		int c=0;
		
		System.out.print(a+" "+b+" ");  // it will print first
		for (int i=2;i<10;i++) {
			c=a+b;
			System.out.print(" "+c+" ");
			a=b;
			b=c;
		}
		
	
		System.out.println();
	
	// print the fibonnaci num till 20
	
//	0 1 0+1
	// a  b  c=a+b
	
	int x=0;
	int y=1;
	int z;
	
	System.out.print(x+" "+y+" ");
	
	for (int i=2; i<15; i++) {
		z=x+y;
		System.out.print(" "+z+" ");
		x=y;
		y=z;
	}

}
}