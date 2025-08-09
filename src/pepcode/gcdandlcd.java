package pepcode;
import java.util.*;

public class gcdandlcd {
//	public static void main (String[] args) {
//		// code for gcd and lcm 
//		
//		Scanner scn = new Scanner(System.in);
//		int n1 = scn.nextInt();
//		int n2 = scn.nextInt();
//		
//		int on1=n1;
//		int on2=n2;
//	
//	consider n1= 24 and n2 =36
//	while(n2%n1 !=0) {
//		int rem = n2%n1;
//			n1=rem;
//			n2=n1;
//	}
//		int gcd = n1;
//		int lcm = (on1*on2)/gcd;
//	System.out.println("The gcd for given two number is : " + gcd);
//		System.out.println("The lcm for given two number is : " + lcm);
		
		// code fpr prime factorization 
		
//		public static void main (String[] args) {
//			Scanner scn =  new Scanner(System.in);
//			int n = scn.nextInt();
//			
//			for(int div=2;div<=n;div++) {      
//				while(n%div==0) {
//				n= n/div;
//				System.out.println(div);
//				}
//			}
//			
//		}
		
	 // pythageron triplet
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int max = a;
		if ( b>= max) {
			b= max;
		}
		
		if (c>= max) {
			c=max;
		}
		
		if ( max==a) {
			boolean flag = ((b*b+c*c)==(a*a));
			System.out.println(flag);
		}else if (max==b) {
			boolean flag = ((a*a+c*c)==(b*b));
			System.out.println(flag);
		}else {
			boolean flag =((a*a+b*b)==(c*c));
			System.out.println(flag);
		}
		
				
	}
		
}
	


