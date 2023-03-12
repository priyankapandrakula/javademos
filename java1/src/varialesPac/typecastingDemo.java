package varialesPac;

public class typecastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IMPLICIT CASTING - conversion happens automatically 
		//example byte to int
		
		
		//Explicit casting -conversion happensa explicitly
		//example int to byte
		
		byte a=23;
		int b=45;
		a=(byte)b;
		System.out.println(a);
		
		b=a;
		System.out.println(b);//implicit
		
		//char 2 bytes
		char ch='p';
		int x=ch;//int 4 bytes so implcit conversion;
		System.out.println(x);
		
		//int to char explicit  (BIG TO SMALL --> EXPLICT)
		int y=116;
		char z=(char) y;
		System.out.println(z);
		
		
				

	}

}
