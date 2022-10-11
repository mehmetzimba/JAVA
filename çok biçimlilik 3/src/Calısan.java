
public class Calısan {
 private String isim;
 private String gorev;
 private int maas;
 public Calısan(String i ,String g ,int m) {
	isim=i;
    gorev=g;
    maas=m ;
	 }
 public String getGorev() {
	return gorev;
}
 public void setGorev(String gorev) {
	this.gorev = gorev;
}
 public void setIsim(String isim) {
	this.isim = isim;
}
 public String getIsim() {
	return isim;
}
 public void setMaas(int maas) {
	this.maas = maas;
}
 public int getMaas() {
	return maas;
}
 
 public void ozet() {
	 
	System.out.println("isim"+isim);
	System.out.println("gorev"+gorev);
	System.out.println("maas"+maas);
 }
}
