import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	SortedSet<Ogrenci> sortedSet =new  TreeSet<>();
	
	System.out.println("öğrenci eklemek için (E),Uygulamadan çıkmak için (x) basınız. ");
     String line=null;
     while ((line= scanner.nextLine()).equals("E")) {
    	 System.out.print("numara:");
    	int numara=Integer.parseInt(scanner.nextLine());
    	
    	 System.out.print("ad:"); 
    	 String ad=scanner.nextLine();
    	 
    	 System.out.print("soyad:");
    	 String soyad=scanner.nextLine();
    	 
    	 System.out.print("sınıf:");
    	 String sınıf=scanner.nextLine();
    	 sortedSet.add(new Ogrenci(numara, ad, soyad, sınıf));
    	 System.out.println("öğrenci eklemek için (E),Uygulamadan çıkmak için (x) basınız. ");
	}
   System.out.println("TOPLAM ÖĞRENCİ SAYISI :"+ sortedSet.size());
 Iterator<Ogrenci> iterator =sortedSet.iterator();
 while (iterator.hasNext()) {
	Ogrenci next =  iterator.next();
	System.out.println(next);
	
}



}
}
