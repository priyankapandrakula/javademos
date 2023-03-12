package utilpackage;
import java.util.*;

public class stackDemo {

	public static void main(String[] args) {
		Stack<String>stk=new Stack<String>();
		stk.push("ap");
		stk.push("jx");
		Iterator <String>it= stk.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// TODO Auto-generated method stub

	}

}
