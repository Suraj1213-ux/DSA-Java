package Condition_loop.BASIC;
import java.util.Scanner;

public class Factorial_program {
 static int factorial(int n) {
	 int fact = 1;
	 for (int i=2;i<=2;i++)
		 fact *=i;
	 return fact;
 }
 
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the number : ");
	 int num = sc.nextInt();
	 System.out.println("Factorial is: "+ factorial(num));
	 
 }
}
