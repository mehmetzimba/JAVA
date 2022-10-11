

	import java.util.Iterator;
	import java.util.SortedSet;
	import java.util.TreeSet;

	import com.sun.source.tree.WhileLoopTree;

	public class Driver2 {
	public static void main(String[] args) {
		SortedSet<String> sortedSet =new TreeSet<>(); //sortedSet adında Integer verilere sahip  SortedSet nesne tanımladık
		sortedSet.add("ahmet");
		sortedSet.add("mehmet");
		sortedSet.add("zeynep"); // 3 ,5 ,1 integerları ekledik
		sortedSet.add("rumeysa");
		Iterator<String> iterator =sortedSet.iterator(); // sortedSet içerisinde dolaşmak için iterator oluşturduk

		while (iterator.hasNext()) {  // iteratorun içinde dönmek için while oluşturduk ,iterator sona gelmediyse true döndürecektir
			 String next =iterator.next(); // iteratörün o an ki değeri için next
		     System.out.println(next ); // bu degeri ekrana yazdırdık
		}


	} //SORTEDSET İÇİNDE BULUNAN ELEMANLARI SIRALAYARAK TUTAR
	}



