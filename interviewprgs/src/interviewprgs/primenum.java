package interviewprgs;

public class primenum {
public static void main(String[] args) {
	int n=10;
	int count=10;
	for(int i=2;i<n/2;i++) {
		if(n%i==0) {
			count=1;
			break;
		}
	}
	if(count==0) {
		System.out.println("prime num");
	}else {
		System.out.println("not a prime num");
	}
	}
}