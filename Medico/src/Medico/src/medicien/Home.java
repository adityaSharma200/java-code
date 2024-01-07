package medicien;

import java.util.Scanner;

public class Home {
	
          static double Price;
	
			public void home()
			{
				Scanner sc = new Scanner(System.in);
				
				System.out.println("================================");
				System.out.println("        Select Categories        ");
				System.out.println("================================");
				System.out.println("1.Medicines.");
				System.out.println("2.Personal Care.");
				System.out.println("3.Health Conditions.");
				System.out.println("4.Vitamins & Supplements .");
				System.out.println("5.Diabetes Care.");
				System.out.println("6.Healthcare Devices.");
				System.out.println("7.Health Article.");
				System.out.println("8.For exit.");
				System.out.println("================================");
				int option = sc.nextInt();
				
				switch(option)
				{
				
				case 1:
				{
					Medicines m1 = new Medicines();
					m1.display();
					
					break;
				}
				
				case 2:
				{
					PersonalCare pc = new PersonalCare();
					System.out.println(".....");
					break;
				}
				
				case 3:
				{
					//HealthConditions
					System.out.println(".....");
					break;
				}
				
				case 4:
				{
					//Vitamins & Supplements
					System.out.println(".....");
					break;
				}
				
				case 5:
				{
					//Diabetes Care
					System.out.println(".....");
					break;
				}
				
				case 6:
				{
					//Healthcare Devices
					System.out.println(".....");
					break;
				}
				
				case 7:
				{
					//Health Article
					System.out.println(".....");
					break;
				}
				case 8 :
				{
					System.exit(0);
				}
				
				default : 
				{
					System.out.println("Enter valid Input .");
					home();
				}
				
				}
				
	
          } 
	
	
	
	
	
	
	
	
}
