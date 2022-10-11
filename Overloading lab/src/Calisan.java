import java.util.Date;

public class Calisan {
 private String isim;
 private String bölüm;
 private Date isegiris;
 
 public Calisan() {
	 
	 
 }
 public Calisan(String bölüm) {
	 this.bölüm=bölüm;
 }
 public Calisan(String bölüm,String isim) {
	 this.bölüm=bölüm;
	 this.isim= isim;
	 
	 
 }
 public Calisan(String bölüm,String isim,Date isegiris) {
	 this.bölüm=bölüm;
	 this.isim= isim;
	 this.isegiris=isegiris;
	 
	 
	 
 }
 
 
 
 
  public String getBölüm() {
	return bölüm;
}
  public Date getIsegiris() {
	return isegiris;
}
  public String getIsim() {
	return isim;
}
  public void setBölüm(String bölüm) {
	this.bölüm = bölüm;
}
  public void setIsegiris(Date isegiris) {
	this.isegiris = isegiris;
}
  public void setIsim(String isim) {
	this.isim = isim;
}
  
  
  
  
  
  public void bilgileriyazdır() {
	  System.out.println(isim+""+bölüm+""+isegiris);
	  
  }
  
 
 
 
 
}
