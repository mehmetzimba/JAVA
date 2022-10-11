import java.io.Serializable;

public class Bisiklet implements Serializable{
  private String marka;
  private int vitesSayisi;
  
  
  public Bisiklet() {
	  
  }
  public Bisiklet(String marka) {
	  this.marka=marka;
	  
  }
  public Bisiklet (String marka,int vitesSayisi) {
  
  this.marka=marka;
  this.vitesSayisi=vitesSayisi;
  }
  
  public String getMarka() {
	return marka;
}
  public void setMarka(String marka) {
	this.marka = marka;
}
  public int getVitesSayisi() {
	return vitesSayisi;
}
  public void setVitesSayisi(int vitesSayisi) {
	this.vitesSayisi = vitesSayisi;
}
  
  
  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return marka+"  "+vitesSayisi;
	}
  
  
  @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return marka.hashCode()+vitesSayisi;
	}
  
  @Override
	public boolean equals(Object obj) {
		Bisiklet bisiklet =(Bisiklet)obj;
		return marka.equals(bisiklet.marka)&& this.vitesSayisi== bisiklet.vitesSayisi;
	}
  
}
