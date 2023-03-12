package Inheritance;

public class constructorChainingDemo {

	public static void main(String[] args) {
		ChildClass cl=new ChildClass();
		//ChildClass cl=new ChildClass(10);
		
	}

}
class SuperClass
{
	int x;
	SuperClass()
	{
		System.out.println("No args superclass constructor");
	}
	SuperClass(int x,int yy)
	{
		System.out.println("one arg superclass constructor");
	}
	
}
//ONE CONSTRUCTOR CALLING OTHER  CONSTRCTURO 

class ChildClass extends SuperClass{
	/*ChildClass()
	{
		System.out.println("No arg child class constructor");
	}*/
	ChildClass()
	{
		this(10,45);
		System.out.println("No arg child class constructor");
		
	}
	ChildClass(int y,int z)
	{
		super(y,z);
		System.out.println("one arg childclass constrcor");
	}
}
