import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {
public static void main(String[] args) {
	ArrayList<Ogrenci> arrayList =new ArrayList<>();
	arrayList.add(new Ogrenci(1, "mehmet zımba", 21));
	arrayList.add(new Ogrenci(3, "asım zımba", 19));
	arrayList.add(new Ogrenci(4, "ibrahim zımba",17));
	arrayList.add(new Ogrenci(5, "zeynep zımba ",3));
	
	
	List<Ogrenci> collect=arrayList.stream()
	.filter((o)->o.getIsim().startsWith("z"))
	.collect( Collectors.toList());
	
	collect.forEach(System.out::println);
	
	
}
}
