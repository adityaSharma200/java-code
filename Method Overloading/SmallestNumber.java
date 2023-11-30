class  SmallestNumber
{
	public static void smallestNum(int a,int b,int c)
	{
		if(a<b && a<c)
		{
			System.out.println(a);
		}
		else if(b<c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}

	public static void smallestNum(int a,int b,int c,int d,int e)
	{
	 if(a<b && a<c && a<d && a<e)
		{
			System.out.println(a);
		}
		else if(b<c && b<d && b<e)
		{
			System.out.println(b);
		}
		else if( c<d && c<e)
		{
			System.out.println(c);
		}
		else if( d<e)
		{
			System.out.println(d);
		}
		else
		{
			System.out.println(e);
		}
	}



	public static void main(String[] args) 
	{
		System.out.println("MB");
		smallestNum(-1,0,-2);
		smallestNum(7,4,8,-1999,0);
		System.out.println("ME");

	}
}
