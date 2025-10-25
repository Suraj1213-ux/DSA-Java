package Condition_loop.BASIC;
import java.util.Scanner;

public class twoDarray {
//	 static void printArray(int[] arr) {
//	        for (int i = 0; i < arr.length; i++) {
//	            System.out.print(arr[i] + " ");
//	        }
//	        System.out.println(); // for a new line after printing
//	    }
//
//	    public static void main(String[] args) {
//	        int[] arr2 = {1, 2, 3, 4};  // simple 1D array
//	        printArray(arr2);
//	    }
	
	 static void printArray(int[][] arr) {
	        System.out.println("\nArray elements are:");
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + " "); // print in same line
	            }
	            System.out.println(); // move to next row after each row
	        }
	    }
	
public static void main(String[] arg) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the nmuber of rows ");
	int r =sc.nextInt();
	System.out.println("Enter the nmuber of columns ");
	int c =sc.nextInt();
	
	
	int [][] arr2 = new int [r][c];
	
	System.out.println("enter" + r*c +"elements");
	for (int i = 0 ; i<r;i++) {
		for (int j = 0 ; j<c;j++){
			arr2[i][j]=sc.nextInt();
		}
	}
//	int [][] arr2 = {
//			{1,2,4},
//			{4,5,6},
//			{7,9,0},
//		
//	};
	printArray(arr2);	
}
}
