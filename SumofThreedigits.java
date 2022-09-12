/*
author: Aditya
Date:- 12-09-2022
*/



class SumofThreedigits
{
	//using main method
public static void main(String [] args)
{
int n = 495;

int sum = 0;
// using while loop
while(n>0)
{
int temp = n%10;
sum = sum+temp;

n=n/10;

}
System.out.println(sum);


}




}