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
			break;
		}
		case 2 :
		{
			rangeA_to_Z();
			break;
		}
		case 3 :
		{
			Home h = new Home();
			h.home();
			break;
		}
		case 4 :
		{
			 Home h = new Home();
			 
			if(h.Price != 0.0)
      	  {
      	  System.out.println("Your Order Price :"+h.Price);
      	  System.out.println("Thank You . Vist Again .");
      	  System.exit(0);
      	  }
      	  else
      	  {
      		  System.out.println("Please first Select  Medicine.");
      		display();
      	  }
      	  
      	  break ;
			
		}
		}
	
	}
	
	//this method are use to display medicine those come under number
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
	            	  display();
	            	  break ;
	              }
	              case 3:
	              {
	            	  
	            	  h.home();
	            	  break ;
	              }
	              case 4 :
	              {
	            	  if(h.Price != 0.0)
	            	  {
	            	  System.out.println("Your Order Price :"+h.Price);
	            	  System.out.println("Thank You .");
	            	  System.out.println("<----Vist Again .---->");
	            	  System.exit(0);
	            	  }
	            	  else
	            	  {
	            		  range_1to9();
	            	  }
	            	  
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
	
	
	//this method is use to display those medicine come under range between A to Z
	public void rangeA_to_Z()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("|------------------------------------|");
		System.out.println("  Select Your medicine as You want . ");
		System.out.println("|------------------------------------|");
		System.out.println("                   ");
		System.out.println("|> Select medicine press --> 1");
		System.out.println("|> If you want to go back main menu press --> 2");
		System.out.println("|> If you want to go back same menu press --> 3");
		System.out.println("|> If you want Exit press --> 4");
		
		int opt = s.nextInt();
		
		switch(opt)
		{
		case 1 :
		{
			System.out.println("Medicine List in A to Z range .");
			System.out.println("Select any medicine using A to Z letter .");
			char chmedic = s.next().charAt(0);
			
			if(chmedic == 'A' || chmedic == 'a' )
			{
				Amedic();
			}
			else if(chmedic == 'B' || chmedic == 'b')
			{
				//Bmedic();
			}
			
			break;
			
		}
		
		}
		
		
		
	}
	
	public void Amedic()
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("1]  A 1 5 MG Tablet 10");
		System.out.println("2]  A 125 MG Suspension 60 ML");
		System.out.println("3]  A 24 250 MG Tablet 6");
		System.out.println("4]  A 250 MG Suspension 60 ML");
		System.out.println("5]  A 3 100/500 MG Tablet 10");
		System.out.println("6]  A Art 150 MG Injection 2 ML");
		System.out.println("7]  A Bec 300 MG Tablet 30");
		System.out.println("8]  A Bec L 600/300 MG Tablet 30");
		System.out.println("9]  A Bex Junior Syrup 60 ML");
		System.out.println("10] A Bex Sf Expectorant 100 ML");
		System.out.println("11] A Bex Syrup 100 ML");
		System.out.println("12] A C Ford 200 MG Tablet 4");
		System.out.println("13] A C Ford Kid 200 MG Tablet 4");
		System.out.println("14] A Can 150 MG Tablet 1");
		System.out.println("15] A Card 50 MG Tablet 10");
		System.out.println("16] A Cef 1 GM Injection 1");
		System.out.println("17] A Cef 2 GM Injection 1");
		System.out.println("18] A Cet 5 MG Syrup 60 ML");
		System.out.println("19] A Chek Active Glucose Strips 25");
		System.out.println("20] A Chek Sclix Lancet Strips 25");
		
		int opt = s.nextInt();
		
		if(opt == 1 )
		{
			  System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println( "Patson Laboratories Pvt. Ltd.");
			  System.out.println( "Pack of 10 Units");
			  System.out.println("₹ 30.40");
			  System.out.println("Confirm Your Order press Y/N");
			  order(30.40);
		}
		else if(opt == 2)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 125 MG Suspension 60 ML   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 3)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 24 250 MG Tablet 6   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 4)
		{
			System.out.println("_____________________________");
		  System.out.println("                             ");
		  System.out.println("    A 1 5 MG Tablet 10   ");
		  System.out.println("_____________________________");
		  System.out.println("----------------------------");
		  System.out.println("Confirm Your Order press Y/N");
			
		}
		else if(opt == 5)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 6)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 7)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 8)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 9)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 10)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 11)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 12)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 13)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 14)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 15)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 16)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 17)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 18)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 19)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A 1 5 MG Tablet 10   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
		else if(opt == 20)
		{
			System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println("    A Chek Sclix Lancet Strips 25   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println("Confirm Your Order press Y/N");
		}
	}
	
	
	public void order(double price)
	{
		Scanner sc = new Scanner(System.in); 
	
		 char option = sc.next().charAt(0);
		  
		  if( option == 'Y' || option == 'y')
		  {
			  Home h = new Home();
			  h.Price = h.Price + price ;
			  
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
            	 Amedic();
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
           	  if(h.Price != 0.0)
           	  {
           	  System.out.println("Your Order Price :"+h.Price);
           	  System.out.println("Thank You .");
           	  System.out.println("<----Vist Again .---->");
           	  System.exit(0);
           	  }
           	  else
           	  {
           		  range_1to9();
           	  }
           	  
           	  break ;
             }
	        }
           }
	    }
	
	
}
