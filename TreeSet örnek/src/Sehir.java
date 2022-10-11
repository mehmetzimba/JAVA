
public class Sehir implements Comparable<Sehir>{
 private String plakaKodu;
 private String isim;
  public Sehir(){
	   
  }
  public Sehir(String plakaKodu,  String isim ) {
	  this.isim=isim;
	  this.plakaKodu=plakaKodu;
	  
  }
  public String getIsim() {
	return isim;
}
  public void setIsim(String isim) {
	this.isim = isim;
}
  public String getPlakaKodu() {
	return plakaKodu;
}
  public void setPlakaKodu(String plakaKodu) {
	this.plakaKodu = plakaKodu;
}

  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PLAKA KODU  :"+plakaKodu+", isim   :"+isim;
	}
@Override
public int compareTo(Sehir o) {
	// TODO Auto-generated method stub
	return this.plakaKodu.compareTo(o.plakaKodu);
}
  
}
