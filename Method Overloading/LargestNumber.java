class  LargestNumber
{


    public static void twoNumberGr(int a,int b)
	{
     if(a>b)
		{
		 System.out.println(a);
		}
		else
		{
			 System.out.println(b);
		}
	}

	public static void fourNumberGr(int a,int b,int c,int d)
	{

     if(a>b && a>c && a>d)
		{
		 System.out.println(a);
		}
		else if(b>c && b>d)
		{
			 System.out.println(b);
		}
		else if(c>d)
		{
			System.out.println(c);
		}
		else
		{
		System.out.println(d);
		}
	}

	public static void fiveNumberGr(int a,int b,int c,int d,int e)
	{
     if(a>b && a>c && a>d && a>e)
		{
		    System.out.println(a);
		}
		else if(b>c && b>d && b>e)
		{
			System.out.println(b);
		}
		else if(c>d && c>e)
		{
             System.out.println(c);
		}
		else if(d>e)
		{
			System.out.println(d);
		}
		else
		{
			System.out.println(e);
		}
	}

	public static void eightNumberGr(int a,int b,int c,int d,int e,int f,int g,int h)
	{
		 if(a>b && a>c && a>d && a>e && a>f && a>g && a>h)
		{
		    System.out.println(a);
		}
		else if(b>c && b>d && b>e && b>f && b>g && b>h)
		{
			 System.out.println(b);
		}
		else if(c>d && c>e && c>f && c>g && c>h)
		{
			System.out.println(c);
		}
		else if(d>e && d>f && d>g && d>h)
		{
			System.out.println(d);
		}
		else if(e>f && e>g && e>h)
		{
			System.out.println(e);
		}
        else if( f>g && f>h)
		{
			System.out.println(f);
		}
		else if(g>h)
		{
			System.out.println(g);
		}
		else 
		{
			System.out.println(h);
		}
	}




	public static void main(String[] args) 
	{
		System.out.println("MB");
		twoNumberGr(6,8);
        fourNumberGr(-1,-2,0,-7);
		fiveNumberGr(7,8,4,3,9);
		eightNumberGr(23,56,90,89,87,78,67,66);
		System.out.println("ME");
	}
}
