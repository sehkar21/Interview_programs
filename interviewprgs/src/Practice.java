import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		
		int a=1523,i=0,j=0,temp;
		temp=a;
		
		while(a>0) {
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		if(temp==j) {
			System.out.println("Armstrong number");
			
			
		} 
		else 
		{
			System.out.println("not an Armstrong number");
		}
		
		}


}