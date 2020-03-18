package interviewprgs;

public class vowelscount {
public static void main(String[] args) {
	String name = "welcome";
	
	int vc=0;
	
	
	for(int i=0;i<name.length();i++) {
		
		
		char ch = name.charAt(i);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			
			vc++;
		}
	}
			System.out.println(vc);
}
}
