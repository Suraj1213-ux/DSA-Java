package LinearSearch;

public class FindMin {
public static void main(String[] args) {
	int[] nums = {12,-11,-2,21,6,7,4,5,8};
	System.out.println(min(nums));
	
}

static int min (int[] arr) {
	int ans = arr[0];
	for(int i=1;i<arr.length;i++) {
		if (arr[i]<ans) {
		ans=arr[i];
		}
	}
	return ans;
}
}
