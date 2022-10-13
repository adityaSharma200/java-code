package Pack2;

public class Buffer_builder {
	public static void main (String args[])
	{
		StringBuffer sb1= new StringBuffer("Aditya");
		StringBuilder sb2= new StringBuilder("hello");
		
		System.out.println(sb1);
		sb1.insert(5, "Sharma");
		sb2.append("Aditya Sharma");
		System.out.println(sb2);
		System.out.println(sb1.toString().equals(sb2.toString()));
		sb1.delete(2, 4).reverse();
		System.out.println(sb1);
		
	}

}
