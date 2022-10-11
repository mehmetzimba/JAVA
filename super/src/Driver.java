
public class Driver {
public static void main(String[] args) {
	Kisi kisi =new Kisi("mehmet zımba");
	System.out.println(kisi.getIsim());
	Ogrenci ogrenci=new Ogrenci("zeynep zımba",2);
	System.out.println(ogrenci.getIsim());
	System.out.println(ogrenci.getNumara());
	ogrenci.ozet();
}
}
