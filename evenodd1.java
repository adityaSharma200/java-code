import java.util.Scanner;

public class evenodd1{
public static void main(String[] args)
{
Scanner rd = new Scanner(System.in);
System.out.println("Enter a number:");
int num = rd.nextInt();

if(num % 2 == 0)
System.out.println(num+"is even");
else
System.out.println(num+"is odd");


}

}