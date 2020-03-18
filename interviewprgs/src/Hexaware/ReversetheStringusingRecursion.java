package Hexaware;

import java.util.Scanner;

public class ReversetheStringusingRecursion {
public static void reversemethod(int number) {
		if(number < 10) {
			System.out.println(number);
			return;
		}
		else
		{
			System.out.print(number%10);
			
							reversemethod(number/10);//answer
			}
	}
	public static void main(String[] args) {
		int num=0;
		System.out.println("input your number and press enter:");
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		System.out.print("reverse of the input number is:");
									reversemethod(num);//answer
		System.out.println();
		
	}
	
	
	
}
