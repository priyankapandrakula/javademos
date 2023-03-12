package varialesPac;

public class BoxingUnboxingDemo {
	public static void main(String[]args)
	{
	//WRAPPER TYPES
	int u=10;//primitive 
	Integer a=30;//corresponding object representation of primitive type
	Integer bb=new Integer(20);//both same
	
	byte b=7;
	Byte b1=3;
	
	//conversion of primitive to wrapper-BOXING
	Integer x=9;
	
	
	//CONVERSION OF warpper to primitive-UNBOXING
	Integer aa=new Integer(33);
	int z=aa;
	
	Integer p=999;
	if (p>100)//internal wrapping is done from wrap to primitive 
	{
		System.out.println(p);
	}
	}
	
	
}
