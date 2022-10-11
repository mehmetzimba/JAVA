
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;



public class Driver {
public static void main(String[] args) {
	
	SortedMap<String, String> sortedMap = new TreeMap<>();
	sortedMap.put("araba", "car");
	sortedMap.put("ev", "home");
	sortedMap.put("kalem", "pencil");
	
	System.out.println(sortedMap.size());
	System.out.println(sortedMap.get("kalem"));
	java.util.Set<String> keyset =sortedMap.keySet();
	Iterator<String> iterator=keyset.iterator();
	while (iterator.hasNext()) {
		String key = (String) iterator.next();
		System.out.print(key+":");
		System.out.println(sortedMap.get(key));
	}
	
	
}
}
