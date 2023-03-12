package abstractDemo;

abstract class Dog{
	abstract void sound();
	void display()
	{
		System.out.println("calling display method");
	}

}
class Abstractdemo2 extends Dog{
	void sound()
	{
		System.out.println("sound method called");
	}
	public static void main(String[]args)
	{
		Abstractdemo2 d=new Abstractdemo2();
		d.display();
		d.sound();
		//can create reference variable 
		Dog dd=new Abstractdemo2();
		dd.display();
		dd.sound();
		//dont use abstract+final keyword
		//abstrcat+static dont use
	}
}
