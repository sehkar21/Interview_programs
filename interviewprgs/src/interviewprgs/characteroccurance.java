package interviewprgs;

public class characteroccurance {

	
	static String str ="geekaforgeetks";
	static char c='e';
	
	public static int countChar()
	{
	    int count = 0;

	    for(int i=0; i < str.length(); i++)
	    {    if(str.charAt(i) == c)
	            count++;
	    }
	    
	    return count;
	}
	public static void main(String[] args) {
		 
		System.out.println(countChar());


	

		
		
	}
	
}
