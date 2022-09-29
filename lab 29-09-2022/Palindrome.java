package corejava_basic.initial;
import java.util.Scanner;
public class Palindrome {

	//using main method
		public static void main(String[] args) 
	{
			Scanner ac =new Scanner(System.in);
			
			System.out.println("Enter a String value: ");
			String s = ac.nextLine();
			String rev = "";
			for (int i=s.length()-1;i>=0;i--) 
			
		       rev=rev+s.charAt(i);
			//using control statement
			if(s.equals(rev)) 
				System.out.println(s+" String is palindrome");
			
				
			else 
			
				System.out.println(s+" String is not palindrome");
			//close the scanner
			ac.close();
			}
	}


	
	
