import java.util.Iterator;
import java.util.LinkedHashSet;

public class Driver {
public static void main(String[] args) {
	LinkedHashSet<Integer> hashSet =new LinkedHashSet<>();
	hashSet.add(2);
	hashSet.add(5);
	hashSet.add(3);
	System.out.println(hashSet.size());
	System.out.println(hashSet.isEmpty());
	System.out.println("------------");
	Iterator<Integer> iterator = hashSet.iterator();
	while (iterator.hasNext()) {
		Integer next =  iterator.next();
		System.out.println(next);
		
	}
	
}
}
