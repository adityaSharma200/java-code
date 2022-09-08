/*  
Author:- Aditya Sharma
code:-CheckNumberPrimeorNot
date:- 8-9-2022
*/


import java.util.Scanner;
class CheckNumberPrimeorNot
{
	//using main method
public static void main(String[] args)
{
int a, i, count=0;

Scanner sc = new Scanner(System.in);
//Getting number from user
System.out.print("Enter the number:");
a = sc.nextInt();
//using conditional loop
for(i=2; i<=a; i++)
{
if(a%i == 0)
{
count++;
break;
}
}
if(count == 0)
System.out.println("It is prime Number.");
else
System.out.println(" It is not a prime number.");
}


}