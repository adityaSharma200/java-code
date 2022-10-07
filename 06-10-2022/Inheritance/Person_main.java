package corejava_basic.initial;

class Person_main
{
	public static void main(String[] args)
	{
		System.out.println("~~TCS Employee detail.~~");
	Employee emp = new Employee();
	emp.pid(5436);
	emp.pnam("Aditya");
	emp.salary(10000);
	
	
	System.out.println("~~Student detail.~~");
	Student sd1 = new Student();
	sd1.pid(678);
	sd1.pnam("Rohit");
	sd1.grade("A");
	}	
}