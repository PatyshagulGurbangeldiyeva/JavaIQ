
public class IfConditionTask {
	// declare date and day
	// if day is friday and date is 13th then i am going to watch a scary movie
	// if day is friday and date is not 13th then i am going to watch comedy
	
	
	String day;
	int date;
	
	public String scaryOrComedy() {
		String answer="";
		if (day.equalsIgnoreCase("Friday") && date==13) {
			answer= "I am going to watch a scary movie";
		}else if (day.equalsIgnoreCase("friday") && date!=13) {
			answer= "i am going to watch comedy";
		}else {
			answer="no movie for you";
		}
		
		return answer;
		
	} 
	
	public static void main(String[] args) {
		IfConditionTask obj=	new IfConditionTask();
		obj.day="Thursday";
		obj.date=13;
		String answer= obj.scaryOrComedy();
		System.out.println(answer);
		
	}

}
