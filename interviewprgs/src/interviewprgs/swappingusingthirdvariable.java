package interviewprgs;

import java.util.Scanner;

public class swappingusingthirdvariable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("the numbers are ");
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=a;
	a=b;
	b=c;
	System.out.println("the swapping of two numbers");
	System.out.println(a);
	System.out.println(b);
}
}
