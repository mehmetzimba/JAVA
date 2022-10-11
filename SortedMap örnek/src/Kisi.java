import java.io.Serializable;

public class Kisi implements Serializable{
	private String tc;
	private String ad;
	private String soyad;
	private Cinsiyet cinsiyet;
	 
	public Kisi() {
		
	}
	public Kisi(String tc,String ad,String soyad,Cinsiyet cinsiyet) {
		this.ad=ad;
		this.cinsiyet=cinsiyet;
		this.soyad=soyad;
		this.tc=tc;	
	}

	public String getAd() {
		return ad;
	}
	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}
	public String getSoyad() {
		return soyad;
	}
	public String getTc() {
		return tc;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public void setCinsiyet(Cinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "TC  :"+tc+" ,  AD:"+ad+",  SOYAD:"+soyad+",  CİNSİYET:"+cinsiyet;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return tc.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		Kisi kisi =(Kisi)o;
		return kisi.tc.equals(this.tc);
	}
	
	
	
	
	
	
	
	
	
}
