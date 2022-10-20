package Pack3;

public class Threading extends Thread{
	public void thread()
	{
		System.out.println("the thread is running");
	}

	public static void main(String[] args) {
		
		Threading t1 = new Threading();
		Threading t2= new Threading();
		
		System.out.println("Name of t1:"+t1.getName());
		System.out.println("Name of t1:"+t2.getName());
		
		t1.setName("Aditya");
		t2.setName("Ram");
		
		t1.start();
		t2.start();
		
		System.out.println("After change thread name :"+t1.getName());
		System.out.println("After change thread name :"+t2.getName());
		
		
	}

}
