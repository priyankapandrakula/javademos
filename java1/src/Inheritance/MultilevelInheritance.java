package Inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		Mul m=new Mul();
		m.sub();
		m.mul();
		m.add();
		Sub su=new Sub();
		su.sub();
		su.add();
		
	}

}
class Add
{
	int a=30, b=78;
	void add()
	{
		System.out.println("addmetod called");
	}

}
class Sub extends Add{
	void sub()
	{
		System.out.println("subcalled");
		
	}
	
}
class Mul extends Sub{
	void mul(){
		System.out.println("mul called");
		
	}
}
