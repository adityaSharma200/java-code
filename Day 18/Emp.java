class Emp 
{
	int empid;
	String ename;
	double salary;
	
	Emp()
	{
		
	}

	Emp(int empid)
	{
		this.empid = empid ;
	}

	Emp(int empid,String ename)
	{
		this.empid = empid ;
		this.ename = ename ;
	}

	Emp(int empid,String ename,double salary)
	{
		this.empid = empid ;
		this.ename = ename ;
		this.salary = salary ;
	}


	public static void main(String[] args) 
	{
		Emp e = new Emp();
		Emp e1 = new Emp(10);
		Emp e2 = new Emp(20,"Sheela");
		Emp e3 = new Emp(30,"Shakila",29999.9);


        System.out.println("=============================");

		System.out.println("EMPID :-"  +e.empid);
		System.out.println("ENAME :-"  +e.ename);
		System.out.println("SALARY :- "  +e.salary);

	    System.out.println("=============================");
		
		System.out.println("EMPID :-"  +e1.empid);
		System.out.println("ENAME :-"  +e1.ename);
		System.out.println("SALARY :- "  +e1.salary);

		 System.out.println("=============================");

		System.out.println("EMPID :-"  +e2.empid);
		System.out.println("ENAME :-"  +e2.ename);
		System.out.println("SALARY :- "  +e2.salary);

		 System.out.println("=============================");

		System.out.println("EMPID :-"  +e3.empid);
		System.out.println("ENAME :-"  +e3.ename);
		System.out.println("SALARY :- "  +e3.salary);

		 System.out.println("=============================");
		
		


	}
}
