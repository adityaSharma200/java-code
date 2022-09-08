import java.util.Scanner;
class CPN
{
public static void main (String[] args)
{
// int a = 0;

Scanner in= new Scanner(System.in);

System.out.println(" Enter any number to check + or - ");

int a = in.nextInt();

if(a<0)
{
System.out.println("Negative number");

}
else if(a>0)
{
System.out.println("Positive number");
}
else
{
System.out.println("Zero");

}


}



}