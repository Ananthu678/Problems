import java.util.HashSet;
import java.util.Set;

public class for_each {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruits = new HashSet<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		
		fruits.forEach(f -> System.out.println(f));
	}

}
