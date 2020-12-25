

public class MaxMinSecondLargest {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?

		int[] num= {8,11,13,25,64,7,89,988,1234,6785,1236,6547};
		
		int max=num[0]; // here we choose one element by using index, in order to compare maximum
		int min= num[0]; // here we choose one element by using index, in order to compare minimum
		int secondLargest=num[0];
		
		for (int i=0; i<num.length; i++) {
			if (num[i]>max) {
				max=num[i];
			}else if (num[i]<min) {
				min=num[i];
			}else if (num[i]>secondLargest) {
				secondLargest=num[i];
			}
		}
		System.out.println("the maximum value of array is: "+max);
		System.out.println("the minimum value of array is: "+min);
		System.out.println("the secondLargest value of array is: "+secondLargest);
	}

}
