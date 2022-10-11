
public class Kamyon extends  YukTasima{
	private int konteynirsayisi;
   public Kamyon(String plaka, String marka, int yükkapasitesi,int konteynirsayisi) {
		super(plaka, marka, yükkapasitesi);
		this.konteynirsayisi=konteynirsayisi;
	}

	public int getKonteynirsayisi() {
		return konteynirsayisi;
	}
	public void setKonteynirsayisi(int konteynirsayisi) {
		this.konteynirsayisi = konteynirsayisi;
	}
	
	public void yazdır() {
		super.yazdır();
		System.out.println("konteynır sayısı    :"+konteynirsayisi);
		
	}

	
}
