package Pack2;

public class Throw_s {
	
	static void Null() throws NullPointerException 
	{
		throw new NullPointerException ("NullPointerException");
	}

	public static void main(String[] args)   {
		try 
		{
			Null();
		}
		catch(NullPointerException a)
		{
			System.out.println(a);
		}
	

	}

}
