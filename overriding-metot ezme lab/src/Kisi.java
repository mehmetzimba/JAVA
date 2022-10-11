
public class Kisi {
private String tcNo;
private String isim;

public Kisi() {
	
}
public Kisi(String tcNo) {
	this.tcNo=tcNo;

}
public Kisi(String tcNo,String isim) {
	this.tcNo=tcNo;
	this.isim=isim;
}

public String getİsim() {
	return isim;
}
public String getTcNo() {
	return tcNo;
}
public void setİsim(String isim) {
	this.isim = isim;
}
public void setTcNo(String tcNo) {
	this.tcNo = tcNo;
}

@Override             // tosTRİNGİ OVERRİDE ETTİK
public String toString() {
	return "tc no : "+tcNo+""+",isim   :"+isim;
	
}


}
