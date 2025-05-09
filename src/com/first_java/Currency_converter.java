package com.first_java;
import java.util.Scanner;

public class Currency_converter {

	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		converttousd( sc);
		sc.close();
		
	}
	
	public static void converttousd(Scanner sc) {
		
		final double usd_rate =83.0;
		
		System.out.print("Enter the rupees : ");
		double rupee = sc.nextDouble();
		
		double usd = rupee/usd_rate;
		
		System.out.printf("The "+ rupee +" rupees in USD is $%.2f  " , usd);
	}
}
