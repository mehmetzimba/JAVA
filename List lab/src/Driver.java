import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
ArrayList<Bilet> biletListesi =new  ArrayList<>();
Random random =new Random();
for (int i = 0; i <100; i++) {
	Bilet bilet =new Bilet(random.nextInt(1000), new Date(), random.nextFloat()*100);
	biletListesi.add(bilet);
}
	  
/* Iterator<Bilet> iterator=arrayList.iterator();
while (iterator.hasNext()) {
	Bilet next = iterator.next();
	System.out.println(next);
} */
ArrayList<Koltuk> koltukListesi =new ArrayList<>();
Scanner scanner =new Scanner(System.in);
int secim=0;
int koltukNumarasi=0;
System.out.println("lütfen seçim yapınız (bir bilet al (0 cıkıs))");
while ((secim=scanner.nextInt())!= 0 ) {
	biletListesi.get(random.nextInt(biletListesi.size()));
	Bilet bilet=biletListesi.get(random.nextInt(biletListesi.size()));
	biletListesi.remove(bilet);
	Koltuk koltuk = new Koltuk(++koltukNumarasi, bilet);
	koltukListesi.add(koltuk);
	
}
scanner.close();
System.out.println("satılan bilet sayısı"+koltukListesi.size());
 Iterator<Koltuk> iterator=     koltukListesi.iterator();
while (iterator.hasNext()) {
	Koltuk koltuk = (Koltuk) iterator.next();
	System.out.println(koltuk);
}

}
}
