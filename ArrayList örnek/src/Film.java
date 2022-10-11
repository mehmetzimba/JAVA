import java.io.Serializable;

public class Film implements Serializable{
 private String ad;
 private String yönetmen;
 private String yayinlanmaYili;
 private FilmTipi tip;
 
 public Film() {
	 
 }
 public Film(String ad, String yönetmen,String yayinlanmaYili,FilmTipi tip) {
	 this.ad=ad;
	 this.tip=tip;
	 this.yayinlanmaYili=yayinlanmaYili;
	 this.yönetmen=yönetmen;
	 
	 
 }
 
 
 public String getAd() {
	return ad;
}
 public FilmTipi getTip() {
	return tip;
}
 public String getYayinlanmaYili() {
	return yayinlanmaYili;
}
 public String getYönetmen() {
	return yönetmen;
}
 public void setAd(String ad) {
	this.ad = ad;
}
 public void setTip(FilmTipi tip) {
	this.tip = tip;
}
 public void setYayinlanmaYili(String yayinlanmaYili) {
	this.yayinlanmaYili = yayinlanmaYili;
}
 public void setYönetmen(String yönetmen) {
	this.yönetmen = yönetmen;
}
 
  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "AD :"+ad +"  tip:  "+tip + "   Yayinlanma_yili  : "+yayinlanmaYili+"   yönetmen  :"+yönetmen;
				
	}
 
 @Override
	public boolean equals(Object o) {
		Film film =(Film)o;
		return film.ad.equals(this.ad) && film.yayinlanmaYili.equals(this.yayinlanmaYili);
	}

 
}
