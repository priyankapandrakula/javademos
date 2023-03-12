package Inheritance;

public class MethodOverridingDemo {
	public static void main(String[]args)
	{
		Bike bike=new Bike();
		bike.fuel();
		
		Bus bus=new Bus();
		bus.fuel();
		
		
		
	}

}

//same method name and parameters
class Vehicle{
	Vehicle()//default constructor
	{
		
	}
	int a,b;
	Vehicle(int a,int b )
	{
		this.a=a;
		this.b=b;
	}
	void fuel()
	{
		System.out.println("petrol");
	}
	
}
class Bus extends Vehicle{
	int c,d;
	Bus(int a,int b,int c,int d)
	{
		super(a,b);
		this.c=c;
		this.d=d;
	}
	void fuel()
	{
		System.out.println("disesl");
	}
	
}
class Car extends Vehicle{
	
}
class Bike extends Vehicle{
	
}