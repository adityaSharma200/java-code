package corejava_basic.initial;

public class Mobile_main {
	
	public static void main(String args[])
	{
		
		Mobile m1 = new Iphone(); //upcasting 
		m1.Start();
		m1.Run();
		m1.SwitchOf();
		m1.calling();
		m1.battery();
		m1.SMS();
		
		
	
	   if(m1 instanceof Iphone)
	   {
		   ((Iphone)m1).security();  //downcasting
		   ((Iphone)m1).Camera();
		   ((Iphone)m1).security();
		   ((Iphone)m1).facility();
	   
	   }
	
	
	   Mobile m2 = new Redmi(); //upcasting 
	   m2.Start();
		m2.Run();
		m2.SwitchOf();
		m2.calling();
		m2.battery();
		m2.SMS();
		
		
	
	   if(m2 instanceof Redmi)
	   {
		   ((Redmi)m2).security();  //downcasting
		   ((Redmi)m2).Camera();
		   ((Redmi)m2).security();
		   ((Redmi)m2).facility();
	   
	   }
	   
	   
	   Mobile m3 = new Realme(); //upcasting 
	    m3.Start();
		m3.Run();
		m3.SwitchOf();
		m3.calling();
		m3.battery();
		m3.SMS();
		
		
	
	   if(m3 instanceof Realme)
	   {
		   ((Realme)m3).security();  //downcasting
		   ((Realme)m3).Camera();
		   ((Realme)m3).security();
		   ((Realme)m3).facility();
	   
	
	
	  	}
	
	}
}
	


