package Inheritance;
 class ParentClass
{
	float sal=34;
}
public class SingleInheritance extends ParentClass{
	int bonus=90;

	public static void main(String[] args) {
		SingleInheritance inheri=new SingleInheritance();
		System.out.println(inheri.sal+inheri.bonus);
	}

}
