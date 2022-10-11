import java.util.HashSet;
import java.util.Iterator;

public class Driver {
public static void main(String[] args) {
	HashSet<String> hashSet =new HashSet<>();
	hashSet.add("İstanbul");
	hashSet.add("ankara");
	hashSet.add("bursa");
	
	System.out.println(hashSet.size());
	Iterator<String> iterator =hashSet.iterator();
	while (iterator.hasNext()) {
		String next=  iterator.next();
		System.out.println(next);
	}
	
}
}
