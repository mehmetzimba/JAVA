
public class Kalem {
 String marka;
 String tip ;
 boolean doldurabilir;
 boolean silinebilir;
 void yaz(String metin) {
	 
	 System.out.println(metin);
	 
 }
 void tekrardoldur() {
	if(doldurabilir) 
	 System.out.println("kalem dolduruldu");
	else
		System.out.println("bu kalem doldurulamaz");
 }
 void sil() {
	 if(silinebilir)
	  System.out.println("yazı silindi");
	 else
		 System.out.println("bu yazı silinemez");
	 
 }
}
