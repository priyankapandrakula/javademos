package varialesPac;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("from main method");
		m1();
		m2();
		Demo2 d=new Demo2();
		d.m3();
	}
		static void m1()
		{
			System.out.println("static method 1");
		}
		static void m2()
		{
			System.out.println("static method 2");
		}
		void m3()
		{
			System.out.println("method 3");
		}

	}


