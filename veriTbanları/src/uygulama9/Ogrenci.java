package uygulama9;

public class Ogrenci {
	private int  ogrenciId;
	private String adi;
	private String soyadi;
	private String dogumYılı;
	private int okulNumarası;
	
	
	public Ogrenci(int ogrenciId, String adi, String soyadi, String dogumYılı, int okulNumarası) {
		super();
		this.ogrenciId = ogrenciId;
		this.adi = adi;
		this.soyadi = soyadi;
		this.dogumYılı = dogumYılı;
		this.okulNumarası = okulNumarası;
	}
	public Ogrenci() {
		
	}
	public int getOgrenciId() {
		return ogrenciId;
	}
	public void setOgrenciId(int ogrenciId) {
		this.ogrenciId = ogrenciId;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getDogumYılı() {
		return dogumYılı;
	}
	public void setDogumYılı(String dogumYılı) {
		this.dogumYılı = dogumYılı;
	}
	public int getOkulNumarası() {
		return okulNumarası;
	}
	public void setOkulNumarası(int okulNumarası) {
		this.okulNumarası = okulNumarası;
	}
	@Override
	public String toString() {
		return "Ogrenci [ogrenciId=" + ogrenciId + ", adi=" + adi + ", soyadi=" + soyadi + ", dogumYılı=" + dogumYılı
				+ ", okulNumarası=" + okulNumarası + "]";
	}

	
	
	
	
	
	
}
