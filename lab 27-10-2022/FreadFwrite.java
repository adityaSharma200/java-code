package Pack3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FreadFwrite {
	
	public static void main (String[] args) throws IOException
	{
		
		FileWriter f1= new FileWriter("c:readwrite.txt");
		f1.write("Welcome to the java code-");
		f1.close();

		
		FileReader r1 = new FileReader("c:readwrite.txt");
		int data= r1.read();
		
		while(data!= -1)
		{
			System.out.print((char)data);
			data= r1.read();
		}
		r1.close();
		}
	
}
