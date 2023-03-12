package abstractDemo;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b=new BMWThree();
		b.start();
		b.accelerated();
		BMW bb=new BMWFive();
		bb.start();
		bb.accelerated();
		BMWThree b2=new BMWThree();
		b2.start();
		b2.accelerated();

	}

}

abstract class BMW{
	void start() {
		System.out.println("BWM STARTED");
	}
	abstract void accelerated();
	{
		
	}

	
}
class BMWThree extends BMW{
	@Override 
	void accelerated() {
		System.out.println("Thretimes started");
	}
}
class BMWFive extends BMW{
	@Override
	void accelerated() {
		System.out.println("Fivetimes started");
	}
}
