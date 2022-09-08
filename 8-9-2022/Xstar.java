
/*  
Author:- Aditya Sharma
code:-Xstar
date:- 8-9-2022
*/

import java.util.Scanner;
class Xstar
{
	//using main method
public static void main(String[] args)
{
	//getting user input
int i, j,n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of n");
n = sc.nextInt();
// using for loop and nested loop condition 
for(i=5; i>=1; i--)
{
for(j=i; j<(n*2-1); j++)
{
System.out.print(" ");
}
for(j=1;j<=(n*2-1);j++)
{
if(j==1 || j==i)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println("");
}
for(i=2;i<=n;i++)
{
for(j=i; j<n;j++)
{
System.out.print(" ");
}
for(j=1;j<(n*2-1);j++)
{
if(j==1 || j==i )
System.out.print("*");
else
System.out.print(" ");

}
System.out.println("");
}
}
}

