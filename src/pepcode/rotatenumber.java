package pepcode;
import java.util.Scanner;

public class rotatenumber {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		int n = scn.nextInt(); 
		int k = scn.nextInt();
		
		int temp =n;
		int nod=0;
		while(temp>0) {
			temp=temp/10;
			nod++;
		}
		
		k=k%nod;//use for if the input of k is bigger then number of digit
		if(k<0) {//use for if the k is negative
			k=k+nod;
		}
		
		int div=1;
		int mult=1;
		for(int i = 1; i<=nod;i++) {
		if(i <=k) {
			div=div*10;
		}
		else {
			mult=mult*10;
		}
				
	}
	int q=n/div;
	int r=n%div;
	int rot = r*mult+q;
	System.out.println("the coreect rotated orderd number is" +rot);
	

}
}
