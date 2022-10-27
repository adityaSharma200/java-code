package Pack3;

import java.util.Scanner;

public class UseScanner {
	
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		
	
		int a=sc1.nextInt();
		System.out.println(a);
		
		String s1=sc1.nextLine();
		System.out.println(s1);
		
		double d=sc1.nextDouble();
		System.out.println(d);
		
		boolean b=sc1.nextBoolean();
		System.out.println(b);
		
	}
	}
