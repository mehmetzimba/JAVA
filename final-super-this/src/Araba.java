
public class Araba extends YolcuArac {
	private int kapisayisi;
 public Araba(String plaka,String marka,int kapasite,int kapisayisi) {
	 
	 super( plaka, marka,kapasite);
	 this.kapisayisi=kapisayisi;
 }
 
 public int getKapisayisi() {
	return kapisayisi;
}
 public void setKapisayisi(int kapisayisi) {
	this.kapisayisi = kapisayisi;
}
 public void yazdır() {
		super.yazdır();
		System.out.println("kapısayısı:   "+kapisayisi);
		
	}
 
}
