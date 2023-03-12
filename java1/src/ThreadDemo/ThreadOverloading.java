package ThreadDemo;

public class ThreadOverloading {

	public static void main(String[] args) {
		threadclass my=new threadclass();
		my.start();
	}

}
class threadclass extends Thread{
	public void run()
	{
		System.out.println("NO ARG method");
	}
	public void run(int i)//call it explictyly like normal method call
	{
		System.out.println("INT ARG method");
	}

	}
