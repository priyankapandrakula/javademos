package enumsdemo;

public class EnumsDemo {

	public static void main(String[] args) {
		
		for(Level l:Level.values()) {
		System.out.println(l);
		}

	}

}
enum Level{
	LOW,
	MEDIUM,HIGH;
}
