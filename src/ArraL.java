import java.util.ArrayList;
import java.util.List;

public class ArraL {
	/*
	 * Create an array list that will hold String Objects
Find out wether array list is empty or not. 
Add String value "Hello" to it
Find out wether array list is empty or not. 

Expected Output:
true
false
	 */
	public static void main (String [] args) {
	List list=new ArrayList();
	list.add("Hello");
	
	System.out.println(list.isEmpty());
	System.out.println(!list.isEmpty());
	
	
	
	
	}
}
