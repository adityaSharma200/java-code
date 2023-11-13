//WAJP FOR CALCULATOR CONSIST OF 4 METHODS 
/*
AUTHOR:-ADITYA SHARMA
DATE:- 13-11-2023
*/
class Claculator
{

	public static void add(int a,int b,int c,int d)//method called
	{
		int e = a+b+c+d;
		System.out.println(e);
	}

	public static void sub(int a,int b,int c,int d,int e)//method called
	{
		int f = a-b-c-d-e;
		System.out.println(f);
	}

	public static void mul(int a,int b,int c,int d,int e,int f)//method called
	{
		int g = a*b*c*d*e*f;
		System.out.println(g);
	}

	public static void div(int a,int b)//method called
	{
		int c = a/b;
		System.out.println(c);
	}

	public static void main(String[] args)// calling method or main Main method
	{
		System.out.println("Hello World!");
		add(90,80,70,50);
		sub(23,4,56,78,23);
        mul(-3,-5,5,6,7,8);
	    div(10,2);
	}
}
