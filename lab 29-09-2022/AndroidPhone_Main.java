package corejava_basic.initial;

public class AndroidPhone_Main {

	public static void main(String args[])
	{
		
		Display d1 = new Display("Smasung", "Amoled display", 32);
		
		RAM r1 = new RAM("Smasung", 32);
		
		COLOR c1 = new COLOR("Black");
		
	
		AndroidPhone ap1 = new AndroidPhone("Iphone14",d1,r1,c1);
		
		//System.out.println(ap1);
		
		ap1.display();
		
	}
	
	
	
	
	
	
	
	
}
