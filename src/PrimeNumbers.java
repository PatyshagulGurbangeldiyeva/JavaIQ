
public class PrimeNumbers {
	
	// get all the prime numbers up to 20
	// as we want have all the prime numbers from 2 - 20 we need to create a list
	
	public static void PrimeNumbers(int num) {
		if (num>1) {
		for(int i=2; i<=num; i++) { // in this loop we are getting numbers from 2 -20
			
			for (int j=2; j<=i; j++) { // in this loop we are getting the numbers that will  divide the main number 2-20
				if (i==j) {
					System.out.print(i+" "); // here we are getting prime numbers
				}
				if (i%j==0) {
					break;
				}
			}
		}
	}
	}

	public static void main(String[] args) {
		
		PrimeNumbers(20);

	}

}
