import java.util.Scanner;

public class swapwithoutthird {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println("values before swap:"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("values after swap:"+a+" "+b);
	}
}
