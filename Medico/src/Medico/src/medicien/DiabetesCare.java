package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class DiabetesCare extends Home{

	static ArrayList<String> li = new ArrayList<String>();
	
	{
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("         🧰  Diabetes Care 🧰 ");
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
	}
	
	
	public void display()
	{
		Home h = new Home();
		Scanner s = new Scanner(System.in);

		System.out.println("Chosse any One Option .");
		System.out.println("1. Test Strips and Lancets");
		System.out.println("2. Blood Glucose Monitors");
		System.out.println("3. Diabetic Diet");
		System.out.println("4. Sugar Substitutes");
		System.out.println("5. Go Back To Home Page");
		System.out.println("6. Proceed to Bill.");

		int n = s.nextInt();

		switch (n) {
		case 1: {
			tsL();
			break;
		}
		case 2: {
			bGM();
			break;
		}
		case 3: {
			dD();
			break;
		}
		case 4 :
		{
			sSugar();
		}
		case 5: {
			
			h.home();
			break;
		}
		case 6: {
			

			if (h.Price != 0.0) {
				System.out.println("Your Order Price :" + h.Price);
				System.out.println("Thank You . Vist Again .");
				System.exit(0);
			} else {
				System.out.println("Please first Select  Any Device.");
				display();
			}

			break;
		}
		default: {
			System.err.println("Enter valid input .");
			display();
		}
		}
		
		
		
		
		
	}
	
	
	
	public void tsL()
	{
		
		 
		Scanner sc = new Scanner(System.in);
		
		
		li.add("Accu Chek Active Strips 50.  " +"₹ 2300.0 ");
		li.add("Accu Chek Instant Blood Glucose Test Strips 50.  "+"₹  ");
		li.add("Contour Plus Blood Glucose Test Strip 50.  "+"₹  ");
		li.add("One Touch Select Plus Test Strips 50.  "+"₹  ");
		li.add("One Touch Select Strips 50.  "+"₹  ");
		li.add("Accu Chek Active Strips 2*50.  "+"₹  ");
		li.add("Contour Plus 2*25 Strips 50.  "+"₹  ");
		li.add("One Touch Select Strips 25.  "+"₹  ");
		li.add("One Touch Select Plus Test Strips 25.  "+"₹  ");
		li.add("Dr Morepen Gluco One Bg 03 Blood Glucose Test Strip 25.  "+"₹  ");
		
		
		System.out.println("__________________________________________________________");
		System.out.println("Select Your Test Strips and Lancets as You want . ");
		System.out.println("__________________________________________________________");
		System.out.println("1.  "+li.get(0));
		System.out.println("2.  "+li.get(1));
		System.out.println("3.  "+li.get(2));
		System.out.println("4.  "+li.get(3));
		System.out.println("5.  "+li.get(4));
		System.out.println("6.  "+li.get(5));
		System.out.println("7.  "+li.get(6));
		System.out.println("8.  "+li.get(7));
		System.out.println("9.  "+li.get(8));
		System.out.println("10. "+li.get(9));
		
		int opt = sc.nextInt();
		
		switch(opt)
		{
		case 1:
		{   
			System.out.println("1."+li.get(0));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 2:
		{   
			System.out.println("1."+li.get(1));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 3:
		{   
			System.out.println("1."+li.get(2));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 4:
		{   
			System.out.println("1."+li.get(3));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 5:
		{   
			System.out.println("1."+li.get(4));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 6:
		{   
			System.out.println("1."+li.get(5));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 7:
		{   
			System.out.println("1."+li.get(6));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 8:
		{   
			System.out.println("1."+li.get(7));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 9:
		{   
			System.out.println("1."+li.get(8));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 10:
		{   
			System.out.println("1."+li.get(9));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		
		default :
		{
			System.err.println("Please Enter valid Input .");
			tsL();
		}
		}
		
		
	}
	
	//====================================================================================	
	
	public void bGM()
	{
		Scanner sc = new Scanner(System.in);
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		
		System.out.println("__________________________________________________________");
		System.out.println("Select Your Test Strips and Lancets as You want . ");
		System.out.println("__________________________________________________________");
		System.out.println("1.  "+li.get(10));
		System.out.println("2.  "+li.get(11));
		System.out.println("3.  "+li.get(12));
		System.out.println("4.  "+li.get(13));
		System.out.println("5.  "+li.get(14));
		System.out.println("6.  "+li.get(15));
		System.out.println("7.  "+li.get(16));
		System.out.println("8.  "+li.get(17));
		System.out.println("9.  "+li.get(18));
		System.out.println("10. "+li.get(19));
		
		int opt = sc.nextInt();
		
		switch(opt)
		{
		case 1:
		{   
			System.out.println("1."+li.get(10));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 2:
		{   
			System.out.println("1."+li.get(11));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 3:
		{   
			System.out.println("1."+li.get(12));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 4:
		{   
			System.out.println("1."+li.get(13));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 5:
		{   
			System.out.println("1."+li.get(14));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 6:
		{   
			System.out.println("1."+li.get(15));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 7:
		{   
			System.out.println("1."+li.get(16));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 8:
		{   
			System.out.println("1."+li.get(17));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 9:
		{   
			System.out.println("1."+li.get(18));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 10:
		{   
			System.out.println("1."+li.get(19));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		
		default :
		{
			System.err.println("Please Enter valid Input .");
			bGM();
		}
		}
		
		
		
		
		
		
	}
	
	//====================================================================================	
	public void dD()
{
		Scanner sc = new Scanner(System.in);
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		
		System.out.println("__________________________________________________________");
		System.out.println("Select Your Test Strips and Lancets as You want . ");
		System.out.println("__________________________________________________________");
		System.out.println("1.  "+li.get(20));
		System.out.println("2.  "+li.get(21));
		System.out.println("3.  "+li.get(22));
		System.out.println("4.  "+li.get(23));
		System.out.println("5.  "+li.get(24));
		System.out.println("6.  "+li.get(25));
		System.out.println("7.  "+li.get(26));
		System.out.println("8.  "+li.get(27));
		System.out.println("9.  "+li.get(28));
		System.out.println("10. "+li.get(29));
		
		int opt = sc.nextInt();
		
		switch(opt)
		{
		case 1:
		{   
			System.out.println("1."+li.get(20));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 2:
		{   
			System.out.println("1."+li.get(21));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 3:
		{   
			System.out.println("1."+li.get(22));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 4:
		{   
			System.out.println("1."+li.get(23));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 5:
		{   
			System.out.println("1."+li.get(24));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 6:
		{   
			System.out.println("1."+li.get(25));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 7:
		{   
			System.out.println("1."+li.get(26));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 8:
		{   
			System.out.println("1."+li.get(27));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 9:
		{   
			System.out.println("1."+li.get(28));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 10:
		{   
			System.out.println("1."+li.get(29));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		
		default :
		{
			System.err.println("Please Enter valid Input .");
			dD();
		}
		}
		
		
	}
	
	//====================================================================================	
	
	public void sSugar()
    {
		Scanner sc = new Scanner(System.in);
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		li.add(""+" ₹ ");
		
		System.out.println("__________________________________________________________");
		System.out.println("Select Your Test Strips and Lancets as You want . ");
		System.out.println("__________________________________________________________");
		System.out.println("1.  "+li.get(30));
		System.out.println("2.  "+li.get(31));
		System.out.println("3.  "+li.get(32));
		System.out.println("4.  "+li.get(33));
		System.out.println("5.  "+li.get(34));
		System.out.println("6.  "+li.get(35));
		System.out.println("7.  "+li.get(36));
		System.out.println("8.  "+li.get(37));
		System.out.println("9.  "+li.get(38));
		System.out.println("10. "+li.get(39));
		
		int opt = sc.nextInt();
		
		switch(opt)
		{
		case 1:
		{   
			System.out.println("1."+li.get(30));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 2:
		{   
			System.out.println("1."+li.get(31));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 3:
		{   
			System.out.println("1."+li.get(32));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 4:
		{   
			System.out.println("1."+li.get(33));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 5:
		{   
			System.out.println("1."+li.get(34));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 6:
		{   
			System.out.println("1."+li.get(35));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 7:
		{   
			System.out.println("1."+li.get(36));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 8:
		{   
			System.out.println("1."+li.get(37));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 9:
		{   
			System.out.println("1."+li.get(38));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 10:
		{   
			System.out.println("1."+li.get(39));
			System.out.println("----------------------------");
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		
		default :
		{
			System.err.println("Please Enter valid Input .");
			sSugar();
		}
		}
		
	}
	
	
	//====================================================================================
	
	   public void order(double price) {
		Scanner sc = new Scanner(System.in);

		char option = sc.next().charAt(0);

		if (option == 'Y' || option == 'y') {
			Home h = new Home();

			h.Price = h.Price + price;

			System.out.println("Do you want Order more");
			System.out.println("1.Order from same Menu");
			System.out.println("2.go back");
			System.out.println("3.change Medicien Menu");
			System.out.println("4.procees bill");

			int opt = sc.nextInt();

			switch (opt) {
			case 1: {
				
				 switch(opt) {
				 case 1 :
				 {
					 tsL();
					 break;
				 }
				 case 2 :
				 {
					 bGM();
					 break;
				 }
				 case 3 :
				 {
					 dD();
					 break;
				 }
				 case 4 :
				 {
					 sSugar();
					 break; 
				 }
				 default :
				 {
					 
				 }
				              }
				
			       }
			case 2: {
				display();
				break;
			}
			case 3: {
				h.home();
				break;
			}
			case 4: {
				if (h.Price != 0.0) {
					for (Object obj : list) {
						System.out.println(obj);
					}
					System.out.println("Your Order Price :" + h.Price);
					System.out.println("Thank You .");
					System.out.println("<----Vist Again .---->");
					System.exit(0);
				}

				break;
			}
			}
		} else {
			System.err.println("Enter a valid input .");
			display();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
