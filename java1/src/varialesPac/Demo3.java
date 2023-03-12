package varialesPac;

public class Demo3 {
	public Demo3()
	{
		System.out.println("from constructor");
	}
	{
	System.out.println("from non static method");
	}

	public static void main(String[] args) {
		System.out.println("from static method");
		Demo3 dd=new Demo3();
		
		

	}

}
