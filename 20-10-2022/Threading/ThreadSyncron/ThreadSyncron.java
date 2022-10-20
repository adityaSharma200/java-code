package Pack3;

class Number
{
	synchronized void number(int n)
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Thread2 extends Thread
{
	Number n;
	Thread2(Number n)
	{
		this.n=n;
	}
	public void run()
	{
		n.number(4);
	}
}
class Thread3 extends Thread
{
	Number n;
	Thread3(Number n)
	{
		this.n=n;
	}
	public void run()
	{
		n.number(9);
	}
}
class ThreadSyncron
{
public static void main(String args[])
{
	Number n1 = new Number();
	Thread2 t2=new Thread2(n1);
	Thread3 t3 = new Thread3(n1);
	t2.start();
	t3.start();
}
}