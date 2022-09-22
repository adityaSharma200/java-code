/*
Author:Aditya Sharma
date:22-09-2022
*/


package corejava_basic.initial;

public class Population {
	// using main method
	public static void main(String args[])
	{
		int initial = 175000;//initial population rate 
		int finial= 262500;// final population rate
		int time=10;//time of increase rate of population
		float Pop = initial-finial;
		
		float AnnualGrowth = Pop/initial*100;
		float GA = AnnualGrowth/time;
		
		System.out.println("The Population rate is"+GA+"%per year");
		
		
		
		
		
		
	}
	
	
	
	

}
