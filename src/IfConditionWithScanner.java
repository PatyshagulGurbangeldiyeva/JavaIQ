import java.util.Scanner;

public class IfConditionWithScanner {
	
	// as to customer to write amount of loan
	// then write a condition where ---> where the loan is less ot equal to 250000 then "the loan will be given",
	// but if the loan is more that it then the asking loan will be rejected
	int amount;
	
	public String loan() {
		String answer="";
		if (amount<=250000) {
			answer="the loan will be given";
		}else {
			answer=" loan will be rejected";
		}
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Please write an amount that you want");
		int value=input.nextInt();
		
		IfConditionWithScanner obj=new IfConditionWithScanner();
		obj.amount=value;
		System.out.println(obj.loan());
		
	}
	


}
