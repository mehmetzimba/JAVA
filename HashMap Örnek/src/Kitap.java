import java.io.Serializable;
import java.util.Date;

public class Kitap implements Serializable {
  
	private String ad;
	private Date yayinTarihi;
	private String yazar;
	
	public Kitap() {
		
	}
	public Kitap(String ad,Date yayinTarihi,String yazar) {
		this.ad=ad;
		this.yayinTarihi=yayinTarihi;
		this.yazar=yazar;
	}
	
	
	public String getAd() {
		return ad;
	}
	public Date getYayinTarihi() {
		return yayinTarihi;
	}
	public String getYazar() {
		return yazar;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public void setYayinTarihi(Date yayinTarihi) {
		this.yayinTarihi = yayinTarihi;
	}
	
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ad  :"+ ad+",  yayinTarihi:  "+yayinTarihi+",   yazar :"+yazar;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return ad.hashCode()+yayinTarihi.hashCode()+yazar.hashCode();
	}
	
	@Override
	public boolean equals(Object object) {
		// TODO Auto-generated method stub
		Kitap kitap =(Kitap)object;
		return kitap.ad.equals(this.ad) &&kitap.yayinTarihi.equals(this.yayinTarihi)&&kitap.yazar.equals(this.yazar);
	}
}
