
public class HandleDropDown {

	
//	
//	public int doThings(String numberString) {
//		try {
//			int i= Integer.parseInt(numberString);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		return i;
//		
//	}
	
	
	int [] merge (int[]a, int []b) {
		int [] result = new int [a.length+b.length];
		for (int i=0; i<a.length; i++) {
			result [2*i]=a[i];
			result [(2*i)+1]=b[i];
		}
		return result;
	}
	
	
	
	
	
	
}
