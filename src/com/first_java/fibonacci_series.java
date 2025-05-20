package com.first_java;
import java.util.Scanner;

public class fibonacci_series{

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + " numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.print("Enter how many fibonacci numbers to be print");
    	int n = sc.nextInt();
    	
    	 if (n <= 0) {
             System.out.println("Please enter a positive integer.");
         } else {
             printFibonacci(n);
         }
      
    	 sc.close();
    }
}

