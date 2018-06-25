package pac1;

public class FindMaxGivenArray {

	public static int findMax(int[]a, int l) {
		// l - means leanth of array
		
		//base case
		if(l==1) {
			return a[0];
		}
		//recursive case
		return Math.max(a[l-1], findMax(a, l-1));
	}
	
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,55,33,11,10,888,45,78};
		System.out.println(findMax(arr, arr.length));
	}
	
	
	
}
