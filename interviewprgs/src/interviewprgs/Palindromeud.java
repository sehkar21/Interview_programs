package interviewprgs;

import java.util.Scanner;

public class Palindromeud {

	public static void main(String[] args) {
		
		//Scanner sc= new Scanner(System.in);
	//	System.out.println("Enter the number");
		
		//int n = sc.nextInt();
		int a=141,i=0,j=0,n=0;
		
		a=n;
		 while(a>0) {
			 i=a%10;
			 j=(j*10)+i;
			 a=a/10;
		 }
		if(n==j) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not palindrome number");
		}
		
		
		
	}
	
	
	
	
	
}
