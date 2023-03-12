package Inheritance;

public class HireraricalInheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();
		Dog dd=new Dog();
		System.out.println(dd.fuel());
		
		Cat cc=new Cat();
		System.out.println(cc.fuel());
		
	}

}
class Animal{
	 void eat()
	 {
		 System.out.println("eating");
	 }
	 String fuel()
	 {
		 return "petrol";
	 }
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
		
	}
	String fuel()
	{
		//return super.fuel();
		return "iceream";
	}
}
class Cat extends Animal{
	void meow()
	{
		System.out.println("souns..");
	}
	String fuel()
	{
		return "diesel";
	}
}