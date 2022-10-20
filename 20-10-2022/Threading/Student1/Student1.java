package Pack3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Student1 {

	public static void main(String[] args) {
     
		
		List<String> Stddetal=new LinkedList<>();
		
		Stddetal.add("Aditya");
		Stddetal.add("Contact no:-1234567890");
		Stddetal.add("Rollno:-55");
		Stddetal.add("College name:KMA");
		Stddetal.add("living area:- Mumbai");
		
		 
		 Iterator it =Stddetal.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
