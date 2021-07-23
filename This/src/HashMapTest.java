import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,Integer> myHash=new HashMap<>();
		myHash.put("hamid", 1);
		myHash.put("ali", 2);
		myHash.put("hosain", 3);
		myHash.put("navid", 4);
		
		System.out.println(myHash);
		
		myHash.put("ali", 5);
		
		System.out.println(myHash);
	}

}
