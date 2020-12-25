
public class TwoMaximumNumbers {
	
	// Find first two maximum number in array
	
	public static void main (String [] args) {
				
		int [] num= new int [4];
		num [0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		
		
		int max1=0;
		int max2=0;
		
		for (int i=0; i<num.length; i++) {
			
				if (num[i]>max1 && max1>max2) {
					max1=num[i];
					max2=max1;
				}
		}
		System.out.println("firsNumber is "+max1);
		System.out.println("secondNumber is "+max2);
		
		
	}
	
	}

