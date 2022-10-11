import java.io.Serializable;
import java.time.LocalDate;

public class Kisi implements Serializable {
 private String isim;
 private LocalDate dogumTarihi;
 private String emailAdresi;
 private Cinsiyet cinsiyet;
 
 
 public enum Cinsiyet{
	 ERKEK,KADIN
 }
 
 
 public Kisi() {
	 
 }
 public Kisi(String isim, LocalDate dogumTarihi,String emailAdresi,Cinsiyet cinsiyet) {
	 this.cinsiyet=cinsiyet;
	 this.dogumTarihi=dogumTarihi;
	 this.emailAdresi=emailAdresi;
	 this.isim=isim;
 }
 
 public int  getYas() {
	 return LocalDate.now().getYear()-dogumTarihi.getYear();
 }
 
 
 public Cinsiyet getCinsiyet() {
	return cinsiyet;
}
 public LocalDate getDogumTarihi() {
	return dogumTarihi;
}
 public String getEmailAdresi() {
	return emailAdresi;
}
 public String getIsim() {
	return isim;
}
 public void setCinsiyet(Cinsiyet cinsiyet) {
	this.cinsiyet = cinsiyet;
}
 public void setDogumTarihi(LocalDate dogumTarihi) {
	this.dogumTarihi = dogumTarihi;
}
 public void setEmailAdresi(String emailAdresi) {
	this.emailAdresi = emailAdresi;
}
 public void setIsim(String isim) {
	this.isim = isim;
}
 
 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return emailAdresi.hashCode();
	}
 
 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "isim  :"+isim+",  dogumtarihi  :" + dogumTarihi+" ,  email  :"+emailAdresi+",   cinsiyet:"+cinsiyet+",  yas:"+getYas();
	}
 @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	 Kisi kisi=(Kisi)obj;
		return this.emailAdresi.equals(kisi.emailAdresi);
	}
 
 
}
