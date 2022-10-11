import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DriverBisiklet {
public static void main(String[] args) {
	
	ArrayList<Bisiklet> arrayList =new ArrayList<>();
	arrayList.add(new Bisiklet("X MARKA", 18));
	arrayList.add(new Bisiklet("Y MARKA", 21));
	arrayList.add(new Bisiklet("Z MARKA", 18));
	arrayList.add(new Bisiklet("Q MARKA", 18));
	BisikletKarsılastirici bisikletKarsılastirici =new BisikletKarsılastirici();
	Collections.sort(arrayList, bisikletKarsılastirici::compare);
	
	arrayList.forEach( System.out::println);
	
	
	
	
	
}
}
