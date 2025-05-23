package Condition_loop.BASIC;
import java.util.Scanner;

public class Area_of_circle_java {
	
	public static void area_of_circle(double radius) {
	double area = Math.PI *radius *radius ;
	System.out.println("Area of circle :" + area);
	}



	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Circle
	        System.out.print("Enter radius of the circle: ");
	        double radius = scanner.nextDouble();
	        area_of_circle(radius);
	        scanner.close();
}
	   
	   
}