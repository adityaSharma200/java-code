class Car
{
public static void main(String args[])
{
	Car obj1 = new Car("mahindra suv");
	Car obj2 = new Car("mahindra suv" ,"Red ");
	Car obj3 = new Car("mahindra suv", "Red " ,5412);
	
	obj1.displayDataCar();
	obj2.displayDataCar();
	obj3.displayDataCar();
}
String carname;
String colourofcar;
int modelnumber;

static String role="Buyer";
 
Car(String a)
{
carname=a;
}

Car(String a, String b)
{
carname=a;
colourofcar= b ;
}
Car(String a, String b,int c)
{
carname=a;
colourofcar= b ;
modelnumber= c;

}

void displayDataCar()
{
System.out.println(carname+" "+colourofcar+" "+ modelnumber+" ");
}
}
