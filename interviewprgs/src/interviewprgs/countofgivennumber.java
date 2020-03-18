package interviewprgs;

import java.util.Scanner;

public class countofgivennumber {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		
		int i=0;
		int n = sc.nextInt();
		
		while(n>0) {
			n=n/10;
			i++;
		}
	
	System.out.println("number of digits " +i);
	}
	
	
	
	
	
	
	
}
