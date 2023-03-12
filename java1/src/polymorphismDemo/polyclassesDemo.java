package polymorphismDemo;

public class polyclassesDemo {

	public static void main(String[] args) {
		A aa=new A();
		aa.add("priyanka");
		

	}

}
class A{
	void add(int a,int b)
	{
		int ans= a+b;
		System.out.println(ans);
		
	}
	void add(int a)
	{
		int ans=a-10;
		System.out.println(ans);
	}
	void add(String s)
	{
		String ans="hello"+" "+s;
		System.out.println(ans);
	}
}
