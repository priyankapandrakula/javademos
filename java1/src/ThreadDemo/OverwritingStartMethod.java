package ThreadDemo;

public class OverwritingStartMethod {

	public static void main(String[] args) {
		Mytesting my=new Mytesting();
		my.start();
		System.out.println("main method");
	}

}
class Mytesting extends Thread
{

public void start()
{
	super.start();
	System.out.println("start method");
}
public void run()
{
	System.out.println("Run method");
}
	
}
//THERE ARE 3 possibilities in this case
