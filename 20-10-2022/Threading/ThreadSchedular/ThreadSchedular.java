package Pack3;

public class ThreadSchedular extends Thread 
    {
	public void run()
	{ 
	 for(int i=1; i<10; i++)
	{ 
	 try
	{
	Thread.sleep(700);
	}
	catch(InterruptedException e)
	{
	System.out.println(e);
	} 
	 System.out.println(i); 
	 } 
	} 
public static void main (String args[]) throws InterruptedException 
{
	ThreadSchedular t1 = new ThreadSchedular();
    ThreadSchedular t2 = new ThreadSchedular();
	t1.start();
	t1.join(700);
	t2.start();
	
}

}

