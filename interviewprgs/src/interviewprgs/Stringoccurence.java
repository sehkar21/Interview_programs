package interviewprgs;

public class Stringoccurence {

	public static void main(String[] args) {
		
		String name ="spring is part of the four seasons and currenty it is spring now";
		String word="spring";
		String temp[]= name.split(" ");
		int count=0;
		
		for(int i=0;i<temp.length;i++) {
			
			if(word.equals(temp[i]))
			count++;
		}
		
		System.out.println("The given string is:"+ name);
		System.out.println("The String" +" "+word+" "+"occured"+" "+count+" " +"times  in the given string");
	}
	
	
	
	
	
}
