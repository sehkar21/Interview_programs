package interviewprgs;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int a,i=0,j=0;
	a=n;
	while(a>0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
		
	}
	if(n==j) {
		System.out.println("its  a palindrome");
	}else {
		System.out.println("its not a palindrome");
	}
}
}
