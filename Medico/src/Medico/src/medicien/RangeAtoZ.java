package medicien;

import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Scanner;

	public class RangeAtoZ extends Home{
		int nu;
		String Companyname;
		String Brandname;
		int pack;
		double price;
		 Home h = new Home();
		RangeAtoZ(){}
	
		ArrayList a = new ArrayList();
		
		Scanner s = new Scanner(System.in);
		
		RangeAtoZ(int nu,String Brandname,String Companyname,int pack,double price)
		{
			this.nu =nu;
			this.Brandname = Brandname;
			this.Companyname =Companyname;
			this.pack = pack;
			this.price = price;
		}
		
		
		public String toString()
		{
			
			  System.out.println("_____________________________");
			  System.out.println("                             ");
			  System.out.println(nu +".    "+Brandname+"   ");
			  System.out.println("_____________________________");
			  System.out.println("----------------------------");
			  System.out.println(" "+Companyname);
			  System.out.println(" Pack of  "+pack+" units");
			  System.out.println("₹ "+price);
			  System.out.println("----------------------------");

			return "";
		}
		
		
		
		public void rangeaAtoZ()
		{
			
			RangeAtoZ a1 = new RangeAtoZ(1,"A 1 5 MG Tablet 10","Patson Laboratories Pvt. Ltd.",10 ,30.40);
			RangeAtoZ a2 = new RangeAtoZ(2,"A 125 MG Suspension 60 ML","Adventure Life Science Pvt Ltd",60,20.00);
			RangeAtoZ a3 = new RangeAtoZ(3,"A 24 250 MG Tablet 6","Comed Chemicals Pvt Ltd",6,45.60);
			RangeAtoZ a4 = new RangeAtoZ(4,"A 250 MG Suspension 60 ML","Adventure Life Science Pvt Ltd",60,22.80);
			RangeAtoZ a5 = new RangeAtoZ(5,"A 3 100/500 MG Tablet 10","Relax Pharma",10,28.94);
			RangeAtoZ a6 = new RangeAtoZ(6,"A Art 150 MG Injection 2 ML","Biophar Lifesciences Pvt Ltd", 2,73.60);
			RangeAtoZ a7 = new RangeAtoZ(7,"A Bec 300 MG Tablet 30","Emcure Pharmaceuticals Ltd",30,1164.98);
			RangeAtoZ a8 = new RangeAtoZ(8,"A Bec L 600/300 MG Tablet 30","Emcure Pharmaceuticals Ltd",30,1733.76);
			RangeAtoZ a9 = new RangeAtoZ(9,"A Bex Junior Syrup 60 ML","Rishab Healthcare Pvt. Ltd.",60,37.60);
			RangeAtoZ a10 = new RangeAtoZ(10,"A Bex Sf Expectorant 100 ML","Rishab Healthcare Pvt. Ltd.", 100 ,67.92);
				
			
			a.add("1.1  A 1 5 MG Tablet 10  ₹:- 30.40");
			a.add("1.2  A 125 MG Suspension 60 ML  ₹:- 20.00");
			a.add("1.3  A 24 250 MG Tablet 6  ₹:- 45.60");
			a.add("1.4  A 250 MG Suspension 60 ML  ₹:- 22.80");
			a.add("1.5  A 3 100/500 MG Tablet 10  ₹:- 28.94");
			a.add("1.6  A Art 150 MG Injection 2 ML  ₹:- 73.60");
			a.add("1.7  A Bec 300 MG Tablet 30  ₹:- 1164.98");
			a.add("1.8  A Bec L 600/300 MG Tablet 30  ₹:- 1733.76");
			a.add("1.9  A Bex Junior Syrup 60 ML  ₹:- 37.60");
			a.add("1.10 A Bex Sf Expectorant 100 ML  ₹:- 67.92");
			
	//================++++++===========================================
			
			RangeAtoZ b1 = new RangeAtoZ(1,"B 29 Aq 500 MCG Injection 1 ML","Corona",1 ,49.08);
			RangeAtoZ b2 = new RangeAtoZ(2,"B 29 Aq Pfs Injection 1 ML","Corona Remedies Private Limited",1,110.00);
			RangeAtoZ b3 = new RangeAtoZ(3,"B 29 Daily Tablet 10","Corona",10,44.00);
			RangeAtoZ b4 = new RangeAtoZ(4,"B 29 Daily Tablet 14","Corona",14,44.00);
			RangeAtoZ b5 = new RangeAtoZ(5,"B 29 Daily Tablet 15","Corona",15 ,103.20);
			RangeAtoZ b6 = new RangeAtoZ(6,"B 29 Fast Mouth Dissolving 1500 MCG Strips 10","Corona",10,11.20);
			RangeAtoZ b7 = new RangeAtoZ(7,"B 29 Gold Aq Injection 2 ML","Corona",6,87.33);
			RangeAtoZ b8 = new RangeAtoZ(8,"B 29 Gold Tablet 10","Corona",6,450.5);
			RangeAtoZ b9 = new RangeAtoZ(9,"B 29 Injection 1 ML","Corona",5,54.5);
			RangeAtoZ b10 = new RangeAtoZ(10,"B 29 Injection 2 ML","Corona",4,54.54);
			
			
			a.add("2.1  B 29 Aq 500 MCG Injection 1 ML  ₹:- 49.08");
			a.add("2.2  B 29 Aq Pfs Injection 1 ML  ₹:- 110.00");
			a.add("2.3  B 29 Daily Tablet 10   ₹:- 44.00");
			a.add("2.4  B 29 Daily Tablet 14   ₹:- 44.00");
			a.add("2.5  B 29 Daily Tablet 15  ₹:- 103.20");
			a.add("2.6  B 29 Fast Mouth Dissolving 1500 MCG Strips 10  ₹:- 11.20");
			a.add("2.7  B 29 Gold Aq Injection 2 ML  ₹:-87.33");
			a.add("2.8  B 29 Gold Tablet 10  ₹:- 450.5");
			a.add("2.9  B 29 Injection 1 ML  ₹:- 54.5");
			a.add("2.10 B 29 Injection 2 ML  ₹ :- 54.54");
//================++++++===========================================	
			
			
			RangeAtoZ c1 = new RangeAtoZ(1,"C & C 2.5/30 MG Syrup 60 ML","Maestro Pharmaceuticals P.ltd",60 ,52.00);
			RangeAtoZ c2 = new RangeAtoZ(2,"C & C 5/60 MG Tablet 10","Maestro Pharmaceuticals P.ltd",10,40.00);
			RangeAtoZ c3 = new RangeAtoZ(3,"C & C Dx 5/2/10 MG Syrup 100 ML","Tas Med India Pvt Ltd",100 ,75.20);
			RangeAtoZ c4 = new RangeAtoZ(4,"C 10 Cold Tablet 10","Nukind Healthcare",10,24.00);
			RangeAtoZ c5 = new RangeAtoZ(5,"C 37 150 MG Drops 15 ML","Navil Laboratories",15 ,26.32);
			RangeAtoZ c6 = new RangeAtoZ(6,"C 37 250 MG Suspension 60 ML","Navil Laboratories", 60,32.00);
			RangeAtoZ c7 = new RangeAtoZ(7,"C 37 500 MG Tablet 10","Navil Laboratories",10,18.40);
			RangeAtoZ c8 = new RangeAtoZ(8,"C 3one Sb 1000/500 MG Injection 1","Novalife Healthcare",1,100.00);
			RangeAtoZ c9 = new RangeAtoZ(9,"C Art 0.5 % Eye Drops 10 ML","Appsamy Ocular Devices",10,111.32);
			RangeAtoZ c10 = new RangeAtoZ(10,"C Bactum 1000/1000 MG Injection 1","Vhb Life Sciences Limited",1,49.28);
			
			
			
			
			
			
			a.add("3.1  C & C 2.5/30 MG Syrup 60 ML ₹ :-52.00");
			a.add("3.2  C & C 5/60 MG Tablet 10  ₹ :- 40.00");
			a.add("3.3  C & C Dx 5/2/10 MG Syrup 100 ML  ₹ :- 75.20");
			a.add("3.4  C 10 Cold Tablet 10  ₹ :- 24.00");
			a.add("3.5  C 37 150 MG Drops 15 ML  ₹ :- 26.32");
			a.add("3.6  C 37 250 MG Suspension 60 ML  ₹ :- 32.00");
			a.add("3.7  C 37 500 MG Tablet 10  ₹ :- 18.40");
			a.add("3.8  C 3one Sb 1000/500 MG Injection 1  ₹ :-  100.00");
			a.add("3.9  C Art 0.5 % Eye Drops 10 ML  ₹ :- 111.32");
			a.add("3.10 C Bactum 1000/1000 MG Injection 1  ₹ :- 49.28");
			//================++++++===========================================	
			
			RangeAtoZ d1 = new RangeAtoZ(1," D 1000 Cal 500 Mg/1000iu Tablet 10","Eris Lifesciences Ltd",10 ,65.46);
			RangeAtoZ d2 = new RangeAtoZ(2,"D 25 % Infusion 100 ML","Marck Biosciences Ltd",100,14.46);
			RangeAtoZ d3 = new RangeAtoZ(3,"D 3 Bon Chewable Tablet 2","Sterkem", 2,51.20);
			RangeAtoZ d4 = new RangeAtoZ(4,"D 3 Bon Tablet 10","Sterkem",10,68.00);
			RangeAtoZ d5 = new RangeAtoZ(5,"D 360 400 IU Drops 30 ML","Torrent Pharmaceuticals Ltd.",30 ,55.18);
			RangeAtoZ d6 = new RangeAtoZ(6,"D 360 60000 IU Capsule 4","Torrent Pharmaceuticals Ltd.",4,110.27);
			RangeAtoZ d7 = new RangeAtoZ(7,"D 360 60000 IU Granules 1 GM","Torrent Pharmaceuticals Ltd.",1,30.44);
			RangeAtoZ d8 = new RangeAtoZ(8,"D 500 Cal 500 Mg/500iu Tablet 10","Eris Lifesciences Ltd",10,56.65);
			RangeAtoZ d9 = new RangeAtoZ(9,"D Acne I 10 MG Capsule 10","Glenmark Pharmaceuticals Ltd.",10,133.60);
			RangeAtoZ d10 = new RangeAtoZ(10,"D Acne Plus 0.5/1/4 % Gel 15 GM","Glenmark Pharmaceuticals Ltd.", 15,136.00);
			
			
			
			
			
			a.add("4.1  D 1000 Cal 500 Mg/1000iu Tablet 10 ₹ :- 65.46");
			a.add("4.2  D 25 % Infusion 100 ML ₹ :- 14.46");
			a.add("4.3  D 3 Bon Chewable Tablet 2 ₹ :- 51.20");
			a.add("4.4  D 3 Bon Tablet 10 ₹ :- 68.00");
			a.add("4.5  D 360 400 IU Drops 30 ML ₹ :- 55.18");
			a.add("4.6  D 360 60000 IU Capsule 4 ₹ :- 110.27");
			a.add("4.7  D 360 60000 IU Granules 1 GM ₹ :- 30.44");
			a.add("4.8  D 500 Cal 500 Mg/500iu Tablet 10 ₹ :- 56.65");
			a.add("4.9  D Acne I 10 MG Capsule 10 ₹ :- 133.60");
			a.add("4.10 D Acne Plus 0.5/1/4 % Gel 15 GM ₹ :- 136.00");
			//================++++++===========================================		

			
			System.out.println("*******************************************************");
			System.out.println(" Select Your medicine as You want. ");
			System.out.println(" Enter only number which is Display. ");
			System.out.println("*******************************************************");
			System.out.println("===============Range A Medicine=======================");
			System.out.println(a.get(0));
			System.out.println(a.get(1));
			System.out.println(a.get(2));
			System.out.println(a.get(3));
			System.out.println(a.get(4));
			System.out.println(a.get(5));
			System.out.println(a.get(6));
			System.out.println(a.get(7));
			System.out.println(a.get(8));
			System.out.println(a.get(9));
			System.out.println();
			System.out.println("===============Range B Medicine=======================");
			System.out.println(a.get(10));
			System.out.println(a.get(11));
			System.out.println(a.get(12));
			System.out.println(a.get(13));
			System.out.println(a.get(14));
			System.out.println(a.get(15));
			System.out.println(a.get(16));
			System.out.println(a.get(17));
			System.out.println(a.get(18));
			System.out.println(a.get(19));
			System.out.println();
			System.out.println("===============Range C Medicine=======================");
			System.out.println(a.get(20));
			System.out.println(a.get(21));
			System.out.println(a.get(22));
			System.out.println(a.get(23));
			System.out.println(a.get(24));
			System.out.println(a.get(25));
			System.out.println(a.get(26));
			System.out.println(a.get(27));
			System.out.println(a.get(28));
			System.out.println(a.get(29));
			System.out.println();
			System.out.println("===============Range D Medicine=======================");
			System.out.println(a.get(30));
			System.out.println(a.get(31));
			System.out.println(a.get(32));
			System.out.println(a.get(33));
			System.out.println(a.get(34));
			System.out.println(a.get(35));
			System.out.println(a.get(36));
			System.out.println(a.get(37));
			System.out.println(a.get(38));
			System.out.println(a.get(39));
			System.out.println("-------------------------");
			System.out.println("Press 5 to Go Back");
			System.out.println("-------------------------");
			String opt = s.next();
			try {
				
			switch (opt) {
			case "1.1": {
				System.out.println(a1);
				or1(30.40,0);
				break;
			}
			case "1.2": {
				System.out.println(a2);
				or1(20.00,1);
				break;
			}
			case "1.3": {
				System.out.println(a3);
				or1(45.60,2);
				break;
			}
			case "1.4": {
				System.out.println(a4);
				or1( 22.80,3);
				break;
			}
			case "1.5": {
				System.out.println(a5);
				or1( 28.94,4);
				break;
			}
			case "1.6": {
				System.out.println(a6);
				or1( 73.60,5);
				break;
			}

			case "1.7": {
				System.out.println(a7);
				or1( 1164.98,6);
				break;
			}
			case "1.8": {
				System.out.println(a8);
				or1(1733.76,7);
				break;
			}

			case "1.9" : {
				System.out.println(a9);
				or1(37.60,8);
				break;
			}
			case "1.10": {
				System.out.println(a10);
				or1(67.92,9);
				break;
			}
			case "2.1": {
				System.out.println(b1);
				or1(49.08,10);
				break;
			}
			case "2.2": {
				System.out.println(b2);or1(110.00,11);
				break;
			}
			case "2.3": {
				System.out.println(b3);or1(44.00,12);
				break;
			}
			case "2.4": {
				System.out.println(b4);or1(44.00,13);
				break;
			}
			case "2.5": {
				System.out.println(b5);or1(103.20,14);
				break;
			}
			case "2.6" : {
				System.out.println(b6);or1(11.20,15);
				break;
			}

			case "2.7": {
				System.out.println(b7);or1(87.33,16);
				break;
			}
			case "2.8": {
				System.out.println(b8);or1(450.5,17);
				break;
			}
			case "2.9": {
				System.out.println(b9);or1(54.5,18);
				break;
			}case "2.10": {
				System.out.println(b10);or1(54.54,19);
				break;
			}
			case "3.1": {
				System.out.println(c1);
				or1(52.00,20);
				break;
			}
			case "3.2": {
				System.out.println(c2);
				or1(40.00,21);
				break;
			}
			case "3.3": {
				System.out.println(c3);
				or1(75.20,22);
				break;
			}
			case "3.4": {
				System.out.println(c4);
				or1(24.00 ,23);
				break;
			}
			case "3.5": {
				System.out.println(c5);
				or1( 26.32,24);
				break;
			}
			case "3.6": {
				System.out.println(c6);
				or1(32.00 ,25);
				break;
			}

			case "3.7": {
				System.out.println(c7);
				or1(18.40 ,26);
				break;
			}
			case "3.8": {
				System.out.println(c8);
				or1(100.00,27);
				break;
			}

			case "3.9" : {
				System.out.println(c9);
				or1(111.32,28);
				break;
			}
			case "3.10": {
				System.out.println(c10);
				or1(49.28,29);
				break;
			}
			case "4.1": {
				System.out.println(a1);
				or1(65.46,30);
				break;
			}
			case "4.2": {
				System.out.println(a2);
				or1(14.46,31);
				break;
			}
			case "4.3": {
				System.out.println(a3);
				or1(51.20,32);
				break;
			}
			case "4.4": {
				System.out.println(a4);
				or1( 68.00,33);
				break;
			}
			case "4.5": {
				System.out.println(a5);
				or1( 55.18,34);
				break;
			}
			case "4.6": {
				System.out.println(a6);
				or1( 110.27,35);
				break;
			}

			case "4.7": {
				System.out.println(a7);
				or1( 30.44,36);
				break;
			}
			case "4.8": {
				System.out.println(a8);
				or1(56.65,37);
				break;
			}

			case "4.9" : {
				System.out.println(a9);
				or1(133.60,38);
				break;
			}
			case "4.10": {
				System.out.println(a10);
				or1(136.00,39);
				break;
			}
			case "5": {
				Home h = new Home();
				h.home();
				break;
				}
			default:
			{
				System.err.println("Please Enter valid Input.");
				rangeaAtoZ();
			}
				
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
		
		public void payment(double price)
		{
			
			Home.Price = Home.Price + price ;
			 System.out.println("Do you want order more");
             System.out.println("1.order from same menu");
             System.out.println("2.go back");
             System.out.println("3.Go back to Home " );
             System.out.println("4.procees bill");
             
             int a = s.nextInt();
             if(a == 1)
             {
            	 rangeaAtoZ();
             }
             else if(a == 2)
             {
            	 Medicines m = new Medicines();
            	 m.display();
             }
             else if(a == 3)
             {
            	 Home h = new Home();
 				h.home();
             }
             else if(a == 4)
             {
            	 
            	 if(h.Price != 0.0)
              	  {
            		 
              		  for(Object obj : list)
              		  {
              			  System.out.println(obj);
              		  }  
              	System.out.println("Your Order Price :"+h.Price);
              	System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
   			    System.out.println("------❤️❤️ Thank You 💖💖--------");
   			    System.out.println("(●'◡'●)   Vist Again.    (●'◡'●) ");
   			    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
              	System.exit(0);
              	  }
              	  else
              	  {
              		h.home();
              	  }
             
             
		}
	
		}
		
		public void or1(double p,int n)
		{
			System.out.println("Do You Want Order ");
			System.out.println("Press Y for Yes .");
			System.out.println("Press N for No .");
			
			Scanner sc = new Scanner(System.in);
			char opt1 = sc.next().charAt(0);
			
			if(opt1 == 'Y' || opt1 == 'y')
			{   
				list.add(a.get(n));
				payment(p);
				
			}
			else if(opt1 == 'N' || opt1 == 'n')
			{
				rangeaAtoZ();
			}
		}
		
		
		
	}
