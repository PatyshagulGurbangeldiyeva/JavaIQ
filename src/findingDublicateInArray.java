import java.util.ArrayList;
import java.util.Iterator;

public class findingDublicateInArray {
//	Explain the logic of finding duplicates in array?
//			1.	Declare and initialize an array.
//			2.	Duplicate elements can be found using two loops. The outer loop will iterate through the array from 0 to length of the array.
//			3. The outer loop will select an element. ...
//			4.	If a match is found which means the duplicate element is found then, display the element.

	public static void main(String[] args) {
		
		int []num= new int [5];
		num[0]=1;
		num[1]=2;
		num[2]=1;
		//num[3]=4;
		num[4]=2;

		System.out.println(num.length);
		
		System.out.println("printing all values");
		for (int i=0; i<num.length; i++ ) {
			System.out.println(num[i]);
		}
	
	
	//int []numbers=new int[] {1,2,5,3,1,5};
	//int [] num1={1,2,4,2,1};
	
	for (int i=0; i<num.length; i++) {
		for (int j=i+1; j<num.length; j++) {
		if (num[i]==num[j]) {
			System.out.println(num[i]+ " is dublicate");
		}
		}
	}

	
	
	
	
	}}


