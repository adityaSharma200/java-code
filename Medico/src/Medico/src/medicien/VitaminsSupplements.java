package medicien;

import java.util.ArrayList;
import java.util.Scanner;

public class VitaminsSupplements extends Home{
	int nu;
	String Companyname;
	String Brandname;
	int pack;
	double price;
	Home h = new Home();
	
	Scanner s = new Scanner(System.in);
	
	VitaminsSupplements()
	{
		
	}
	VitaminsSupplements(int nu,String Brandname,String Companyname,int pack,double price)
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
	static 
	{
		System.out.println("<--------------------------->");
		System.out.println("  ❤ Vitamins & Supplements ❤  ");
		System.out.println("<--------------------------->");
	}
	
	
	
	public void display()
	{
		System.out.println("_____________________________");
		System.out.println("Chosse any One Option .");
		System.out.println("_____________________________");
		System.out.println("1. Multivitamins, Multiminerals and Antioxidants");
		System.out.println("2. Calcium & Minerals");
		System.out.println("3. Vitamin A to Z");
		System.out.println("4. Protein Supplements");
		System.out.println("5. Go Back To Home Page");
		System.out.println("<--------------------------->");
	

		int n = s.nextInt();

		switch (n) {
		case 1: {
			
			mmA();
			break;
		}
		case 2: {
			
			cm();
			break;
		}
		case 3: {
			vAtoZ();
			break;
		}
		case 4 :
		{
			pS();
			break;
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
		
		
//		
//		System.out.println(v1);
	}
	
	
	private void pS() {
		ArrayList mma = new ArrayList();
		mma.add("1. Prohance Hp Vanilla Powder 400 GM ");
		mma.add("2. Ensure Vanilla Flavour Refill Powder 1 Kg ");
		mma.add("3. Threptin Biscuit 275 GM ");
		mma.add("4. Pentasure 2.0 Vanilla High Protein Powder 1000 GM");
		mma.add("5. Medislim Vanilla Flavour Powder 500 GM");
		mma.add("6. Fresubin Hp Vanilla Powder 400 GM");
		mma.add("7. Lamino Gi Plus Vanilla Flavour Powder 200 GM");
		mma.add("8. D Protin Chocolate Powder 500 GM ");
		mma.add("9. B Protin Chocolate Powder 500 GM");
		mma.add("10.Prohance Mom Chocolate Powder 400 GM ");
		
		VitaminsSupplements mma1= new VitaminsSupplements(1,"Prohance Hp Vanilla Powder 400 GM","Sun Pharma Laboratories Ltd.",400 , 875.60);
		VitaminsSupplements mma2= new VitaminsSupplements(2,"Ensure Vanilla Flavour Refill Powder 1 Kg","Abbott India Ltd",1,1550.20);
		VitaminsSupplements mma3= new VitaminsSupplements(3,"Threptin Biscuit 275 GM","Raptakos Brett & Co. Ltd.", 275,436.50);
		VitaminsSupplements mma4= new VitaminsSupplements(4,"Pentasure 2.0 Vanilla High Protein Powder 1000 GM","Hexagon Nutrition Pvt. Ltd",1000,3157.19);
		VitaminsSupplements mma5= new VitaminsSupplements(5,"Medislim Vanilla Flavour Powder 500 GM","British Biological",500,553.50);
		VitaminsSupplements mma6= new VitaminsSupplements(6,"Fresubin Hp Vanilla Powder 400 GM","Fresenius Kabi India Pvt Ltd",400,820.00);
		VitaminsSupplements mma7= new VitaminsSupplements(7,"Lamino Gi Plus Vanilla Flavour Powder 200 GM","La Renon",200,712.00);
		VitaminsSupplements mma8= new VitaminsSupplements(8,"D Protin Chocolate Powder 500 GM","British Biological",500,535.50);
		VitaminsSupplements mma9= new VitaminsSupplements(9,"B Protin Chocolate Powder 500 GM","British Biological",500,517.50);
		VitaminsSupplements mma10= new VitaminsSupplements(10,"Prohance Mom Chocolate Powder 400 GM","Sun Pharma Laboratories Ltd.",400,549.00);
		
		System.out.println("*******************************************************");
		System.out.println(" Multivitamins, Multiminerals and Antioxidants ");
		System.out.println("*******************************************************");
		System.out.println(mma.get(0));
		System.out.println(mma.get(1));
		System.out.println(mma.get(2));
		System.out.println(mma.get(3));
		System.out.println(mma.get(4));
		System.out.println(mma.get(5));
		System.out.println(mma.get(6));
		System.out.println(mma.get(7));
		System.out.println(mma.get(8));
		System.out.println(mma.get(9));
		System.out.println("Press any  to Go Back");
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 2: {
			System.out.println(mma2);
			break;
		}
		case 3: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 4: {
			System.out.println(mma2);
			break;
		}
		case 5: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 6: {
			System.out.println(mma2);
			break;
		}
		case 7: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 8: {
			System.out.println(mma2);
			break;
		}
		case 9: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 10: {
			System.out.println(mma2);
			break;
		}
		default:
		{
			
		}
			
		}
		
	}
	private void vAtoZ() {
		ArrayList mma = new ArrayList();
		mma.add("1. Prohance Hp Vanilla Powder 400 GM ");
		mma.add("2. Ensure Vanilla Flavour Refill Powder 1 Kg ");
		mma.add("3. Threptin Biscuit 275 GM ");
		mma.add("4. Pentasure 2.0 Vanilla High Protein Powder 1000 GM");
		mma.add("5. Medislim Vanilla Flavour Powder 500 GM");
		mma.add("6. Fresubin Hp Vanilla Powder 400 GM");
		mma.add("7. Lamino Gi Plus Vanilla Flavour Powder 200 GM");
		mma.add("8. D Protin Chocolate Powder 500 GM ");
		mma.add("9. B Protin Chocolate Powder 500 GM");
		mma.add("10.Prohance Mom Chocolate Powder 400 GM ");
		
		VitaminsSupplements mma1= new VitaminsSupplements(1,"Prohance Hp Vanilla Powder 400 GM","Sun Pharma Laboratories Ltd.",400 , 875.60);
		VitaminsSupplements mma2= new VitaminsSupplements(2,"Ensure Vanilla Flavour Refill Powder 1 Kg","Abbott India Ltd",1,1550.20);
		VitaminsSupplements mma3= new VitaminsSupplements(3,"Threptin Biscuit 275 GM","Raptakos Brett & Co. Ltd.", 275,436.50);
		VitaminsSupplements mma4= new VitaminsSupplements(4,"Pentasure 2.0 Vanilla High Protein Powder 1000 GM","Hexagon Nutrition Pvt. Ltd",1000,3157.19);
		VitaminsSupplements mma5= new VitaminsSupplements(5,"Medislim Vanilla Flavour Powder 500 GM","British Biological",500,553.50);
		VitaminsSupplements mma6= new VitaminsSupplements(6,"Fresubin Hp Vanilla Powder 400 GM","Fresenius Kabi India Pvt Ltd",400,820.00);
		VitaminsSupplements mma7= new VitaminsSupplements(7,"Lamino Gi Plus Vanilla Flavour Powder 200 GM","La Renon",200,712.00);
		VitaminsSupplements mma8= new VitaminsSupplements(8,"D Protin Chocolate Powder 500 GM","British Biological",500,535.50);
		VitaminsSupplements mma9= new VitaminsSupplements(9,"B Protin Chocolate Powder 500 GM","British Biological",500,517.50);
		VitaminsSupplements mma10= new VitaminsSupplements(10,"Prohance Mom Chocolate Powder 400 GM","Sun Pharma Laboratories Ltd.",400,549.00);
		
		System.out.println("*******************************************************");
		System.out.println(" Multivitamins, Multiminerals and Antioxidants ");
		System.out.println("*******************************************************");
		System.out.println(mma.get(0));
		System.out.println(mma.get(1));
		System.out.println(mma.get(2));
		System.out.println(mma.get(3));
		System.out.println(mma.get(4));
		System.out.println(mma.get(5));
		System.out.println(mma.get(6));
		System.out.println(mma.get(7));
		System.out.println(mma.get(8));
		System.out.println(mma.get(9));
		
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 2: {
			System.out.println(mma2);
			break;
		}
		case 3: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 4: {
			System.out.println(mma2);
			break;
		}
		case 5: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 6: {
			System.out.println(mma2);
			break;
		}
		case 7: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 8: {
			System.out.println(mma2);
			break;
		}
		case 9: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 10: {
			System.out.println(mma2);
			break;
		}
		default:
		{
			
		}
			
		}
		
	}
	private void cm() {
		ArrayList mma = new ArrayList();
		mma.add("1. Prohance Hp Vanilla Powder 400 GM ");
		mma.add("2. Ensure Vanilla Flavour Refill Powder 1 Kg ");
		mma.add("3. Threptin Biscuit 275 GM ");
		mma.add("4. Pentasure 2.0 Vanilla High Protein Powder 1000 GM");
		mma.add("5. Medislim Vanilla Flavour Powder 500 GM");
		mma.add("6. Fresubin Hp Vanilla Powder 400 GM");
		mma.add("7. Lamino Gi Plus Vanilla Flavour Powder 200 GM");
		mma.add("8. D Protin Chocolate Powder 500 GM ");
		mma.add("9. B Protin Chocolate Powder 500 GM");
		mma.add("10.Prohance Mom Chocolate Powder 400 GM ");
		
		VitaminsSupplements mma1= new VitaminsSupplements(1,"Prohance Hp Vanilla Powder 400 GM","Sun Pharma Laboratories Ltd.",400 , 875.60);
		VitaminsSupplements mma2= new VitaminsSupplements(2,"Ensure Vanilla Flavour Refill Powder 1 Kg","Abbott India Ltd",1,1550.20);
		VitaminsSupplements mma3= new VitaminsSupplements(3,"Threptin Biscuit 275 GM","Raptakos Brett & Co. Ltd.", 275,436.50);
		VitaminsSupplements mma4= new VitaminsSupplements(4,"Pentasure 2.0 Vanilla High Protein Powder 1000 GM","Hexagon Nutrition Pvt. Ltd",1000,3157.19);
		VitaminsSupplements mma5= new VitaminsSupplements(5,"Medislim Vanilla Flavour Powder 500 GM","British Biological",500,553.50);
		VitaminsSupplements mma6= new VitaminsSupplements(6,"Fresubin Hp Vanilla Powder 400 GM","Fresenius Kabi India Pvt Ltd",400,820.00);
		VitaminsSupplements mma7= new VitaminsSupplements(7,"Lamino Gi Plus Vanilla Flavour Powder 200 GM","La Renon",200,712.00);
		VitaminsSupplements mma8= new VitaminsSupplements(8,"D Protin Chocolate Powder 500 GM","British Biological",500,535.50);
		VitaminsSupplements mma9= new VitaminsSupplements(9,"B Protin Chocolate Powder 500 GM","British Biological",500,517.50);
		VitaminsSupplements mma10= new VitaminsSupplements(10,"Prohance Mom Chocolate Powder 400 GM","Sun Pharma Laboratories Ltd.",400,549.00);
		
		System.out.println("*******************************************************");
		System.out.println(" Multivitamins, Multiminerals and Antioxidants ");
		System.out.println("*******************************************************");
		System.out.println(mma.get(0));
		System.out.println(mma.get(1));
		System.out.println(mma.get(2));
		System.out.println(mma.get(3));
		System.out.println(mma.get(4));
		System.out.println(mma.get(5));
		System.out.println(mma.get(6));
		System.out.println(mma.get(7));
		System.out.println(mma.get(8));
		System.out.println(mma.get(9));
		
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 2: {
			System.out.println(mma2);
			break;
		}
		case 3: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 4: {
			System.out.println(mma2);
			break;
		}
		case 5: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 6: {
			System.out.println(mma2);
			break;
		}
		case 7: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 8: {
			System.out.println(mma2);
			break;
		}
		case 9: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 10: {
			System.out.println(mma2);
			break;
		}
		default:
		{
			
		}
			
		}
		
	}
	public void mmA()
	{
		ArrayList mma = new ArrayList();
		mma.add("1. Prohance Hp Vanilla Powder 400 GM ");
		mma.add("2. Ensure Vanilla Flavour Refill Powder 1 Kg ");
		mma.add("3. Threptin Biscuit 275 GM ");
		mma.add("4. Pentasure 2.0 Vanilla High Protein Powder 1000 GM");
		mma.add("5. Medislim Vanilla Flavour Powder 500 GM");
		mma.add("6. Fresubin Hp Vanilla Powder 400 GM");
		mma.add("7. Lamino Gi Plus Vanilla Flavour Powder 200 GM");
		mma.add("8. D Protin Chocolate Powder 500 GM ");
		mma.add("9. B Protin Chocolate Powder 500 GM");
		mma.add("10.Prohance Mom Chocolate Powder 400 GM ");
		
		VitaminsSupplements mma1= new VitaminsSupplements(1,"Prohance Hp Vanilla Powder 400 GM","Sun Pharma Laboratories Ltd.",400 , 875.60);
		VitaminsSupplements mma2= new VitaminsSupplements(2,"Ensure Vanilla Flavour Refill Powder 1 Kg","Abbott India Ltd",1,1550.20);
		VitaminsSupplements mma3= new VitaminsSupplements(3,"Threptin Biscuit 275 GM","Raptakos Brett & Co. Ltd.", 275,436.50);
		VitaminsSupplements mma4= new VitaminsSupplements(4,"Pentasure 2.0 Vanilla High Protein Powder 1000 GM","Hexagon Nutrition Pvt. Ltd",1000,3157.19);
		VitaminsSupplements mma5= new VitaminsSupplements(5,"Medislim Vanilla Flavour Powder 500 GM","British Biological",500,553.50);
		VitaminsSupplements mma6= new VitaminsSupplements(6,"Fresubin Hp Vanilla Powder 400 GM","Fresenius Kabi India Pvt Ltd",400,820.00);
		VitaminsSupplements mma7= new VitaminsSupplements(7,"Lamino Gi Plus Vanilla Flavour Powder 200 GM","La Renon",200,712.00);
		VitaminsSupplements mma8= new VitaminsSupplements(8,"D Protin Chocolate Powder 500 GM","British Biological",500,535.50);
		VitaminsSupplements mma9= new VitaminsSupplements(9,"B Protin Chocolate Powder 500 GM","British Biological",500,517.50);
		VitaminsSupplements mma10= new VitaminsSupplements(10,"Prohance Mom Chocolate Powder 400 GM","Sun Pharma Laboratories Ltd.",400,549.00);
		
		System.out.println("*******************************************************");
		System.out.println(" Multivitamins, Multiminerals and Antioxidants ");
		System.out.println("*******************************************************");
		System.out.println(mma.get(0));
		System.out.println(mma.get(1));
		System.out.println(mma.get(2));
		System.out.println(mma.get(3));
		System.out.println(mma.get(4));
		System.out.println(mma.get(5));
		System.out.println(mma.get(6));
		System.out.println(mma.get(7));
		System.out.println(mma.get(8));
		System.out.println(mma.get(9));
		
		int opt = s.nextInt();
		
		
		
		switch (opt) {
		case 1: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 2: {
			System.out.println(mma2);
			break;
		}
		case 3: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 4: {
			System.out.println(mma2);
			break;
		}
		case 5: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 6: {
			System.out.println(mma2);
			break;
		}
		case 7: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 8: {
			System.out.println(mma2);
			break;
		}
		case 9: {
			System.out.println(mma1);
			System.out.println("Do you want Order ");
			System.out.println("Confirm Your Order press Y/N");
			order(875.60);
			break;
		}
		case 10: {
			System.out.println(mma2);
			break;
		}
		default:
		{
			
		}
			
		}
		
		
		
		
		
	}
	
	 public void order(double price) {
		 Scanner sc = new Scanner(System.in);

			char option = sc.next().charAt(0);

			if (option == 'Y' || option == 'y') {
			

				h.Price = h.Price + price;
				purchaseagain(1);
				
			} else {
				System.err.println("Enter a valid input .");
				display();
			}
		}
	
	public void purchaseagain(int a)
	{   Scanner sc = new Scanner(System.in);

		System.out.println("Do you want Order more");
		System.out.println("1.Order from same Menu");
		System.out.println("2.go back");
		System.out.println("3.change Medicien Menu");
		System.out.println("4.procees bill");

		int opt = sc.nextInt();

		switch (opt) {
		case 1: {
			
			
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
	}
	
}
