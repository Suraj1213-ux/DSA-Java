package pepcode;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("enter the number");
		int t = scn.nextInt();
		
		
		for (int i=0;i<t;i++) {
			int n =scn.nextInt();
			
			int count=0;
			for(int div=2 ;div*div<=n;div++) {
				if(n%div==0) {
					count++;
				}
			}
			if (count==2) {
				System.out.println("prime");
				
			}else {
				System.out.println("not prime");
			}
		}
	}
}
