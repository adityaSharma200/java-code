package pack1;

import java.util.Scanner;

class Student
{
	public static void main(String[] args)
	{
	 Scanner sc1 = new Scanner(System.in);
	 System.out.println("Enter the positive number :-");
	 int n = sc1.nextInt();
		
		
	System.out.println(n>0 ? "It is positive number"+" "+n : "This is not a postivie number"+" "+n);	
	}
}