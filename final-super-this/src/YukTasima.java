
public class YukTasima extends Arac{
    private int yükkapasitesi;
	public YukTasima(String plaka, String marka,int yükkapasitesi) {
		super(plaka, marka);
		this.yükkapasitesi=yükkapasitesi;
	}
	public void setYükkapasitesi(int yükkapasitesi) {
		this.yükkapasitesi = yükkapasitesi;
	}
	public int getYükkapasitesi() {
		return yükkapasitesi;
	}
	public void yazdır() {
		super.yazdır();
		System.out.println("yuk kapasitesi"+yükkapasitesi);
		
		
	}

	
	
}
