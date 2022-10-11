
public class Ogrenci extends Kisi{
	private int numara;
	
	public Ogrenci(String i,int m) {
		super(i);  //  super ile Ogrenci Kisinin yapıcı metodunu çağırdı
		numara=m;
	}
public int getNumara() {
	return numara;
}
public void setNumara(int numara) {
	this.numara = numara;
}
public void ozet() {
System.out.println("ogrenci numara"+numara);
super.bilgileriYazdır();
}

}
