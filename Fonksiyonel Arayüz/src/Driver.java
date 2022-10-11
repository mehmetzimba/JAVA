import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Driver {
public static void main(String[] args) {
	
	
	
	/*Matematik matematik= (x,y)-> System.out.println(x+y);;
	
	matematik.islem(4, 7);*/
	
	
	ArrayList<String> sehirler= new ArrayList<String>();
	sehirler.add("bursa");
	sehirler.add("ankara");
	sehirler.add("istanbul");
	sehirler.add("izmir");
	sehirler.add("kayseri");
	sehirler.forEach((s)->  System.out.println(s) );//CONSUMER İNTERFACE  KULLANIMI
	
	//PREDİCATE KULLANIMI (kendisine verilen değeri alır boolean olarak döndürür)
	Predicate<String> predicate =(s)-> s.startsWith("b");
	for (int i = 0; i < sehirler.size(); i++) {
		String sehir=sehirler.get(i);
		if(predicate.test(sehir)) {
			System.out.println(sehir);
		}
		
		
	}
	
	
}
}
