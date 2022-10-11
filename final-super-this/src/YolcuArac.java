
public class YolcuArac extends Arac {
    private int kapasite;
	public YolcuArac(String plaka, String marka,int kapasite) {
		super(plaka, marka);
		this.kapasite=kapasite;
	}
	
  public int getKapasite() {
	return kapasite;
}
  public void setKapasite(int kapasite) {
	this.kapasite = kapasite;
}
  public void yazdır() {
	  super.yazdır();
		System.out.println("kapasite:  "+kapasite);
		
		
	}
  
}
