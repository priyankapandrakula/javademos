package Inheritance;

public class MultipleInheritance {

	public static void main(String[] args) {
		TV tv=new TV();
		tv.poweron();
		Monitor mon=new Monitor();
		mon.poweron();

	}

}
class Electronic{
	void  poweron()
	{
		System.out.println("device powered on");
	}
}
class TV extends Electronic{
	void  poweron()
	{
		System.out.println("TV guides on");
	}
}
class Monitor extends Electronic{
	void  poweron()
	{
		System.out.println("MONITOR guides on");
	}
}
//class Display extends TV,Monitor{
//	void  poweron()
//	{
//		System.out.println("MONITOR guides on");
//	}
//}
