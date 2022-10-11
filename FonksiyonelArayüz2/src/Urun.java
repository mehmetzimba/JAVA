import java.io.Serializable;

public class Urun implements Serializable {

	private int id;
	private String adi;
	double fiyat;
	
	
	public Urun() {
		
	}
	public Urun(int id,String adi,double fiyat) {
		this.adi=adi;
		this.fiyat=fiyat;
		this.id=id;
	}
	
	
	
	
	
	public String getAdi() {
		return adi;
	}
	public double getFiyat() {
		return fiyat;
	}
	public int getId() {
		return id;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	 @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		 Urun urun =(Urun)obj;
		return this.id==urun.id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"  "+adi+"  "+fiyat;
	}
	
	
}
