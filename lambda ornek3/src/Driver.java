import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {
	
public static void cinsiyeteGoreFiltrele(List<Kisi> kisiler,Kisi.Cinsiyet cinsiyet)	{
	
	for (int i = 0; i < kisiler.size(); i++) {
		Kisi kisi=kisiler.get(i);
		if (kisi.getCinsiyet().equals(cinsiyet)) {
			System.out.println(kisi);
		}
		
		
		
	}
	
	
	
}
public static void yasaGoreFiltrele(List<Kisi> kisiler,int yas)	{
	
	for (int i = 0; i < kisiler.size(); i++) {
		Kisi kisi=kisiler.get(i);
		if (kisi.getYas()>= yas  ) {
			System.out.println(kisi);
		}
		
		
		
	}
	
	
	
}

public static void yasaAraliginaFiltrele(List<Kisi> kisiler,int min,int max)	{
	
	for (int i = 0; i < kisiler.size(); i++) {
		Kisi kisi=kisiler.get(i);
		if (kisi.getYas()> min && kisi.getYas()<= max ) {
			System.out.println(kisi);
		}
		
	}	
		
	}
	
	
	public static void kisiFiltrele(List<Kisi> kisiler,KisiFiltresi kisiFiltresi) {
		for (int i = 0; i < kisiler.size(); i++) {
		Kisi kisi =kisiler.get(i);
		if (kisiFiltresi.filtrele(kisi)) {
			System.out.println(kisi);
		}
		}
		
}
	

	
	
	
	

	
public static void main(String[] args) {
	
	Kisi kisi1= new Kisi("ali can", LocalDate.parse("1990-01-01"), "ali@example.com", Kisi.Cinsiyet.ERKEK);
	Kisi kisi2= new Kisi("ayşe can", LocalDate.parse("1992-01-01"), "VEli@example.com", Kisi.Cinsiyet.KADIN);
	Kisi kisi3= new Kisi("KASIM can", LocalDate.parse("1991-01-01"), "KASIM@example.com",Kisi. Cinsiyet.ERKEK);

ArrayList<Kisi> kisiler = new ArrayList<Kisi>();

kisiler.add(kisi1);
kisiler.add(kisi2);
kisiler.add(kisi3);
// cinsiyeteGoreFiltrele(kisiler,Kisi.Cinsiyet.KADIN);
 ///  yasaGoreFiltrele(kisiler, 31);

kisiFiltrele(kisiler,(k)-> k.getYas() >=30   );

}
}
