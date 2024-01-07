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
		System.out.println("2. Mediciens name start with A to Z.");
		System.out.println("3.Go Back To Main Menu");
		System.out.println("4.Proceed to Bill.");
		int n = s.nextInt();
		
		switch(n)
		{
		case 1 :
		{
			range_1to9();
		}
		case 2 :
		{
			
		}
		case 3 :
		{
			
		}
		case 4 :
		{
			
		}
		}
	
	}
	
	
	public void range_1to9()
	{
		  System.out.println("Select Your medicine as You want . ");
		  System.out.print(" 1 2 3 25 MG Tablet 5"+"   ");
		  System.out.print(" 1 2 3 50 MG Tablet 4"+"   ");
		  System.out.print(" 1 Al 10 MG Tablet 10 "+"   ");
		  System.out.print(" 1 Al 10 MG Tablet 15"+"   ");
		  System.out.println(" 1 Al 2.5 MG Syrup 30 ML"+" ");
		  System.out.print(" 1 Al 5 MG Tablet 10"+"  ");
		  System.out.print(" 1 Al Ax 5/75 MG Capsule 10"+"  ");
		  System.out.print(" 1 Al M 10/5 MG Tablet 10"+"  ");
		  System.out.print(" 1 Al M Syrup 60 ML"+"  ");
		  System.out.println("1 1 Al Max 10/5 MG Tablet 10"+"  ");
		  
		  Scanner sc = new Scanner(System.in);
		  int no = sc.nextInt();
		  
		  
		  
		  switch(no)
		  {
		  case 1 :
		  {
			  
			  System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("   1 2 3 25 MG Tablet 5"+"   ");
			  System.out.println("_____________________________");
			  System.out.println("Aglowmed Pharmaceuticals Ltd.");
			  System.out.println("Pack of 5");
			  System.out.println("₹33.60");
			  System.out.println("*MRP inclusive of all taxes");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
			  
			  char option = sc.next().charAt(0);
			  
			  if( option == 'Y' || option == 'y')
			  {
				  Home h = new Home();
				  h.Price = h.Price + 33.60 ;
				  
				  System.out.println("Do you want Order more");
	              System.out.println("1.Order from same Menu");
	              System.out.println("2.go back");
	              System.out.println("3.change Medicien Menu" );
	              System.out.println("4.procees bill");
	              
	              int opt = sc.nextInt();
	              
	              switch(opt)
	              {
	              case 1 :
	              {
	            	  range_1to9();
	            	  break;
	              }
	              case 2 :
	              {
	            	  break ;
	              }
	              case 3:
	              {
	            	  
	            	  break ;
	              }
	              case 4 :
	              {
	            	  System.out.println("Your Order Price :"+h.Price);
	            	  System.out.println("Thank You . Vist Again .");
	            	  System.exit(0);
	            	  break ;
	              }
	              default :
	              {
	            	  
	              }
	              }
	              
				  
				  
			  }
			  else
			  {
				  System.out.println("Enter a valid Option.");
				  range_1to9();
			  }
			  
			  break;
			  }
		  default :
			  
		  {
			  System.out.println("Select valid Options.");
			  display();
		  }
		  }
		
	}
	
	
}


