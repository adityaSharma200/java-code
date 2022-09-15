/*
Author: Aditya sharma
Date:15-09-2022
*/

import java.util.*;
class CheckPrimeNoBetween2number
{
	//using main method
public static void main(String args[])
{
	int n1,n2,i,j;
	
	//taking user input
Scanner ac = new Scanner(System.in);

System.out.println("Enter the first number:");
 n1 = ac.nextInt();

System.out.println("Enter the Second number:");
 n2 = ac.nextInt();

// using nested for loop 
for( i=n1; i<n2; i++)
{
for( j=2; j<=i; j++)
{
if(i%j==0)
break;
}
if( i==j)
{
System.out.println(j);
}

}


}

}