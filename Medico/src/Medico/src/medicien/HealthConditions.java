package medicien;

import java.util.Scanner;

public class HealthConditions extends Home{
	
	Scanner s = new Scanner(System.in);
	Home h = new Home();
	public void display()
	{
		
		

		System.out.println("Chosse any One Option .");
		System.out.println("1. Bone and Joint Care");
		System.out.println("2. Pain Relief");
		System.out.println("3. Liver Care");
		System.out.println("4. Stomach Care");
		System.out.println("5. Go Back To Home Page");
	

		int n = s.nextInt();

		switch (n) {
		case 1: {
			
			bandJ();
			break;
		}
		case 2: {
			
			painRelif();
			break;
		}
		case 3: {
			liverCare();
			break;
		}
		case 4 :
		{
			stomachCare();
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
		
		
}

	public void stomachCare() {
		
		
	}

	private void liverCare() {
		
		
	}

	private void painRelif() {
		
		
	}

	public void bandJ() {
		
		System.out.println("Chosse any One Option .");
		System.out.println("1. ");
		System.out.println("2. ");
		System.out.println("3. ");
		System.out.println("4. ");
		System.out.println("5. Go Back To Home Page");
		int n = s.nextInt();

		switch (n) {
		case 1: {
			
			bandJ();
			break;
		}
		case 2: {
			
			painRelif();
			break;
		}
		case 3: {
			liverCare();
			break;
		}
		case 4 :
		{
			stomachCare();
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
		
	}
}