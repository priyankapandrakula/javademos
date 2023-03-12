package Encapsulationdemo;

public class encapslatedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		System.out.println(c.getcolor());
		System.out.println(c.getnoOfColors());
		

	}

}
class Car{
	private String color;
	private int noOfColors;
	public static String namufacturer="wheel";
	public Car()
	{
		noOfColors=5;
		color="white";
	}
	public String getnoOfColors()
	{
		return this.color;
	}
	public int getcolor()
	{
		return this.noOfColors;
	}
	
}