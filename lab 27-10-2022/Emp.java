package Pack3;

import java.io.FileWriter;

public class Emp {
	
	public static void main(String[] args) 
	{
		try {
			int eid=24;
			String ename="Aditya";
			int sal=12000;
			FileWriter f1 = new FileWriter("c:Empinfo.txt");
			f1.write("Emp id:-"+eid+"Emp name:-"+ename+"Salary:-"+sal);
			f1.close();
		}catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	
	

}
