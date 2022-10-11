import java.util.Date;

public class Calısan {

	private String isim;
	private double maas;
	private Date iseGirisTarihi;
	public void setİsim(String s) {
	isim=s;
    }
	public String getİsim() {
	return isim;
	}
	public void setMaas(double m) {
		maas=m;
		
	}
	public double getMaas() {
		
		return maas;
	}
	public void setİsegiristarihi(Date i) {
		iseGirisTarihi =i;
		
	}
	public Date getİsegiristarihi() {
		return iseGirisTarihi;
	}
	
}