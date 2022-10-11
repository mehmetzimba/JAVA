import java.io.Serializable;

public class Koltuk  implements Serializable{
private int numara;
private Bilet bilet;

public Koltuk() {
	
}


public Koltuk(int numara,Bilet bilet) {
	this.bilet=bilet;
	this.numara=numara;	
}

public Bilet getBilet() {
	return bilet;
}
public void setBilet(Bilet bilet) {
	this.bilet = bilet;
}
public int getNumara() {
	return numara;
}
public void setNumara(int numara) {
	this.numara = numara;
}


@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "numara : "+  numara+  " bilet  :"+bilet.toString()  ;
	}

@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return numara + bilet.getNumara() ;
	}
public boolean equals(Object o) {
	
	Koltuk koltuk = (Koltuk)o; 
	return this.numara ==koltuk.numara && this.bilet.equals(koltuk.bilet);
}
}
