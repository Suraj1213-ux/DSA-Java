package com.first_java;
import java.util.Scanner;

public class Simple_Interest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Principal : ");
	double p=sc.nextDouble();
	
	System.out.print("Enter the Time : ");
	double t=sc.nextDouble();
	
	System.out.print("Enter the Rate : ");
	double r=sc.nextDouble();
	
	double SI=p*t*r/100 ;
	System.out.println("Simple Interest is " + SI);
}
}
