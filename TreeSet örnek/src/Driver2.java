import java.util.Iterator;
import java.util.TreeSet;

public class Driver2 {
	
public static void main(String[] args) {
	TreeSet<Sehir> treeSet =new TreeSet<>();
	treeSet.add(new Sehir("34", "İSTANBUL") );
	treeSet.add(new Sehir("58", "SİVAS") );
	treeSet.add(new Sehir("06", "ANKARA") );
	System.out.println(treeSet.isEmpty());
	
	
	Iterator<Sehir> iterator= treeSet.iterator();
	while (iterator.hasNext()) {
		Sehir next =  iterator.next();
		System.out.println(next);
	}
	
	
}
	

}
