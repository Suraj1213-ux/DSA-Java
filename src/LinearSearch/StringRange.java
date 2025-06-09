package LinearSearch;

public class StringRange {

public static void main(String[] args) {
	int[] nums= {24,2,56,43,-11,23,45,27};
	int target= 43;

	System.out.println(linearSearch(nums ,target,1,4));
}
	
	
	static int linearSearch(int[] arr , int target, int start, int end) {
		if ( arr.length==0) {
			return -1;
		}
		
		for (int i=start;i<end;i++) {
			int element =arr[i];
			if(element==target) {
				return i;
			}
		}
		
		return -1;
	}

}

