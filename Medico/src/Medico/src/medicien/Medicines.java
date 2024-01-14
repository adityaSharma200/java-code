package medicien;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Medicines extends Home {

	{
		System.out.println("<--------------------------->");
		System.out.println("All Medicine List ..");
		System.out.println("Find Your medicines here  ");
		System.out.println("<--------------------------->");
	}
	
	public void display()
	{
		Scanner s = new Scanner(System.in);
			
		System.out.println("Chosse any One Option .");
		System.out.println("1. Mediciens name start with 1 to 9 .");
		System.out.println("2. Mediciens name start with A to D.");
		System.out.println("3.Go Back To Home Page");
		
		int n = s.nextInt();
		
		switch(n)
		{
		case 1 :
		{
		
			break;
		}
		case 2 :
		{
			RangeAtoZ s1 = new  RangeAtoZ();
			s1.rangeaAtoZ();
			break;
		}
		case 3 :
		{
			Home h = new Home();
			h.home();
			break;
		}
		
		default :
		{
			System.err.println("Please enter valid input .");
			display();
		}
		}
	
	}

	

}