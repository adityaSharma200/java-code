package Pack3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter {
	public static void main(String[] args) throws IOException
	{
		FileOutputStream out = new FileOutputStream("c:.Txt");
		PrintWriter p1 = new PrintWriter(out);
		p1.println("Emp name:- Aditya");
		p1.println("Emp id:- 24");
		p1.println("Emp sal:- 10000");
		
		p1.close();
		System.out.println("Success");
		
		
	}
	
	
	
	
	
	
	

}
