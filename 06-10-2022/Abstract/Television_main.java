package corejava_basic.initial;

public class Television_main {
	public static void main(String args[])
	{
		System.out.println("----Sony Tv detail.-------");
		Television t1= new SonyTV();
		t1.Start();
		t1.Run();
		t1.Sound();
		
		System.out.println("----Samsung Tv detail.-----");
		Television t2= new SamsungTV();
		t2.Start();
		t2.Run();
		t2.Sound();
		
	}

}
