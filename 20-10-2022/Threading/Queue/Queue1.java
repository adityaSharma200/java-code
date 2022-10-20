package Pack3;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args)
	{
		
	
	
	Queue <String> q1=new LinkedList<>();
	q1.add("Aditya");
	q1.add("Ayush");
	q1.add("Raju");
	q1.add("Devil");
	q1.peek();
	q1.remove("Raju");
	q1.poll();
	
	System.out.println("Element of Queue"+q1);
	System.out.println("Peek of Queue" +q1.peek());
	System.out.println("Remove of Raju"+q1.remove("Ayush"));
	System.out.println("Poll of "+q1.poll());
	}
	

}
