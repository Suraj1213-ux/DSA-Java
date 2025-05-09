package com.first_java;
import java.util.Scanner;

public class Largest_number {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		findlargest(sc);
		sc.close();
		
	}
	
	public static void findlargest(Scanner sc) {
		System.out.print("Enter the First number : ");
		int a = sc.nextInt();
		
		
		System.out.print("Enter the Second number : ");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("This is the Largest number " + a);
		}
		else if (b>a)  {
			System.out.println("This is the Largest number " + b);
		}
		else {
			
			System.out.println("Both numbers are equal ");
			
		}
			
	}
	

}
