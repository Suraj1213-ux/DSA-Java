package com.first_java;
import java.util.Scanner;

public class Basic_calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		double num1 = sc.nextDouble();
		
		System.out.print("Enter the Second number : ");
		double num2 = sc.nextDouble();
		
		System.out.print("Select the Operator(+,-,*,/)");
		char op  = sc.next().charAt(0);
		
		if(op == '+')
			System.out.println("The addition  is " +(num1+num2));
		else if(op == '-')
			System.out.println("The Substraction  is " +(num1-num2));
		else if(op == '*')
			System.out.println("The muliplication is " +(num1*num2));
		else if(op == '/')
			System.out.println("The division is " +(num1/num2));
		else 
			System.out.println("Invalid Operator !");
		
		
	}
}
