package Hexaware;

public class testoutputprg {

	public static void main(String[] args)
	{
		int i[]= {0,1};
		try
		{
			i[2]=i[0] + i[1];
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("1");
		}
		catch(Exception e2) {
			System.out.println("2");
		}
		finally
		{
			System.out.println(3);
		}
	}
	
	
	
	
}
