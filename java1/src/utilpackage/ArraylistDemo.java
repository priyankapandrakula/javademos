package utilpackage;
import java.util.*;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		//add method
		al.add("pp");
		al.add("akhhi");
		for(String s:al)
		{
			System.out.println(s);
		}
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
