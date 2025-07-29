package pepcode;
import java.util.Scanner;

public class reversedigit {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number=");
		int n = scn.nextInt();
		
		//just by entering numbering see how many digit
//		int dig = 0;
//		while(n !=0) {
//			n=n/10;
//			dig++;
//		}
//		System.out.println(dig);
		
		//print a digit from left to right in one line
//		int nod = 0;
//		int temp = n;
//		while(temp !=0) {
//			temp =temp/10;
//			nod++;
//		}
//		int div =(int)Math.pow(10,  nod-1);
//		while (div !=0) {
//			int q =n/div;
//			System.out.println(q);
//			
//			n=n%div;
//			div=div/10;
//			
//		}
		
		//reverse number print
		
		while(n>0) {
			int dig = n% 10;
			n=n/10;
			System.out.println(dig);
		}
	}
}
