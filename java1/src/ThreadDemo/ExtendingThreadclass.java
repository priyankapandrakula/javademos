package ThreadDemo;

public class ExtendingThreadclass {

	public static void main(String[] args) {
		Mythread my=new Mythread();
		my.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("excuted by parent thread");
		}
		
		

	}

}
class Mythread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("excuted by child thread");
		}
	}
}
