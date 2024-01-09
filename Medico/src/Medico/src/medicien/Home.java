package medicien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home {
	
    static double Price;
	static List list = new ArrayList();
	
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
					pc.display();
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
					DiabetesCare d = new DiabetesCare();
					d.display();
					
					break;
				}
				
				case 6:
				{
					HealthcareDevices hd = new HealthcareDevices();
					hd.display();
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
					System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
					System.out.println("------❤️❤️ Thank You 💖💖--------");
					System.out.println("(●'◡'●)   Vist Again.    (●'◡'●) ");
					System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
					System.exit(0);
				}
				
				default : 
				{
					System.err.println("Enter valid Input .");
					home();
				}
				
				}
				
	
          } 
	
}
