import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import com.sun.source.tree.WhileLoopTree;

public class Driver {
public static void main(String[] args) {
	SortedSet<Integer> sortedSet =new TreeSet<>(); //sortedSet adında Integer verilere sahip  SortedSet nesne tanımladık
	sortedSet.add(3);
	sortedSet.add(5);
	sortedSet.add(1); // 3 ,5 ,1 integerları ekledik
	sortedSet.add(0);
	Iterator<Integer> iterator =sortedSet.iterator(); // sortedSet içerisinde dolaşmak için iterator oluşturduk

	while (iterator.hasNext()) {  // iteratorun içinde dönmek için while oluşturduk ,iterator sona gelmediyse true döndürecektir
		 Integer next =iterator.next(); // iteratörün o an ki değeri için next
	     System.out.println(next ); // bu degeri ekrana yazdırdık
	}


} //SORTEDSET İÇİNDE BULUNAN ELEMANLARI SIRALAYARAK TUTAR
}
