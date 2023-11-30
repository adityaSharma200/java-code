class  Car
{
	String brand;
	String price;

	Car(String brand , String price)
	{
		this.brand = brand ;
		this.price = price ;

		System.out.println("Car Brand :-" +brand);
        System.out.println("Car Price :-" +price);
		
	}
	public static void main(String[] args) 
	{
		Car c1 = new Car("AUDI","2.3Cr");
		Car c2 = new Car("ROLLS ROYCE","7.5Cr");

		

	}
}
