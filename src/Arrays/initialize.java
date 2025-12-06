package Arrays;
import java.util.Scanner;

public class initialize {

	public static void main(String[] args) {
		
//		int[] arr = {20,40,24,34,56,27};// initalize and declared the array 
//		
//		int n = arr.length; 
//		arr[0]=45;
//		System.out.println(arr[0]);
		
//		int[] array= new int[8];
	
		//used this to bring o/p
//for(int i=0;i<n;i++) {
//	System.out.println(arr[i]);
//}
		
		
		// lets see by taking array input from user 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the the size of the array");
//
//		int n = sc.nextInt();
//		int arr[]=new int[n];
//		
//		System.out.println("enter the elemnts in the array");
//		
//		//input
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//			
//		}
//		
//		//output
//		for(int i=0; i<arr.length;i++) {
//			System.out.print(arr[i]);
//		}
		
		
		
		//to print marks less then 35 from the array
//		int[] marks= {100,87,98,34,23,54,45,12}; 
//		
//		for(int i=0;i<marks.length;i++) {
//			if(marks[i]<35) {
//			System.out.println(marks[i]);
//			}
//		}
		
		
		//to add the elements present in the array
		
//		int[] arr = {20,40,24,34,56,27};
//		int sum =0;
//		for(int i= 0; i<arr.length;i++) {
//			sum += arr[i];
//			
//		}
//		System.out.println(sum);
		
		
		// to take a array 9create another varaible as x and find x in that array where that element should be present in the array
		int[] arr = {20,40,24,34,56,27};
		int x = 40;
		for(int i=0 ; i<arr.length; i++) {
			if (arr[i]==40) {
				System.out.println("40 is presnt in the array ");
			}
		}
		
	}

}
