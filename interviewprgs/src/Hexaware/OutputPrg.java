package Hexaware;



public class OutputPrg {

	int width;
	int height;
	int length;
	int volume;
	
	void volume(int height,int length,int width) {
		volume = 	width*height*length;
		
	}

	class prameterized_method{
		public void main(String[] args) {
			OutputPrg obj = new OutputPrg();
			obj.height=1;
			obj.length=5;
			obj.width=5;
			obj.volume(3,2,1);
			System.out.println(obj.volume);
		}
		}
}
	

