package ThreadDemo;

public class ExplicitStartmethod {

	public static void main(String[] args) {
		Mytest th=new Mytest();
		th.start();
	}

}
class Mytest extends Thread{
	public void start()
	{
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
}
//OVERIDING START METHOD gives start method instead of run method()
