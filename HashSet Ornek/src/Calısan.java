
public class Calısan {
 private String tcNo;
 private String isim;
 
public Calısan() {
	
}
public Calısan(String tcNo,String isim) {
	this.isim=isim;
	this.tcNo=tcNo;
	
}
 
 
 public String getIsim() {
	return isim;
}
 public void setIsim(String isim) {
	this.isim = isim;
}
 public String getTcNo() {
	return tcNo;
}
 public void setTcNo(String tcNo) {
	this.tcNo = tcNo;
}
 
 

 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "TCNO  :"+tcNo+""+" ,  İSİM:" +isim;
	}
 
}
