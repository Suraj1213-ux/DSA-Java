package com.first_java;
import java.util.Scanner;

public class GreetingName {
	
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Name : ");
	String name=sc.nextLine();
	
	System.out.println("Hello "+name+" Have a great day");
	
}
}
