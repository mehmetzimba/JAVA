import java.util.ArrayList;
import java.util.Iterator;

public class FilmDriver {
public static void main(String[] args) {
	
	ArrayList<Film> arrayList= new ArrayList<>();
	arrayList.add(new Film("X FİLM", "ALİ CAN","1992", FilmTipi.KOMEDI));
	
	arrayList.add(new Film("Y FİLM", "TUĞRUL","1998", FilmTipi.DRAM));
	
	arrayList.add(new Film("Z FİLM", "ERTUĞRUL","2001", FilmTipi.BILIM_KURGU));
	
 for (int i = 0; i < arrayList.size(); i++) {
	
System.out.println(	 arrayList.get(i));
	 
	 
}
}}
