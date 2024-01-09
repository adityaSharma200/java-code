package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalCare extends Home{

	{
		System.out.println("<--------------------------->");
		System.out.println("  ❤ Personal Care ❤  ");
		System.out.println("<--------------------------->");
	}

	public void display() {
		Scanner s = new Scanner(System.in);

		System.out.println("Chosse any One Option .");
		System.out.println("1. Skin Care");
		System.out.println("2. Hair Care");
		System.out.println("3. Baby and Mom Care");
		System.out.println("4. Oral Care");
		System.out.println("5. Elderly Care");
		System.out.println("6. Go Back To Main Menu");
		System.out.println("7. Proceed to Bill.");

		int n = s.nextInt();

		switch (n) {
		case 1: {
			skinCare();
			break;
		}
		case 2: {
			hairCare();
			break;
		}
		case 3: {
			baby_MomCare();
			break;
		}
		case 4: {
			   OralCare();
			  break ;
		}
		case 5:
		{     ElderlyCare();
			break;
		}
		case 6 :
		{
			Home h = new Home();
			h.home();
			break;
		}
		case 7: {
			Home h = new Home();

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
			System.out.println("Enter valid input .");
			display();
		}
		}
	}
	
	
//=================================================== ==============================================	
	
	public void skinCare()
	{
		
	 
		System.out.println("******************************");
		System.out.println("         Skin Care ");
		System.out.println("******************************");
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3.");
		System.out.println("4.");
		
		
		
		
		
		
		       
		
		
	}
	//=================================================== ==============================================	
	
	public void hairCare() 
	{
		System.out.println("******************************");
		System.out.println("        Hair Care ");
		System.out.println("******************************");
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3.");
		System.out.println("4.");
	}
	
	//=================================================== ==============================================	
	
	
	public void baby_MomCare()
	{
		System.out.println("******************************");
		System.out.println("       Baby and Mom Care ");
		System.out.println("******************************");
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3.");
		System.out.println("4.");
	}
	
	//=================================================== ==============================================
	
	public void OralCare()
	{
		System.out.println("******************************");
		System.out.println("        Oral Care ");
		System.out.println("******************************");
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3.");
		System.out.println("4.");
	}
	
	//=================================================== ==============================================	
	
	public void ElderlyCare()
	{
		System.out.println("******************************");
		System.out.println("        Elderly Care ");
		System.out.println("******************************");
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3.");
		System.out.println("4.");
	}
	
	//=================================================== ==============================================	
	
	
	
	
	
}
