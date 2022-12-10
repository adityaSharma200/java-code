package pack4;

import java.util.HashSet;
import java.util.Scanner;

public class hashset {

	public static void main(String[] args) {
		
		
		Scanner sc1 =new Scanner(System.in);
		
		
		
		HashSet<BankCustomer> set= new HashSet<BankCustomer>();
		set.add(new BankCustomer(45775,"raju",124536));
		set.add(new BankCustomer(46587,"rohit",145785));
		set.add(new BankCustomer(46987,"preet",654123));
		set.add(new BankCustomer(46541,"soham",658745));
		set.add(new BankCustomer(48745,"sohil",325466));
		
		System.out.println("Enter account no to check detail of customer:-");
		 int acno = sc1.nextInt();
		
		
		
		
		for(BankCustomer data:set )
		{
			if(data.acno == acno)
			{
				System.out.println("Customer acno:"+" "+data.acno+"\n"+"Customer name:"+" "+data.name+"\n"+"Customer Current amount:"+data.amt);
			}
			
		}
	
	}

}
