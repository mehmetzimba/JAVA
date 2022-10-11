
public class Ogrenci implements Comparable<Ogrenci> {
 private int numara;
 private String isim;
 public Ogrenci() {
	 
	 
 }
public Ogrenci(int numara,String isim) {
	this.isim=isim;
	this.numara=numara;
}
 
 
 public String getIsim() {
	return isim;
}
 public void setIsim(String isim) {
	this.isim = isim;
}
 public int getNumara() {
	return numara;
}
 public void setNumara(int numara) {
	this.numara = numara;
}
 @Override
 public String toString() {
	 
	 return "numara  :"+numara+"  "+"isim   :"+isim;
 }
/*@Override
public int compareTo(Ogrenci o) {
	// TODO Auto-generated method stub
	return o.numara-this.numara;
} */
 
 @Override
 public int compareTo(Ogrenci o) {
		// TODO Auto-generated method stub
		return this.isim.compareTo(o.isim);
 }
}
