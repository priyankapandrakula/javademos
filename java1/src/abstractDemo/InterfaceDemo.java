package abstractDemo;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda hon =new Honda();
		hon.go();
		hon.stop();

	}

}
interface Car {
	void go();
	void stop();
}
class Honda implements Car{
	@Override 
	public void go() {
		System.out.println("indisde honda go()");
	}
	@Override 
	public void stop() {
		System.out.println("indisde honda stop()");
	}
}