package interviewprgs;

public class SplittheString {
	
	static String str = "geeks01$$for02geeks03!@!!"; 
	
	 public  static void splitString() 
	    { 
	        StringBuilder text = new StringBuilder();
	        StringBuilder number = new StringBuilder();
	        StringBuilder  special = new StringBuilder(); 
	          
	        for (int i=0; i<str.length(); i++) 
	        { 
	            if (Character.isDigit(str.charAt(i))) 
	                number.append(str.charAt(i)); 
	            else if(Character.isAlphabetic(str.charAt(i))) 
	                text.append(str.charAt(i)); 
	            else
	                special.append(str.charAt(i)); 
	        } 
	       
	        System.out.println(text); 
	        System.out.println(number); 
	        System.out.println(special); 
	    } 
	    
	 public static void main(String args[]) 
	    { 

		 		splitString(); 
	    } 
		
	
}
 