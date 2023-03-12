package varialesPac;

public class Demo3 {
	public Demo3()
	{
		System.out.println("from constructor");
	}
	static
	{
		System.out.println("static1");
	}

	
	{
	System.out.println("from non static method");
	}

	public static void main(String[] args) {
		System.out.println("from static method");
		Demo3 dd=new Demo3();
		Demo3 d=new Demo3();
		Car c=new Car();
		System.out.println(c.noofWheels);
		System.out.println(Car.manufacturer);
	}
	
}
