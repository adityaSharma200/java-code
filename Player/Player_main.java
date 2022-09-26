package corejava_basic.initial;

public class Player_main {
	public static void main(String args[]) {
		
	
	
	
	Player p1= new Player();
	p1.stadium();
	p1. fees();
	p1.jersey();
	
	
	p1=new Cricketer();//upcasting
	p1.fees();
	//p1.trainer();
	
	if(p1 instanceof Cricketer)
	{
		((Cricketer) p1).jersey(); //downcasting
		((Cricketer) p1).trainer();
	}
	
	
	p1=new  Footballer();//upcasting
	p1.fees();
	
	 p1 = new Footballer();
	 {
		 ((Footballer) p1).jersey(); //downcasting
		 ((Footballer) p1).trainer();
	 }
	 
	
	
	
	
	
	
	
	
	}
	
	

}
