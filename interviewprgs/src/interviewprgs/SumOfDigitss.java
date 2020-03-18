package interviewprgs;

import java.util.Scanner;

public class SumOfDigitss {

	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter the number");
		
			//		 int n =sc.nextInt();
					 	int a=123,i=0,j=0;
					 	//a=n;
					 	while(a>0) {
					 		i=a%10;
					 		j=j+i;
					 		a=a/10;
					 	}
		System.out.println(j);
		
	}
	
	
	
}
