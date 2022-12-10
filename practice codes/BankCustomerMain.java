package pack4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BankCustomerMain {

	public static void main(String[] args) {

		ArrayList<BankCustomer> cusDetail = new ArrayList<BankCustomer>();
		cusDetail.add(new BankCustomer(14575, "Aditya", 150000));
		cusDetail.add(new BankCustomer(16542, "Ayush", 456520));
		cusDetail.add(new BankCustomer(18745, "Anish", 780024));
		cusDetail.add(new BankCustomer(11564, "Aman", 547896));
		cusDetail.add(new BankCustomer(17867, "Arjun", 165874));
		
		  
		  System.out.println(cusDetail.get(3));
		  System.out.println(cusDetail.get(2).name);
		  System.out.println(cusDetail.get(1).acno);
		 
		for (BankCustomer cusList : cusDetail) {
			System.out.println(cusList);
		}

	}

}
