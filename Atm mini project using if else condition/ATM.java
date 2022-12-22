package airline;

import java.util.Scanner;

public class ATM {
int Balance;
int pin=5432;

public void checkpin()
{
	System.out.println("Enter the Pin:");
	Scanner sc=new Scanner(System.in);
	int atmpin =sc.nextInt();
	
	if(atmpin == pin)
	{
		mainmenu();
	}
	else
	{
		System.out.println("Enter correct pin!");
		checkpin();
	}
}
	
	public void mainmenu()
	{
		System.out.println("Choice the option for the Operation:");
		System.out.println("1.check balance");
		System.out.println("2.Deposite amount");
		System.out.println("3.Withdrawl amount");
		System.out.println("4.Exit");
		
		Scanner sc1= new Scanner(System.in);
		int opt=sc1.nextInt();
		
		if(opt == 1)
		{
			CheckBal();
		}
		else if(opt == 2)
		{
			Depos();
		}
		else if(opt == 3)
		{
			withdr();
		}
		else if(opt == 4)
		{
			return;
		}
		else
		{
			System.out.println("Invalid option choose");
		}
		
	}
	
	public void CheckBal()
	{
		System.out.println("Your balance:-"+"  "+Balance);
		mainmenu();
	}
    public void	Depos()
    {
    	System.out.println("Enter Deposit Amount:- ");
    	Scanner sc2 =new Scanner(System.in);
    	int amount =sc2.nextInt();
    	Balance= Balance+amount;
    	System.out.println("Your Deposit is successfully.");
    	mainmenu();
    	
    	
    }
	
    public void withdr()
    {
    	System.out.println("Enter Amount for withdrwal:");
    	Scanner sc3 = new Scanner(System.in);
    	int withdra=sc3.nextInt();
    	
    	if(Balance > withdra)
    	{
    		Balance=Balance-withdra;
    		System.out.println("Withdrawl Successfully");
    		
    	}
    	else if(Balance < withdra)
    	{
    		System.out.println("Insufficient Balance!");
    	}
    	mainmenu();
    }
	

}
