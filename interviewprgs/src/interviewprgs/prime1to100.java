package interviewprgs;

public class prime1to100 {
public static void main(String[] args) {
	int count;
	for(int n=1;n<=100;n++) {
		count =0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count=1;
				break;
			}
		}
	if(count==0) {
		System.out.println(n);
	}
	
	}
}
}
