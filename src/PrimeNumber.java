import java.util.ArrayList;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		boolean isPrime=true;
		
		for (int i=2; i<=num/2; i++) {  // here we used num/2 as the num can be very large number so we don't want to loop till that number
			if (num%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
		
	}

	public static void main(String[] args) {
		
	
		
		System.out.println("the number 10 is prime?: "+isPrime(10));
		
		boolean x=isPrime(17);
		System.out.println("the number 17 is prime?: "+x);
		
		
		
		
		
		
		

		}

	}


