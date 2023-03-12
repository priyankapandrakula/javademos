package ThreadDemo;
import java.util.*;
public class JoinDemo {

	public static void main(String[] args) {
		System.out.println("sum of n numbers");
		System.out.println("enter a value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Calculator calc=new Calculator(n);
		calc.start();
		try {
		Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		printmessage("sum of firstn numbers ="+calc.getSum());
		

	}
	private static void printmessage(String message) {
		System.out.println(Thread.currentThread().getName());
	}

}
class Calculator extends Thread{
	int n;
	int sum;
	Calculator(int n){
		this.n=n;
	}
	public void run() {
		for(int i=1;i<=n;i++)
		{
			this.sum+=i;
			
		}
	}
	public int getSum()
	{
		return sum;
	}
}
