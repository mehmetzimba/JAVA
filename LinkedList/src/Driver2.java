import java.util.Iterator;
import java.util.LinkedList;

public class Driver2 {
public static void main(String[] args) {
	LinkedList<Ogrenci> linkedlist =new  LinkedList<>();
	linkedlist.add(new Ogrenci(1, "MEHMET", "ZIMBA"));
	linkedlist.add(new Ogrenci(2, "ALİ", "CAN"));
	linkedlist.add(new Ogrenci(3, "TUĞRUL", "ÇALIŞKAN"));
	
	
	linkedlist.remove(2);
	Iterator<Ogrenci> iterator =linkedlist.iterator();
	while (iterator.hasNext()) {
		Ogrenci next= (Ogrenci) iterator.next();
		System.out.println(next);
		
	}
}
}
