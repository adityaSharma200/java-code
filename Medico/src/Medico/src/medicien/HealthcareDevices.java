package medicien;

import java.util.Scanner;

public class HealthcareDevices extends Home{

	{
		System.out.println("<--------------------------->");
		System.out.println("  ❤ Health care Devices ❤  ");
		System.out.println("<--------------------------->");
	}
	public void display()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Chosse any One Option .");
		System.out.println("1. BP Monitors");
		System.out.println("2. Nebulizers and Vaporizers");
		System.out.println("3. Supports and Braces");
		System.out.println("4. Go Back To Main Menu");
		System.out.println("5. Proceed to Bill.");
		
		int n = s.nextInt();
		
		switch(n)
		{
		case 1 :
		{
			bpMonitors();
			break;
		}
		case 2 :
		{
			nebVap();
			break;
		}
		case 3 :
		{
			//suppBrac();
			break;
		}
		case 4 :
		{
			Home h = new Home();
			h.home();
			break;
		}
		case 5 :
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
      		  System.out.println("Please first Select  Any Device.");
      		display();
      	  }
      	  
      	  break ;
		}
		default :
		{
			System.out.println("Enter valid input .");
			display();
		}
		}	
	}


//==============================================================================================		
	
	public void bpMonitors()
	{
		Home h = new Home();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("_____________________________");
		System.out.println("                             ");
		System.out.println("        BP Monitors          ");
		System.out.println("_____________________________");
		System.out.println("1. Dr Morepen Bp 15 Automatic Bp \n   Monitor (bp Machine) 1.\n");
		System.out.println("2. Dr. Odin Accugence Multi \n   Monitoring System 1 Kit.\n");
		System.out.println("3. Omron White Hem 7156 Bp Monitor (bp Machine) 1.");
		
		int opt = sc.nextInt();
		
		if(opt == 1)
		{
			System.out.println("<--------------------------------------------------------->");
			System.out.println("    Dr Morepen Bp 15 Automatic Bp Monitor (bp Machine) 1. ");
			System.out.println("<--------------------------------------------------------->");
			System.out.println("Morepen Laboratories Limited");
			System.out.println("Pack of 1 UNIT");
			System.out.println("₹1358.50");
			System.out.println("*MRP inclusive of all taxes");
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			h.list.add("Dr Morepen Bp 15 Automatic Bp Monitor (bp Machine) 1.");
			order(1358.50);
		}
		else if(opt == 2)
		{
			System.out.println("<--------------------------------------------------------->");
			System.out.println("   Dr. Odin Accugence Multi Monitoring System 1 Kit ");
			System.out.println("<--------------------------------------------------------->");
			System.out.println("Morepen Laboratories Limited");
			System.out.println("Pack of 1 UNIT");
			System.out.println("₹799.20");
			System.out.println("*MRP inclusive of all taxes");
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			h.list.add("Dr. Odin Accugence Multi Monitoring System 1 Kit");
			order(799.20);
		}
		else if(opt == 3)
		{
			System.out.println("<--------------------------------------------------------->");
			System.out.println("    Omron White Hem 7156 Bp Monitor (bp Machine) 1 ");
			System.out.println("<--------------------------------------------------------->");
			System.out.println("Morepen Laboratories Limited");
			System.out.println("Pack of 1 UNIT");
			System.out.println("₹3885.50");
			System.out.println("*MRP inclusive of all taxes");
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			h.list.add("Omron White Hem 7156 Bp Monitor (bp Machine) 1");
			order(3885.50);
		}
		else
		{
			System.out.println("Enter a valid Option.");
			bpMonitors();
		}
		
		
	}
	
