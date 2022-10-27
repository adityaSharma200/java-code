package Pack3;

import java.io.Console;

public class Passwd {
public static void main(String[] args)
{
	Console c= System.console();
	System.out.println("Enter the valid password:");
	char[] ch=c.readPassword();
	String pass=String.valueOf(ch);
	System.out.println("Password is:"+pass);
	
}
	
	
}
