
public class PrimeNumber3 {
	
	public static boolean primeNumber(int num) {
		boolean isPrime=true;
		for (int i=2; i<=num; i++) {
			
			if (num%i==0) {
				isPrime= false;
				break;
			}
		}
		return isPrime;
	}

	public static void main (String [] args) {
		System.out.println(primeNumber(7));
	}
}
