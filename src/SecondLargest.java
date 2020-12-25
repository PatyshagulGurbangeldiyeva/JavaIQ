
public class SecondLargest {
	
	
	public static void main (String [] args) {
		
		int [] num= {1,7,3,8, 10};
		seconLargest(num);
	}
	
	public static void seconLargest(int [] num) {
		
		int first=num[0];
		int second=0;
	
	for (int i=1; i<num.length; i++) {
		if (num[i]>first) {
			second=first;
			first=num[i];
			
		}	
	}
	System.out.println(second);
	}

}
