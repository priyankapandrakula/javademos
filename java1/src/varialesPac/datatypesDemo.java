package varialesPac;

public class datatypesDemo {
	static byte  a=20;
	public static void main(String[]args)
	{
		//datatypesDemo demo =new datatypesDemo();
		
		//System.out.println(demo.a);
		System.out.println(a);
		a=(byte)170; //undefined behaviour
		System.out.println(a);
		short b=120;
		int c=90;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		float f=1.23f;
		System.out.println(f);
		
		
		double d=1.44553322;
		System.out.println(d);
		
		
	}

}
