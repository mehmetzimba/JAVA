
public class Ogrenci implements Comparable<Ogrenci> {
private int numara;
private String ad;
private String soyad;
private String sinif;

public Ogrenci() {
	

}

public Ogrenci( int numara,String ad,String soyad,String sinif) {
	
	this.ad=ad;
	this.numara=numara;
	this.sinif=sinif;
	this.soyad=soyad;	
}




public String getAd() {
	return ad;
}
public void setAd(String ad) {
	this.ad = ad;
}
public int getNumara() {
	return numara;
}
public void setNumara(int numara) {
	this.numara = numara;
}
public String getSinif() {
	return sinif;
}
public void setSinif(String sinif) {
	this.sinif = sinif;
}
public String getSoyad() {
	return soyad;
}
public void setSoyad(String soyad) {
	this.soyad = soyad;
}


 @Override
	public boolean equals(Object object) { // iki ögrencinin numarası aynıysa bu aynı öğrenci kontrolü için
		Ogrenci ogrenci =(Ogrenci) object;
		return ogrenci.numara == this.numara;
	}
@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.numara;
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "numara" +numara+"   ,ad  "+ad+",  soyad: "+soyad+"  ,sınıf"+sinif;
	}
@Override
	public int compareTo(Ogrenci o) {
		// TODO Auto-generated method stub
		return this.numara-o.numara;
	}

}
