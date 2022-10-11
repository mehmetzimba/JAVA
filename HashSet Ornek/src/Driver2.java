import java.util.HashSet;
import java.util.Iterator;

public class Driver2 {
public static void main(String[] args) {
	
	HashSet<Calısan> hashSet =new HashSet<>();
	hashSet.add(new Calısan("1", "ALİ"));		
	hashSet.add(new Calısan("2", "SEYHAN"));			
	hashSet.add(new Calısan("3", "AYŞE"));			
			
	Iterator<Calısan> iterator =hashSet.iterator();
	while(iterator.hasNext()) {
		Calısan next=  iterator.next();
		System.out.println(next);
		
	}
			
			
}
}
