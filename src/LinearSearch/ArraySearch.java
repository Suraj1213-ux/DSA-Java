package LinearSearch;

public class ArraySearch {
	public static void main(String[] args) {
		int[] nums = {10,23,45,34,56,23,45,890,22};
		int target = 89 ;
		int ans = linearSearch(nums , target);
		System.out.println(ans);
	}
	//search in the array return the index if item found 
	//otherwise if item not found return -
	
	static int linearSearch(int[] arr , int target) {
		if (arr.length==0) {
			return  -1;
		}
		
		//run a for loop 
		
		for (int index=0; index< arr.length ;index ++) {
			int element = arr[index];
			if (element==target) {
				return index;
			}
			
		}
	// if the loop finishes , target was not found 
		return -1;
	}
	
}

 