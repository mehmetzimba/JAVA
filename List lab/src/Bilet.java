import java.io.Serializable;
import java.util.Date;

public class Bilet implements Serializable{
private int numara;
private Date tarih;
private  float fiyat;

public Bilet() {
	
}
public Bilet(int numara,Date tarih,float fiyat) {
	
	this.fiyat=fiyat;
	this.numara=numara;
	this.tarih=tarih;
}

public float getFiyat() {
	return fiyat;
}
public int getNumara() {
	return numara;
}
public Date getTarih() {
	return tarih;
}
public void setFiyat(float fiyat) {
	this.fiyat = fiyat;
}
public void setNumara(int numara) {
	this.numara = numara;
}
public void setTarih(Date tarih) {
	this.tarih = tarih;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "numara :"+numara+" , tarih : "+tarih+ "fiyat"+fiyat;
	}
@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return numara;
	}

@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
	    Bilet bilet =(Bilet)o;
		return bilet.numara == this.numara;
	}

}
