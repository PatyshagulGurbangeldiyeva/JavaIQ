
public class MaximumAndMinimumNumber {
	
	public static void main (String [] args) {
		int [] num= {1,2,3,4};
		maxMin(num);
	}
	

	
	public static void maxMin(int [] num) {
		int max=0;
		int min=0;
		
		for (int i=0; i<num.length; i++) {
			if (num[i]>max) {
				max=num[i];
			}else {
				min=num[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	
	
	
	
}
