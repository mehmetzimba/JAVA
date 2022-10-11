package overloading;

public class Ogrenci {
 private String kimlik;
 private String ad;
 private String soyad;
 private String sınıf;
 
 public Ogrenci() {
	 
 }
public Ogrenci(String kimlik) {
	 this.kimlik =kimlik;
 }
public Ogrenci(String kimlik,String ad) {
	 this.kimlik =kimlik;
	 this.ad=ad;
}
public Ogrenci(String kimlik,String ad,String soyad) {
	 this.kimlik =kimlik;
	 this.ad=ad;
	 this.soyad=soyad;
}
public Ogrenci(String kimlik,String ad,String soyad,String sınıf) {
	 this.kimlik =kimlik;
	 this.ad=ad;
	 this.soyad=soyad;
	 this.sınıf=sınıf;
}

 
 
 public String getAd() {
	return ad;
}
 public String getKimlik() {
	return kimlik;
}
 public String getSınıf() {
	return sınıf;
}
 public String getSoyad() {
	return soyad;
}
 public void setAd(String ad) {
	this.ad = ad;
}
 public void setKimlik(String kimlik) {
	this.kimlik = kimlik;
}
 public void setSınıf(String sınıf) {
	this.sınıf = sınıf;
}
 public void setSoyad(String soyad) {
	this.soyad = soyad;
}
 
 
 
 
 
 
 
 
 
}
