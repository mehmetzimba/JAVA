import java.io.Serializable;

public class Ogrenci implements Serializable{
	private int no;
private String isim;
private int yas;

  public Ogrenci() {
	  
	  
  }
	public Ogrenci( int no,String isim, int yas ) {
		
		this.isim=isim;
		this.no=no;
		this.yas=yas;
		
	}
	public String getIsim() {
		return isim;
	}
	public int getNo() {
		return no;
	}
	public int getYas() {
		return yas;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}

	
	@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return no;
		}
	@Override
		public boolean equals(Object obj) {
			Ogrenci ogrenci= (Ogrenci)obj;
			return ogrenci.no==this.no;
		}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return no+"--"+isim+"--"+yas;
		}	
	
}
