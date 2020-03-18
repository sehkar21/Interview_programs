package interviewprgs;

public class stringrevers {
	
public static void main(String[] args) {
	
	 String name="sekar";						//1 String name = "sekar1"
	String reverse = "";						//2 String reverse="";
	
	 for(int i=name.length()-1;i>=0;i--) {      //3for(int i=name.length()-1;i>=0;i--)
	 char ch= name.charAt(i);					//4char ch =name.charat(i);
	 
	 
	 reverse=reverse+ch;					//5 reverse= reverse+ch;
	 System.out.println(reverse);			//6 system.out.println(reverse);
		 
		 
	 }
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}