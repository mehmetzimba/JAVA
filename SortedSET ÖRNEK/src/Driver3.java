import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver3 {
public static void main(String[] args) {
	SortedSet<Ogrenci> sortedSet =new TreeSet<>();
	sortedSet.add(new Ogrenci(12, "mehmet"));
	sortedSet.add(new Ogrenci(2, "ali"));
	sortedSet.add(new Ogrenci(3, "okan"));
	
	System.out.println(sortedSet.size());
	Iterator<Ogrenci> iterator= sortedSet.iterator();
	while (iterator.hasNext()) {  // iteratorun içinde dönmek için while oluşturduk ,iterator sona gelmediyse true döndürecektir
		 Ogrenci next =iterator.next(); // iteratörün o an ki değeri için next
	     System.out.println(next ); // bu degeri ekrana yazdırdık
	}
	
}
}
