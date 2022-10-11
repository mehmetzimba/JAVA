import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDriver {
   public static void main(String[] args) {
	
	   HashMap<Integer, Sehir> hashMap =new HashMap<>();
	   hashMap.put(34,new Sehir("istanbul", 16000000));
	   hashMap.put(35,new Sehir("izmir", 4000000));
	   hashMap.put(6,new Sehir("ankara", 6000000));
	   hashMap.put(58,new Sehir("sivas", 300000));
	   System.out.println(hashMap.size());
	   System.out.println(hashMap.get(58)); // değer olarak sehir nesnesini döndürür
         Set<Integer> keySet= hashMap.keySet();
        Iterator<Integer> iterator= keySet.iterator();
    while (iterator.hasNext()) {
		Integer key = (Integer) iterator.next();
		System.out.println(key);
		System.out.println(hashMap.get(key));
	}
  
   
   }


}
