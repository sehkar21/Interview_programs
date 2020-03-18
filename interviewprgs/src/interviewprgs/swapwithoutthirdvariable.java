package interviewprgs;

import java.util.Scanner;

public class swapwithoutthirdvariable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("the number are");
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("swapped number are ");
	System.out.println(a);
	System.out.println(b);
}
}
