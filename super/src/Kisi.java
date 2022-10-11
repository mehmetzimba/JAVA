
public class Kisi {
	private String isim;
	
	public Kisi(String i) {
		
		isim=i;
	}
    public String getIsim() {
		return isim;
	}
    public void setIsim(String isim) {
		this.isim = isim;
	}
    public void bilgileriYazdır() {
    	
    	System.out.println("kişi"+isim);
    }
    
}
