package setLab;

import java.util.Iterator;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {
	
	public static void doldur(SortedSet<Integer> integers) {
		
		integers.clear();
		Random random =new Random(); // 1-ila 49 arasında rastgele değerler üretmek için random sınıfından instance aldık
		while(integers.size() < 6) {
			int sayi =random.nextInt(49) + 1;
			integers.add(sayi);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		SortedSet<Integer> integers = new TreeSet<>();
		doldur(integers);
			Iterator<Integer> iterator = integers.iterator();
			 while (iterator.hasNext()) {
				Integer next =  iterator.next();
				System.out.println(next);
			}
			
			
			
			
			
			
			
			
			
			
					}

}
