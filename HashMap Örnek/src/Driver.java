import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Driver {
public static void main(String[] args) {
	
	HashMap<String,Double> hashMap =new HashMap<>();
	hashMap.put("bilgisayar", (double) 2200);
	hashMap.put("ceptelefon", (double) 1500);
	hashMap.put("araba", (double) 20000);
	System.out.println(hashMap.size());
    System.out.println("--------");
    Set<String> keyset =hashMap.keySet();
	Iterator<String> iterator =keyset.iterator();
	while (iterator.hasNext()) {
		String key = (String) iterator.next();
		System.out.print(key+":");
        System.out.println(hashMap.get(key));		
        System.out.println("--------");
		
		
	}
	System.out.println("-----------------------------------");
	hashMap.replace("araba", (double) 29000);
	Set<String> keyset2 =hashMap.keySet();
	Iterator<String> iterator2 =keyset.iterator();
	while (iterator2.hasNext()) {
		String key = (String) iterator2.next();
		System.out.print(key+":");
        System.out.println(hashMap.get(key));		
        System.out.println("--------");
		
		
	}
	
	
}

}
