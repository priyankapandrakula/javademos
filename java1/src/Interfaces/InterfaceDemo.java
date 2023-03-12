package Interfaces;

interface Myinterface {
	int x=90;//by default variables are public static final variable in interface 
	public abstract void m1();
}

interface Myinterface2{
	public abstract void m2();
}

interface Myinterface3 extends Myinterface{
	public abstract void m3();
	default void m4()
	{
		System.out.println("deafult");
	}
}
class InterfaceDemo implements Myinterface, Myinterface2,Myinterface3{
	
	public void m1()
	{
		System.out.println("calling abstract method");
	}
	public void m2()
	{
		System.out.println("calling abstract method2");
	}
	public void m3()
	{
		System.out.println("calling abstract3 method");
	}
	public static void main(String[]args)
	{
		/*InterfaceDemo d=new InterfaceDemo();
		d.m1();
		//we cannot create constructors in interfaces
		//REFEREDNCE VARIBALE
		Myinterface my=new InterfaceDemo();
		my.m1();
		
		Myinterface2 myy=new InterfaceDemo();
		myy.m2();*/
		
		
		Myinterface3 pp=new InterfaceDemo();
		pp.m1();
		pp.m3();
		pp.m4();
		
	}
}