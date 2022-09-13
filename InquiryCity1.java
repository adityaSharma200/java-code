/* 
author: Aditya Sharma
Date: 13-09-2022
*/



import java.util.Scanner;
class InquiryCity1

{
int pin;
String ps;
String city;

// using non static method
 void Data(int a)
{
System.out.print(a);
}

void Data(int a, String s)
{
System.out.print(a);
System.out.print(s);
}

void Data(int a, String s, String v)
{
System.out.print(a);
System.out.print(s);
System.out.print(v);
}
// calling main methods
public static void main(String [] args)

{	
	Scanner ac = new Scanner(System.in);
	//Getting user input 
	System.out.println("Enter your pin data:");
	int a = ac.nextInt();
	InquiryCity1 x = new InquiryCity1();
	// using switch case methods
	switch(a)
	{
	case 1:
	x.Data(421306);
	System.out.println();
	break;
	case 2:
	x.Data(421306,"kolsawadi police station(E)");
	System.out.println();
	break;
	case 3:
	x.Data(421306,"kolsawadi police station(E)","kalyan(E)");
	System.out.println();
	break;
	default:
	System.out.println("Wrong input data");
	}		
}
}