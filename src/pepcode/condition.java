package pepcode;
import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
    	
    	System.out.print("Enter the marks of student : ");
    	Scanner sc = new Scanner(System.in);
    	int marks = sc.nextInt();
    	
    	if (marks >90) {
    		System.out.println("excellent");
    	}else if(marks>80) {
    		System.out.println("good");
    	}else if (marks>70) {
    		System.out.println("fair");
    	}else if (marks>50) {
    		System.out.println("just passed");
    	}else {
    		System.out.println("failed");
    	}
    	
    	
//    	int n1 = 20;
//    	int n2 =30;
//    	if(n1==n2) {
//    		System.out.println(n1+"is equal to"+ n2);
//    	}
//    	else {
//    		if(n1>n2) {
//    			System.out.println(n1+ "is greater then " + n2);
//    		}else {
//    			System.out.println(n1 +"is smaller then" + n2);
//    		}
  //  	}
    }
    	
    	
//    	int x = 11;
//    	if (x % 2 ==0) {
//    		System.out.println(x + "is even");
//    	}
//    	else {
//    		System.out.println(x + "is odd.");
//    	}
//    	System.out.println("Hardwork is better then snmart work");
  //  }
	
}