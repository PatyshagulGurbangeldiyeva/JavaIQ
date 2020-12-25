
public class LargestNumber {
	
	public static int largestNum(int [] num) {
		int largest=num[0];
		
		for (int i=1; i<num.length; i++) {
			if (num[i]>largest) {
				largest=num[i];
				
			}
	
		}
		return largest;
		
	}

	public static void main (String [] args) {
	
		int []nums= {1,2,6,7};
		System.out.println(largestNum(nums));
		
		System.out.println("second way");
		
		int [] num= {1,4,7,8,3};
		
		int largest= num[0];
		for (int i=1; i<num.length; i++) {
			if (num[i]>largest) {
				largest=num[i];
			}
			
		}
		System.out.println(largest);
	}
	}
		

	
