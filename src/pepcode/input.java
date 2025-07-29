package pepcode;

import java.util.Scanner;

public class input {
	
	public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter a number : ");
	int n = Integer.parseInt(scn.nextLine());
	
	System.out.print("Enter a name : ");
	String name = scn.nextLine();
	
	System.out.println("Dear "+ name + ". here is your counting");
	
	for(int i=0 ; i<=n ; i++) {
		System.out.println(i);
	}
	}
}
