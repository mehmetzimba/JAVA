import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Driver {
public static void main(String[] args) {
	HashMap<Integer,String> hashMap =new HashMap<>();
	hashMap.put(34, "İSTANBUL");
	hashMap.put(35, "İZMİR");
	hashMap.put(6, "ANKARA");
	System.out.println(hashMap.get(34));
	
	Set<Integer> keySet = hashMap.keySet(); // mapteki ıterator
	 Iterator<Integer> iterator= keySet.iterator();
	 while (iterator.hasNext()) {
		Integer key = (Integer) iterator.next();
		System.out.println(key);               // key 
		System.out.println(hashMap.get(key)); // value
	}
	
}
}
