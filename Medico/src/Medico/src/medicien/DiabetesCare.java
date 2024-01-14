package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class DiabetesCare extends Home{

	Home h = new Home();
	
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
			//System.out.println("1."+li.get(0));
			
			h.printde("Accu Chek Active Strips 50","Roche",50 ,2300.0);
			System.out.println("Confirm Your Order press Y/N");
			
			order(2300.0);
			break;
		}
		case 2:
		{   
			System.out.println("1."+li.get(1));
			h.printde("Accu Chek Instant Blood Glucose Test Strips 50. ","Roche",50 ,1030.50);
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 3:
		{   
			System.out.println("1."+li.get(2));
			h.printde("Contour Plus Blood Glucose Test Strip 50. ","Ascensia Diabetes Care India Private Limited",50 ,899.10);
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 4:
		{   
			System.out.println("1."+li.get(3));
			h.printde("One Touch Select Plus Test Strips 50. ","Lifescan Medical Devices India Pvt Ltd",50 ,1087.75);
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 5:
		{   
			System.out.println("1."+li.get(4));
			h.printde("One Touch Select Strips 50. ","Roche",50 ,1165.50);
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 6:
		{   
			System.out.println("1."+li.get(5));
			h.printde("Accu Chek Active Strips 2*50. ","Roche",50 ,1798.20);
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 7:
		{   
			System.out.println("1."+li.get(6));
			h.printde("Contour Plus 2*25 Strips 50. ","",50 ,933.61);
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 8:
		{   
			System.out.println("1."+li.get(7));
			h.printde("One Touch Select Strips 25. ","Ascensia Diabetes Care India Private Limited",25 ,630.00);
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 9:
		{   
			System.out.println("1."+li.get(8));
			h.printde("One Touch Select Plus Test Strips 25. ","Lifescan Medical Devices India Pvt Ltd", 25  ,591.50);
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 10:
		{   
			System.out.println("1."+li.get(9));
			h.printde("Dr Morepen Gluco One Bg 03 Blood Glucose Test Strip 25. ","Morepen Laboratories Limited",25 ,474.05);
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
		li.add("Dr Morepen Bg 03 Gluco One Glucometer With Gluco One Bg 03 Blood Glucose 25 Test Strip Kit 1");
		li.add("Dr Morepen Bg 03 Gluco One Blood Glucose Monitoring System 1");
		li.add("One Touch Verio Flex Glucometer 10 Test Strips Free Kit 1");
		li.add("Tushti Pulse Oximeter Tx 25 + 1");
		li.add("Accuchek Instant Glucometer With Free 10 Test Strip Combipack Of 1");
		li.add("Contour Plus Blood Glucose Monitoring System Free 25 Test Strip 1");
		li.add("Accu Chek Instant S Blood Glucometer 10 Test Strips Free Kit 1");
		
		
		System.out.println("__________________________________________________________");
		System.out.println("Select Your Blood Glucose Monitors as You want . ");
		System.out.println("__________________________________________________________");
		System.out.println("1.  "+li.get(10));
		System.out.println("2.  "+li.get(11));
		System.out.println("3.  "+li.get(12));
		System.out.println("4.  "+li.get(13));
		System.out.println("5.  "+li.get(14));
		System.out.println("6.  "+li.get(15));
		System.out.println("7.  "+li.get(16));
		
		
		int opt = sc.nextInt();
		
		switch(opt)
		{
		case 1:
		{   
			System.out.println("1."+li.get(10));
			h.printde("Dr Morepen Bg 03 Gluco One Glucometer With Gluco One Bg 03 Blood Glucose 25 Test Strip Kit 1 ","Morepen Laboratories Limited",1  ,1105.80);
			System.out.println("Confirm Your Order press Y/N");
			order(1105.80);
			break;
		}
		case 2:
		{   
			System.out.println("1."+li.get(11));
			h.printde("Dr Morepen Bg 03 Gluco One Blood Glucose Monitoring System 1 ","Morepen Laboratories Limited",1 ,631.75);
			System.out.println("Confirm Your Order press Y/N");
			order(631.75);
			break;
		}
		case 3:
		{   
			System.out.println("1."+li.get(12));
			h.printde("One Touch Verio Flex Glucometer 10 Test Strips Free Kit 1 ","Johnson & Johnson",1 ,1198.90);
			System.out.println("Confirm Your Order press Y/N");
			order(1198.90);
			break;
		}
		case 4:
		{   
			System.out.println("1."+li.get(13));
			h.printde("Tushti Pulse Oximeter Tx 25 + 1 ","Tushti International Pvt. Ltd.",1 ,1919.04);
			System.out.println("Confirm Your Order press Y/N");
			order(1919.04);
			break;
		}
		case 5:
		{   
			System.out.println("1."+li.get(14));
			h.printde("Accuchek Instant Glucometer With Free 10 Test Strip Combipack Of 1 ","Roche", 1  ,1394.10);
			System.out.println("Confirm Your Order press Y/N");
			order(1394.10);
			break;
		}
		case 6:
		{   
			System.out.println("1."+li.get(15));
			h.printde("Contour Plus Blood Glucose Monitoring System Free 25 Test Strip 1 ","Ascensia Diabetes Care India Private Limited",1  ,949.05);
			System.out.println("Confirm Your Order press Y/N");
			order(949.05);
			break;
		}
		case 7:
		{   
			System.out.println("1."+li.get(16));
			h.printde("Accu Chek Instant S Blood Glucometer 10 Test Strips Free Kit 1 ","Roche",1  ,1044.05);
			System.out.println("Confirm Your Order press Y/N");
			order(1044.05);
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
		li.add("Ensure Diabetes Care Powder Vanilla Flavour 1 Kg");
		li.add("Protinex Diabetes Care Powder Vanilla Flavour 400 GM ");
		li.add("Prohance D Diabetes Care Vanilla Powder 400 GM");
		li.add("Ensure Diabetes Care Chocolate Refill Powder 400 GM");
		li.add("Horlicks Diabetes Plus Vanilla 400 GM");
		li.add("Ensure Diabetes Care Vanilla Refill Powder 400 GM");
		li.add("Ensure Diabetes Care Vanilla Powder Jar 400 GM");
		li.add("Sugar Free Natura Powder 100 GM");
		li.add("Rosuvas Ez 20/10 MG Tablet 10 ");
		li.add("Fresubin Dm Cardamom 400 GM ");
		
		System.out.println("__________________________________________________________");
		System.out.println("Select Your Diabetic Diet as You want . ");
		System.out.println("__________________________________________________________");
		System.out.println("1.  "+li.get(17));
		System.out.println("2.  "+li.get(18));
		System.out.println("3. "+li.get(19));
		System.out.println("4.  "+li.get(20));
		System.out.println("5.  "+li.get(21));
		System.out.println("6.  "+li.get(22));
		System.out.println("7.  "+li.get(23));
		System.out.println("8.  "+li.get(24));
		System.out.println("9.  "+li.get(25));
		System.out.println("10.  "+li.get(26));
		
		
		int opt = sc.nextInt();
		
		switch(opt)
		{
		
		case 1:
		{   
			System.out.println("1."+li.get(17));
			h.printde("Ensure Diabetes Care Powder Vanilla Flavour 1 Kg ","Abbott India Ltd.",1 ,1929.20);
			System.out.println("Confirm Your Order press Y/N");
			order(1929.20);
			break;
		}
		case 2:
		{   
			System.out.println("1."+li.get(18));
			h.printde("Protinex Diabetes Care Powder Vanilla Flavour 400 GM ","Nutricia International Pvt Ltd",400 ,732.60);
			System.out.println("Confirm Your Order press Y/N");
			order(732.60);
			break;
		}
		case 3:
		{   
			System.out.println("1."+li.get(19));
			h.printde("Prohance D Diabetes Care Vanilla Powder 400 GM ","Ranbaxy Laboratories Ltd",400  ,652.50);
			System.out.println("Confirm Your Order press Y/N");
			order(652.50);
			break;
		}
		
		
		
		case 4:
		{   
			System.out.println("1."+li.get(20));
			h.printde("Ensure Diabetes Care Chocolate Refill Powder 400 GM ","Abbott India Ltd.",400  ,860.25);
			System.out.println("Confirm Your Order press Y/N");
			order(860.25);
			break;
		}
		case 5:
		{   
			System.out.println("1."+li.get(21));
			h.printde("Horlicks Diabetes Plus Vanilla 400 GM ","Hindustan Unilever Ltd",400 ,790.00);
			System.out.println("Confirm Your Order press Y/N");
			order(790.00);
			break;
		}
		case 6:
		{   
			System.out.println("1."+li.get(22));
			h.printde("Ensure Diabetes Care Vanilla Refill Powder 400 GM ","Abbott India Ltd.",400  ,878.75);
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 7:
		{   
			System.out.println("1."+li.get(23));
			h.printde("Ensure Diabetes Care Vanilla Powder Jar 400 GM ","Abbott India Ltd.",400 ,945.25);
			System.out.println("Confirm Your Order press Y/N");
			order(945.25);
			break;
		}
		case 8:
		{   
			System.out.println("1."+li.get(24));
			h.printde("Sugar Free Natura Powder 100 GM ","Zydus Wellness",100 ,135.00);
			System.out.println("Confirm Your Order press Y/N");
			order(135.00);
			break;
		}
		case 9:
		{   
			System.out.println("1."+li.get(25));
			h.printde("Rosuvas Ez 20/10 MG Tablet 10 ","Emcure Pharmaceuticals Ltd",10 ,289.84);
			System.out.println("Confirm Your Order press Y/N");
			order(289.84);
			break;
		}
		case 10:
		{   
			System.out.println("1."+li.get(26));
			h.printde("Fresubin Dm Cardamom 400 GM ","Fresenius Kabi India Pvt Ltd",400  ,788.40);
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
		li.add("Sugar Free Gold Low Calories Sweetner Pellets 500");
		li.add("Sugar Free Gold Pellets 300");
		li.add("Sugar Free Natura Pellets 300");
		li.add("Sugar Free Gold Low Calories  Pellets 500");
		li.add("Sugar Free Gold Pellets 100");
		li.add("Sugar Free Gold Sachet 100");
		li.add("Sugar Free Natura Drop 10 ML ");
		li.add("Stalix M Xr 100/1000 MG Tablet Er 10");
		li.add("Sugar Free Gold Low Calorie Sweetener Powder 100 GM ");
		li.add("Sugar Free Natura Sachet 100 ");
		
		System.out.println("__________________________________________________________");
		System.out.println("Select Your Sugar Substitutes as You want . ");
		System.out.println("__________________________________________________________");
		
		System.out.println("1.  "+li.get(27));
		System.out.println("2.  "+li.get(28));
		System.out.println("3. "+li.get(29));
		System.out.println("4.  "+li.get(30));
		System.out.println("5.  "+li.get(31));
		System.out.println("6.  "+li.get(32));
		System.out.println("7.  "+li.get(33));
		System.out.println("8.  "+li.get(34));
		System.out.println("9.  "+li.get(35));
		System.out.println("10.  "+li.get(36));
		
		
		int opt = sc.nextInt();
		
		switch(opt)
		{
		
		case 1:
		{   
			System.out.println("1."+li.get(27));
			h.printde("Sugar Free Gold Low Calories Sweetner Pellets 500 ","Zydus Wellness",500 ,285.00);
			System.out.println("Confirm Your Order press Y/N");
			order(285.00);
			break;
		}
		case 2:
		{   
			System.out.println("1."+li.get(28));
			h.printde("Sugar Free Gold Pellets 300 ","Zydus Wellness",300 ,199.00);
			System.out.println("Confirm Your Order press Y/N");
			order(199.00);
			break;
		}
		case 3:
		{   
			System.out.println("1."+li.get(29));
			h.printde("Sugar Free Natura Pellets 300 ","Zydus Wellness", 300  ,189.05);
			System.out.println("Confirm Your Order press Y/N");
			order(189.05);
			break;
		}
	
		case 4:
		{   
			System.out.println("1."+li.get(30));
			h.printde("Sugar Free Gold Low Calories  Pellets 500 ","Zydus Wellness",500 ,285.00);
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 5:
		{   
			System.out.println("1."+li.get(31));
			h.printde("Sugar Free Gold Pellets 100 ","Zydus Wellness",100 ,67.50);
			System.out.println("Confirm Your Order press Y/N");
			order(67.50);
			break;
		}
		case 6:
		{   
			System.out.println("1."+li.get(32));
			h.printde("Sugar Free Gold Sachet 100 ","Zydus Wellness",100  ,142.50);
			System.out.println("Confirm Your Order press Y/N");
			order(142.50);
			break;
		}
		case 7:
		{   
			System.out.println("1."+li.get(33));
			h.printde("Sugar Free Natura Drop 10 ML ","Zydus Wellness",10 ,133.00);
			System.out.println("Confirm Your Order press Y/N");
			order(133.00);
			break;
		}
		case 8:
		{   
			System.out.println("1."+li.get(34));
			h.printde("Stalix M Xr 100/1000 MG Tablet Er 10 ","Torrent Pharmaceuticals Ltd.",10 ,142.00);
			System.out.println("Confirm Your Order press Y/N");
			order(2300.0);
			break;
		}
		case 9:
		{   
			System.out.println("1."+li.get(35));
			h.printde("Sugar Free Gold Low Calorie Sweetener Powder 100 GM ","Zydus Wellness",100 ,142.50);
			System.out.println("Confirm Your Order press Y/N");
			order(142.50);
			break;
		}
		case 10:
		{   
			System.out.println("1."+li.get(36));
			h.printde("Sugar Free Natura Sachet 100 ","Zydus Wellness", 100 ,135.00);
			System.out.println("Confirm Your Order press Y/N");
			order(135.00);
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
