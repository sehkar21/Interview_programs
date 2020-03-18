package interviewprgs;

public class fibonacciseries0to100 {
public static void main(String[] args) {
	int a=0,b=1;
	System.out.println(a);
	System.out.println(b);
	for(int n=1;n<=10;n++) {
		int c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
}
}
