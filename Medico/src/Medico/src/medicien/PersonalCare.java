package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalCare extends Home{

	static ArrayList<String> li1 = new ArrayList<String>();
	
	
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
		
		default: {
			System.err.println("Enter valid input .");
			display();
		}
		}
	}
	
	
//==============================================================================================================	
	
	public void skinCare()
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("******************************");
		System.out.println("         Skin Care ");
		System.out.println("******************************");
		System.out.println("1. Skin Cream");
		System.out.println("2. Sunscreen");
		System.out.println("3. Face Wash");
		System.out.println("4. Body Wash");
		System.out.println("5. Go back");
		int opt = s.nextInt();
		switch (opt) {
       case 1: {
    	   skinCream();
			break;
		        }
		case 2: {
			sunScreen();
			break;
		        }
		case 3: {
			faceWash();
			break;
        }
		case 4: {
			bodyWash();
			break;
        }
		case 5: {
			display();
			break;
        }
		default:
			System.err.println("Enter a Valid Option.");
			skinCare();
		}
		
		
		       
		
		
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
		System.out.println("5. Go back");
		
		
		
		
		
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
		System.out.println("5. Go back");
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
		System.out.println("5. Go back");
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
		System.out.println("5. Go back");
	}
	
	//=================================================== ==============================================	
	
	public void skinCream()
	{
		Home h = new Home();
		
		Scanner sc = new Scanner(System.in);
		
		li1.add("Ga 6 % Cream 30 GM");
		li1.add("Depiwhite Cream 15 ML");
		li1.add("Biluma Cream 15 GM");
		li1.add("Episoft Ac Moisturising Cream 75 GM");
		li1.add("Melaglow Rich Cream 20 GM");
		li1.add("Excela Moisturiser Cream 50 GM");
		li1.add("Kojiglo Gold Cream 20 GM");
		li1.add("Venusia Max Cream 150 GM");
		li1.add("Cosglo New Cream 30 GM");
		li1.add("Acnemoist Cream 60 GM");
		
		
		System.out.println("1.  "+li1.get(0));
		System.out.println("2.  "+li1.get(1));
		System.out.println("3.  "+li1.get(2));
		System.out.println("4.  "+li1.get(3));
		System.out.println("5.  "+li1.get(4));
		System.out.println("6.  "+li1.get(5));
		System.out.println("7.  "+li1.get(6));
		System.out.println("8.  "+li1.get(7));
		System.out.println("9.  "+li1.get(8));
		System.out.println("10. "+li1.get(9));
		
		int opt = sc.nextInt();
		
		switch (opt) {
		case 1: {
			h.printde("Ga 6 % Cream 30 GM ","Klm Pharmaceuticals",30 ,132.00);
			order(132.00);
			
			break;
		        }
		case 2: {
			h.printde("Depiwhite Cream 15 ML ","Dr. Reddys Laboratories Ltd",15 ,442.40);
			break;
		        }
		case 3: {
			h.printde("Biluma Cream 15 GM ","Galderma India Pvt. Ltd",15 ,496.00);
			break;
        }
		case 4: {
			h.printde("Episoft Ac Moisturising Cream 75 GM ","Glenmark Pharmaceuticals Ltd.",75 ,540.00);
			break;
        }
		case 5: {
			h.printde("Melaglow Rich Cream 20 GM ","Abbott Healthcare Pvt. Ltd",20 ,383.20);
			break;
        }
		case 6 : {
			h.printde("Excela Moisturiser Cream 50 GM ","Cipla Ltd.",50 ,397.60);
			break;
        }
		case 7 : {
			h.printde("Kojiglo Gold Cream 20 GM ","Alkem Laboratories Ltd.",20  ,432.00);
			break;
        }
		case 8: {
			h.printde("Venusia Max Cream 150 GM ","Dr. Reddys Laboratories Ltd",15,549.00);
			break;
        }
		case 9 : {
			h.printde("Cosglo New Cream 30 GM ","Oaknet Healthcare",30 ,437.60);
			break;
        }
		case 10: {
			h.printde("Acnemoist Cream 60 GM ","Curatio Health Care Pvt Ltd.",60 ,368.10);
			break;
        }
		default:
			
		}
		
		
	}
	
	//=================================================== ==============================================
	public void sunScreen()
	{
		Scanner sc = new Scanner(System.in);
		
		li1.add("");
		li1.add("");
		li1.add("");
		li1.add("");
		li1.add("");
		li1.add("");
		li1.add("");
		li1.add("");
		li1.add("");
		li1.add("");
		
		
		System.out.println("1.  "+li1.get(0));
		System.out.println("2.  "+li1.get(1));
		System.out.println("3.  "+li1.get(2));
		System.out.println("4.  "+li1.get(3));
		System.out.println("5.  "+li1.get(4));
		System.out.println("6.  "+li1.get(5));
		System.out.println("7.  "+li1.get(6));
		System.out.println("8.  "+li1.get(7));
		System.out.println("9.  "+li1.get(8));
		System.out.println("10. "+li1.get(9));
		
		int opt = sc.nextInt();
		
		switch (opt) {
		case 1: {
			
			break;
		        }
		case 2: {
			
			break;
		        }
		case 3: {
	
			break;
        }
		case 4: {
	
			break;
        }
		case 5: {
	
			break;
        }
		case 6 : {
	
			break;
        }
		case 7 : {
	
			break;
        }
		case 8: {
	
			break;
        }
		case 9 : {
	
			break;
        }
		case 10: {
	
			break;
        }
		default:
			
		}
		
		
	}
	
	//=================================================== ==============================================
		public void faceWash()
		{
			Scanner sc = new Scanner(System.in);
			
			li1.add("");
			li1.add("");
			li1.add("");
			li1.add("");
			li1.add("");
			li1.add("");
			li1.add("");
			li1.add("");
			li1.add("");
			li1.add("");
			
			
			System.out.println("1.  "+li1.get(0));
			System.out.println("2.  "+li1.get(1));
			System.out.println("3.  "+li1.get(2));
			System.out.println("4.  "+li1.get(3));
			System.out.println("5.  "+li1.get(4));
			System.out.println("6.  "+li1.get(5));
			System.out.println("7.  "+li1.get(6));
			System.out.println("8.  "+li1.get(7));
			System.out.println("9.  "+li1.get(8));
			System.out.println("10. "+li1.get(9));
			
			int opt = sc.nextInt();
			
			switch (opt) {
			case 1: {
				
				break;
			        }
			case 2: {
				
				break;
			        }
			case 3: {
		
				break;
	        }
			case 4: {
		
				break;
	        }
			case 5: {
		
				break;
	        }
			case 6 : {
		
				break;
	        }
			case 7 : {
		
				break;
	        }
			case 8: {
		
				break;
	        }
			case 9 : {
		
				break;
	        }
			case 10: {
		
				break;
	        }
			default:
				
			}
			
			
		}
		
		//=================================================== ==============================================
				public void bodyWash()
				{
					Scanner sc = new Scanner(System.in);
					
					li1.add("");
					li1.add("");
					li1.add("");
					li1.add("");
					li1.add("");
					li1.add("");
					li1.add("");
					li1.add("");
					li1.add("");
					li1.add("");
					
					
					System.out.println("1.  "+li1.get(0));
					System.out.println("2.  "+li1.get(1));
					System.out.println("3.  "+li1.get(2));
					System.out.println("4.  "+li1.get(3));
					System.out.println("5.  "+li1.get(4));
					System.out.println("6.  "+li1.get(5));
					System.out.println("7.  "+li1.get(6));
					System.out.println("8.  "+li1.get(7));
					System.out.println("9.  "+li1.get(8));
					System.out.println("10. "+li1.get(9));
					
					int opt = sc.nextInt();
					
					switch (opt) {
					case 1: {
						
						break;
					        }
					case 2: {
						
						break;
					        }
					case 3: {
				
						break;
			        }
					case 4: {
				
						break;
			        }
					case 5: {
				
						break;
			        }
					case 6 : {
				
						break;
			        }
					case 7 : {
				
						break;
			        }
					case 8: {
				
						break;
			        }
					case 9 : {
				
						break;
			        }
					case 10: {
				
						break;
			        }
					default:
						
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
								 skinCare();
								 break;
							 }
							 case 2 :
							 {
								 sunScreen();
								 break;
							 }
							 case 3 :
							 {
								 faceWash();
								 break;
							 }
							 case 4 :
							 {
								 bodyWash();
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
