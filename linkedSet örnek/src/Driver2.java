import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Driver2 {
public static void main(String[] args) {
	
	LinkedHashSet<Araba> hashSet =new LinkedHashSet<>();
	hashSet.add(new Araba("34aa", "x", "y"));
	hashSet.add(new Araba("34bb", "x", "a"));
	hashSet.add(new Araba("34cc", "a", "b"));
	Iterator<Araba> iterator =hashSet.iterator();
	while (iterator.hasNext()) {
		Araba next =  iterator.next();
		System.out.println(next);
	}
}
}
