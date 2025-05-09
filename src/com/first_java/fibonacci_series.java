package com.first_java;
import java.util.Scanner;

public class fibonacci_series {
	
	public static void printfibonacci(int n) {
	int a = 0 ;
	int b = 1 ;
    System.out.print("Fibonacci Series: ");
	
	for (int  i= 0; i<n ; i++) {
		System.out.print(a + "");
		int next = a+b ;
		a= b;
		b= next;
	}
	System.out.println();
	
	
		
	}
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int sc = scanner.nextInt();
    	  System.out.print(sc);
	}
		
}