//==============================================================================================	
	public void nebVap()
	{
		Home h = new Home();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("_____________________________");
		System.out.println("                             ");
		System.out.println("  Nebulizers and Vaporizers  ");
		System.out.println("_____________________________");
		System.out.println("1. New Baby Mask Device 1");
		System.out.println("2. Air Space With Exhale Valve Device 1");
		System.out.println("3. New Revolizer Device 1");
		System.out.println("4. Omron Ne C106 White Compressor Nebulizer 1");
		
		int opt = sc.nextInt();
		
		if(opt == 1)
		{
			System.out.println("<--------------------------------------------------------->");
			System.out.println("  New Baby Mask Device 1   ");
			System.out.println("<--------------------------------------------------------->");
			System.out.println("Cipla Ltd.");
			System.out.println("Pack of 1 Units");
			System.out.println("₹ 264.12");
			System.out.println("*MRP inclusive of all taxes");
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			h.list.add("New Baby Mask Device 1  "+"₹ 264.12 ");
			order(264.12);
		}
		else if(opt == 2)
		{
			System.out.println("<--------------------------------------------------------->");
			System.out.println(" Air Space With Exhale Valve Device 1    ");
			System.out.println("<--------------------------------------------------------->");
			System.out.println("Mankind Pharmaceuticals Ltd.");
			System.out.println("Pack of 1 UNITS");
			System.out.println("₹ 427.50");
			System.out.println("*MRP inclusive of all taxes");
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			h.list.add("Air Space With Exhale Valve Device 1 "+" ₹ 427.50 ");
			order(427.50);
		}
		else if(opt == 3)
		{
			System.out.println("<--------------------------------------------------------->");
			System.out.println(" New Revolizer Device 1    ");
			System.out.println("<--------------------------------------------------------->");
			System.out.println("Cipla Ltd.");
			System.out.println("Pack of 1 Units");
			System.out.println("₹ 238.34");
			System.out.println("*MRP inclusive of all taxes");
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			h.list.add("New Revolizer Device 1");
			order(238.34);
		}
		else if(opt == 4)
		{
			System.out.println("<--------------------------------------------------------->");
			System.out.println("  Omron Ne C106 White Compressor Nebulizer 1   ");
			System.out.println("<--------------------------------------------------------->");
			System.out.println("Omron Healthcare India Pvt Ltd");
			System.out.println("Pack of 1 Units");
			System.out.println("₹ 1583.40");
			System.out.println("*MRP inclusive of all taxes");
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			h.list.add("Omron Ne C106 White Compressor Nebulizer 1");
			order(1583.40);
		}
		else
		{
			System.out.println("Enter a valid Option.");
			nebVap();
		}
			
	}
	
	
	//==============================================================================================	
	
	
	/*
	 * public void suppBrac() { Home h = new Home(); Scanner sc = new
	 * Scanner(System.in);
	 * 
	 * System.out.println("_____________________________");
	 * System.out.println("                             ");
	 * System.out.println("  Nebulizers and Vaporizers  ");
	 * System.out.println("_____________________________");
	 * System.out.println("1. New Baby Mask Device 1");
	 * System.out.println("2. Air Space With Exhale Valve Device 1");
	 * System.out.println("3. New Revolizer Device 1");
	 * System.out.println("4. Omron Ne C106 White Compressor Nebulizer 1");
	 * 
	 * int opt = sc.nextInt();
	 * 
	 * if(opt == 1) { System.out.println(
	 * "<--------------------------------------------------------->");
	 * System.out.println("     "); System.out.println(
	 * "<--------------------------------------------------------->");
	 * System.out.println(""); System.out.println(""); System.out.println("₹");
	 * System.out.println("*MRP inclusive of all taxes");
	 * System.out.println("----------------------------");
	 * System.out.println("Confirm Your Order press Y/N"); h.list.add(""); order();
	 * } else if(opt == 2) { System.out.println(
	 * "<--------------------------------------------------------->");
	 * System.out.println("     "); System.out.println(
	 * "<--------------------------------------------------------->");
	 * System.out.println(""); System.out.println(""); System.out.println("₹");
	 * System.out.println("*MRP inclusive of all taxes");
	 * System.out.println("----------------------------");
	 * System.out.println("Confirm Your Order press Y/N"); h.list.add(""); order();
	 * } else if(opt == 3) { System.out.println(
	 * "<--------------------------------------------------------->");
	 * System.out.println("     "); System.out.println(
	 * "<--------------------------------------------------------->");
	 * System.out.println(""); System.out.println(""); System.out.println("₹");
	 * System.out.println("*MRP inclusive of all taxes");
	 * System.out.println("----------------------------");
	 * System.out.println("Confirm Your Order press Y/N"); h.list.add(""); order();
	 * } else if(opt == 4) { System.out.println(
	 * "<--------------------------------------------------------->");
	 * System.out.println("     "); System.out.println(
	 * "<--------------------------------------------------------->");
	 * System.out.println(""); System.out.println(""); System.out.println("₹");
	 * System.out.println("*MRP inclusive of all taxes");
	 * System.out.println("----------------------------");
	 * System.out.println("Confirm Your Order press Y/N"); h.list.add(""); order();
	 * } else { System.out.println("Enter a valid Option."); nebVap(); }
	 * 
	 * }
	 */
	
	
	
	
	
	
	//==============================================================================================	

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
            	 bpMonitors();
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
     			break;
             }
             case 4 :
             {
           	  if(h.Price != 0.0)
           	  {
           		  for(Object obj : list)
           		  {
           			  System.out.println(obj);
           		  }  
           	  System.out.println("Your Order Price :"+h.Price);
           	  System.out.println("Thank You .");
           	  System.out.println("<----Vist Again .---->");
           	  System.exit(0);
           	  }
   
           	  break ;
             }
	        }
           }else
           {
        	  System.out.println("Enter a valid input ."); 
        	  display();
           }
	    }
	
	
	
}
