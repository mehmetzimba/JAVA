

public class Araba {
	
	private String marka;
	private String model ;
	private String plaka;
	public Araba() {
		
	}
	public Araba(String marka,String model,String plaka) {
		
		this.marka =marka;
		this.model=model;
		this.plaka=plaka;
		
	}

	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "marka  :"+ marka+", model  "+ model +", plaka "+plaka;
	}
	
	
}
