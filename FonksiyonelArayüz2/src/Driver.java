import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Driver {
public static void main(String[] args) {
	//supplier arayüzü kullanımı örneği(supplier geriye istediğimiz nesneyi döndüren bir arayüz
	Supplier<Urun>   supplier = ()->new Urun(1, "limon", 6);
	System.out.println(supplier.get());
	
	// supplier ile ürün listesi döndürme
	
	Supplier<List<Urun>> supplier1 =()-> {
		List<Urun> list =new ArrayList<>();
		list.add(new Urun(2, "muz", 12));
		list.add(new Urun(3, "mandalina", 5));
		list.add(new Urun(4, "elma", 8));
		return list; // lambdada süslü parantez kullanımı değeri return ile döndürmesi
	};
	supplier1.get().forEach((u)-> System.out.println(u));                
}
}
