package algorithmsDemo;

public class ScalableDemo {

	public static void main(String[] args) {
		String []myarr= {"tv","radio","computer"};
	searchmethod(myarr);
		
		
	}


private static void searchmethod(String []myarr)
{
	long start=System.currentTimeMillis();
	for(int i=0;i<myarr.length;i++)
	{
		if (myarr[i]=="radio")
		{
			System.out.println("found");
		}
		else {
			System.out.println("NOT found");
		}
	}
	long end=System.currentTimeMillis();
	System.out.println("Took"+(end-start)+" milliseconds");
}
}