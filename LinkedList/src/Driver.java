import java.util.Iterator;
import java.util.LinkedList;
// sıralı şekilde kaydeder ve setlerden farkı unique elemanlar tutmaz yani tekrar eden elemanları da gösterir
public class Driver {
public static void main(String[] args) {
	LinkedList<Integer>  integers =new LinkedList<>();
	integers.add(1);
	integers.add(0);
	integers.add(6);
	integers.add(0);
	int x=integers.get(2); // 0. index=1 ,1. index =0 ,2. index=6
	System.out.println(x);
	System.out.println(integers.size());
	integers.add(2, 55);// 2. indexe 55 ekledik(indexler 0 dan başlar ve DİĞERLERİ AŞAĞIYA KAYAR
	integers.addFirst(12);
	integers.addLast(21);
	
	Iterator<Integer> iterator =  integers.iterator();
	while (iterator.hasNext()) {
		Integer next =  iterator.next();       // içindeki elemanları eklenme sırasına göre  göstermek için iteraor kullandık
		System.out.println(next);
	}
	System.out.println(integers.indexOf(12)); // değeri 12 olan indexi döndürecek
	
	integers.remove();// ilk indexi kaldır
	integers.remove(4); // 4. indexi kaldır
	integers.remove(2); // değeri 2 olan indexi kaldır seçerken içersinde object olanı sectik
	
}
}
