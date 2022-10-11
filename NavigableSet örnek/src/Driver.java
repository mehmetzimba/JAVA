import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Driver {
public static void main(String[] args) {
	NavigableSet<Integer> navigableSet = new TreeSet<>();
	navigableSet.add(2);
	navigableSet.add(5);
	navigableSet.add(1);
	navigableSet.add(3);
	navigableSet.add(3);
	// System.out.println(navigableSet.size());
	Iterator<Integer> iterator = navigableSet.iterator();
	while(iterator.hasNext()) {
		 Integer next =iterator.next(); 
	     System.out.println(next );
		
	}
	
}



}
