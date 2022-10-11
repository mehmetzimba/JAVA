import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDriver {
public static void main(String[] args) {
	
	HashMap<Integer, Kitap> hashMap = new HashMap<>();
	
	hashMap.put(1, new Kitap("x ",new Date(), "a "));
	hashMap.put(2, new Kitap("y ",new Date(), "b "));
	hashMap.put(3, new Kitap("z ",new Date(), "c "));
	System.out.println(hashMap.size());
	Set<Integer> keySet =hashMap.keySet();
	Iterator<Integer> iterator= keySet.iterator();
	while (iterator.hasNext()) {
		Integer key = (Integer) iterator.next();
		System.out.print(key+":");
		System.out.println(hashMap.get(key));
		System.out.println("-----------");
	}
	
	
} 

}
