package interviewprgs;

public class Singleton {

	static Singleton e;
	private Singleton() {
		
	}
	
	
	public static Singleton getinstatnce() {
		if(e==null) {
			e= new Singleton();
	}
	System.out.println(e);
	return e;
	}
	public void id() {
		System.out.println("123");
	}
	
	public static void main(String[] args) {
		
		Singleton x =Singleton.getinstatnce();
		  x.id();
	
	}
	
	
}
