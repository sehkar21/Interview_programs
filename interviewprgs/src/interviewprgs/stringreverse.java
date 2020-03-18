package interviewprgs;

public class stringreverse {

	public static void main(String[] args) {
		String name ="sekar";
		String reverse = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			char ch = name.charAt(i);
			reverse =reverse+ch;
			
		}
		System.out.println(reverse);
		
		
		
	}
	
	
	
	
	
	
	
}
