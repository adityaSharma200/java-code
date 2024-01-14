package medicien;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {

	private String name ;
	private String emailId ;
	private String password ;
	private String adddress; 
	private long mobileno ; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	
	
	
	
	public void setEmailId() {
		
		Scanner sc = new Scanner(System.in);
		
		String ep = "@gmail.com";
		Pattern p1 = Pattern.compile(ep);
		
		 this.emailId = sc.nextLine();
		Matcher m1 = p1.matcher(emailId);
		
		boolean mf = m1.find();
		
		if(mf)
		{
			System.out.println("Enter Your mobile Number :");
			setMobileno();
		}
		else
		{
			System.out.println("Enter a valid eamilid...");
			setEmailId();
		}
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdddress() {
		return adddress;
	}
	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}
	
	public long getMobileno() {
		return mobileno;
	}
	
	public void setMobileno() {
		
		Scanner sc = new Scanner(System.in);
		
		long mobileno = sc.nextLong();
		
		if(mobileno > 999999999 && mobileno < 10000000000l )
		{
			this.mobileno = mobileno ;
		}
		else
		{
			System.out.println("Enter a valid number ..");
			setMobileno();
		}
		
	}
	
	
	
	
	public void SingUp()
	{
		System.out.println("================================");
		System.out.println("--------    SignUp   -----------");
		System.out.println("================================");
		
	Scanner s = new Scanner(System.in);	
	
	System.out.println("Enter Your name :");
	String name = s.nextLine();
	setName(name);
	
	System.out.println("Enter your Address :");
	String add = s.nextLine();
	setAdddress(add);
	
	 System.out.println("Enter Your emailId :"); 
	 setEmailId();
	 
	
	System.out.println("Enter Your Password :");
	String password = s.nextLine();
	setPassword(password);
	
	System.out.println("Account created successfully...");
	System.out.println("================================");
	System.out.println("--------    SignIn   -----------");
	System.out.println("================================");
	 SigIn();
	}
	
	
	
	//create singIn method
	
	public void SigIn()
	{ 
		if(mobileno != 0)
		{
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose option singIn whether EmailId or Mobile number :");
		System.out.println("1.For EmailId.");
		System.out.println("2.For Mobile Number.");
		int number = sc.nextInt();
		
		switch(number)
		{
		case 1 :
		{
			emailvalid();
			break;
		}
		case 2 :
		{
			
			mobileValid();
			break ;
		}
		default :
		{
			System.out.println("Enter valid Option.");
			SigIn();
		}
		
		}
		}
		else
		{
			SingUp();
		}
	}
	
		
	
	
	
	
	
	
	public  void emailvalid() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your EmailId :");
		String email = sc.nextLine();
		
		System.out.println("Enter your Password :");
		String password1 = sc.nextLine();
	
		
	  if( emailId.equals(email) && password.equals(password1))
	  {
		System.out.println("Your are  successful Login.");
		Home m = new Home();
		m.home();
	   }
	else
	   {
		System.out.println("Please enter valid emailId and Password");
		emailvalid();
	   }
		
	}
	
	
	     public  void mobileValid()
	     {
		
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Mobile Number :");
		long mobilenum = sc.nextLong();
		
		System.out.println("Enter your Password :");
		String password1 = sc.next();
		//password1 = sc.nextLine();
		
		
		if( mobileno == mobilenum  && password.equals(password1))
		{
			System.out.println("Your are  successful Login.");
			Home m = new Home();
			m.home();
			
		}
		
		else
		{
			System.out.println("Please enter valid Mobile Number and Password .");
			//mobileValid();	
		}
			
		}
	     
	     
	     public void entry()
	     {
	    	 try {
	    	 Scanner sc = new Scanner(System.in);
	    	 System.out.println("Please Login first .");
	    	 System.out.println("select any one option for Login .");
	    	 System.out.println("1.SingUp");
	    	 System.out.println("2.SingIn");
	    	 int option = sc.nextInt();
	    	 
	    	 switch(option)
	    	 {
	    	 case 1 :
	    	 {
	    		 SingUp();
	    		 break;
	    	 }
	    	 case 2 :
	    	 {
	    		 SigIn();
	    		 break;
	    	 }
	    	 default :
	    	 {
	    		 System.out.println("Please Enter valid input ");
	    		 entry();
	    	 }
	    	 }
	    	 
	    	 }
	    	 catch(Exception e)
	    	 {
	    		 System.err.println("Please use only valid Input.");
	    		 entry();
	    	 }
	    	 
	     }
		
	}
	

