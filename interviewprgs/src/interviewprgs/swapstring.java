package interviewprgs;

public class swapstring {

	public static void main(String[] args) {
		
		String a="sekar";
		String b="Panneerselvam";
		
		System.out.println("before:"+a+" "+b);
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("after: "+a+" "+b);
		
		
		
		
		
		
		
		
		
	}
	
}
