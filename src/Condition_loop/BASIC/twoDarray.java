package Condition_loop.BASIC;
import java.util.Scanner;

public class twoDarray {
	
	
	// 1d array code 
	
	
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
	
	
	// 2 D array 
	
//	 static void printArray(int[][] arr) {
//	        System.out.println("\nArray elements are:");
//	        for (int i = 0; i < arr.length; i++) {
//	            for (int j = 0; j < arr[i].length; j++) {
//	                System.out.print(arr[i][j] + " "); // print in same line
//	            }
//	            System.out.println(); // move to next row after each row
//	        }
//	    }
//	
//public static void main(String[] arg) { 
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the nmuber of rows ");
//	int r =sc.nextInt();
//	System.out.println("Enter the nmuber of columns ");
//	int c =sc.nextInt();
//	
//	
//	int [][] arr2 = new int [r][c];
//	
//	System.out.println("enter" + r*c +"elements");
//	for (int i = 0 ; i<r;i++) {
//		for (int j = 0 ; j<c;j++){
//			arr2[i][j]=sc.nextInt();
//		}
//	}
////	int [][] arr2 = {
////			{1,2,4},
////			{4,5,6},
////			{7,9,0},
////		
////	};
//	printArray(arr2);	
//}




     //prolemb 1 
	
	
	
	static void printMatrix(int[][] matrix) {
		for(int i=0 ;i<matrix.length; i++) {
			for (int j =0 ; j<matrix[i].length ; j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
		if(r1 !=r2 || c1 !=c2) {
			System.out.println("wrong Input - Addition not possible");
			return;
		}
		
		int[][] sum =new int[r1][c1];
		
		for(int i=0 ; i<r1;i++) {
			for(int j=0 ; j<c1 ; j++) {
				sum[i][j]=a[i][j] +b[i][j];
			}
		}
		 System.out.println("Sum of matrices:" + " ");
		printMatrix(sum);
		
		
	}
		public static void main(String[] arg) { 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the nmuber of rows and column in matrix 1 ");
			int r1 =sc.nextInt();			
			int c1 =sc.nextInt();
			
			
			int [][] a = new int [r1][c1];
			
			System.out.println("enter matrix values");
			for (int i = 0 ; i<r1;i++) {
				for (int j = 0 ; j<c1;j++){
					a[i][j]=sc.nextInt();
				}
			}
			
			
		
			System.out.println("Enter the nmuber of rows and column in matrix 2 ");
			int r2 =sc.nextInt();			
			int c2 =sc.nextInt();
			
			
			int [][] b = new int [r2][c2];
			
			System.out.println("enter matrix values");
			for (int i = 0 ; i<r2;i++) {
				for (int j = 0 ; j<c2;j++){
					b [i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Matrix 1");
			printMatrix(a);
			System.out.println("Matrix 2");
			printMatrix(b);
			
			add(a, r1, c1, b, r2, c2);
			sc.close();
			
	}
	
		
	
}
