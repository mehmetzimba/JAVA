package encapsulation;

public class Driver {
	public static void main(String[] args) {
		Ogrenci ogrenci =new Ogrenci();
		ogrenci.ad ="mehmet";
		ogrenci.numara=1;
		ogrenci.soyad ="can";
		ogrenci.setYas(-12);
		ogrenci.bilgileriYazdır();
		
	}

}
