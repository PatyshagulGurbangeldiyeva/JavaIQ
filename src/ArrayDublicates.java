import java.lang.reflect.Array;

public class ArrayDublicates {
	/**
Find if an array contains duplicate elements. For example, if nums = [1,2,3,2], please return true, if nums = [2,3,4], please return false. 
Please complete one of following function
boolean findDuplicate(int[] nums){
}
OR
def find_duplicate(nums):
	 */

//	public static boolean duplicates(int[] input) {
//        for (int i = 0; i < input.length; i++) {
//            for (int j = 0; j < input.length; j++) {
//                if (input[i]==input[j] && i != j) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
	
	

	public static boolean findDublicates(int [] num) {
		
		
		for (int i=0; i< num.length; i++) {
			for (int j=1; j<num.length; j++) {
				if (num[i]==num[j] && i!=j) {
					return true;
					
				}
			}
		}
		
		return false;
	}
	
	public static void main (String [] args) {
		
		int [] num= {1,2,3,4,1,2,6};
		
	System.out.println(findDublicates (num));
		
		
	}
	public static void main (int x) {
		System.out.println("overloaded");
	}

	}

