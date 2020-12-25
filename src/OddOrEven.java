// print the number if it is even or odd
public class OddOrEven {
	int x;
	
	public String evenOrOdd() {
		String result;
		
		if (x%2==0) {
			result="number is even";
			System.out.println(result);
			
			
		}else {
			result="number is odd";
			System.out.println(result);
		}
		return result;

	}
	
	
	public static void main  (String args[]) {
	
	
	OddOrEven obj=new OddOrEven();
	obj.x=5;
	//System.out.println(obj.evenOrOdd()); //-----> if you did not put sout inside the blocks you need to print the result
	obj.evenOrOdd(); // if you put sout inside the method you can just call the method it will be executed


}
}
