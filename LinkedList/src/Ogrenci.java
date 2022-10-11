
public class Ogrenci {
   
	private int numara;
	private String ad;
	private String soyad;
	public Ogrenci() {
		
	}
	public Ogrenci(int numara,String ad,String soyad ) {
		
		this.ad=ad;
		this.numara=numara;
		this.soyad=soyad;
		}
	public String getAd() {
		return ad;
	}
	public int getNumara() {
		return numara;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public void setNumara(int numara) {
		this.numara = numara;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return numara;}
	@Override
     public boolean equals(Object o) {
	Ogrenci ogrenci= 	(Ogrenci)o;
	return ogrenci.numara == this.numara;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "NUMARA:  "+numara+"  ad:  "+ad+  "   soyad:  "+soyad;
	}
	
}
