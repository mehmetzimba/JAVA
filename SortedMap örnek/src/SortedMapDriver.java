import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDriver {
public static void main(String[] args) {
	
	SortedMap<Integer, Kisi> sortedMap =new TreeMap<>();
	sortedMap.put(1, new  Kisi("123","mehmet", "ak",Cinsiyet.ERKEK));
	sortedMap.put(2, new  Kisi("456","AHhmet", "ak", Cinsiyet.ERKEK));
	sortedMap.put(3, new  Kisi("789","RECEP", "ak", Cinsiyet.ERKEK));
	
	System.out.println(sortedMap.size());
	Set<Integer> keySet = sortedMap.keySet();
	Iterator<Integer> iterator = keySet.iterator();
	while (iterator.hasNext()) {
		Integer set = (Integer) iterator.next();
		System.out.print(set+":");
     System.out.println(sortedMap.get(set));
	}
}
}
