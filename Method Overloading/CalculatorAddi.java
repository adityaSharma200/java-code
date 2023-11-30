class CalculatorAddi
{
	public static int add(int a,int b)
	{
		int res = a+b;
		return res ;
	}

	public static int add(int a,int b,int c)
	{
		int res =  a+b+c;
		return res ;
	}

	public static int add(int a,int b,int c,int d)
	{
		int res = a+b+c+d;
		return res ;
	}

	public static int add(int a,int b,int c,int d,int e)
	{
		int res = a+b+c+d+e;
		return res ;
	}

	public static int add(int a,int b,int c,int d,int e,int f)
	{
		int res = a+b+c+d+e+f;
		return res ;
	}
   

	public static void main(String[] args) 
	{
		System.out.println("MB");

		int result2 = add(2,4);
		int result3 = add(2,3,4);
		int result4 = add(2,3,4,5);
		int result5 = add(2,3,4,5,6);
		int result6 = add(2,3,4,5,6,7);

		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println("ME");
		
	}
}
