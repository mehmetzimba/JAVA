
public class Isci {
private String isim;
private double maas;
public String getIsim() {
	return isim;
}
public void setIsim(String isim) {
	if(isim ==null || isim.trim().length()==0) {
		throw new HataliDeger("isim", isim);
		
		
	}
	this.isim = isim;
}
public double getMaas() {
	return maas;
}
public void setMaas(double maas) {
	if(maas<0) {
		
		throw new HataliDeger("maas", maas);
	}
	this.maas = maas;
}
@Override
public String toString() {
	return "isim  :"+isim+",   maas  :"+maas;
	
}
}
