
public class Kopek extends Hayvan{
    private String tür;
	public Kopek(int ayakSayisi,String tür) {
		super(ayakSayisi);
		this.tür=tür;
	}
 public String getTür() {
	return tür;
}
 public void setTür(String tür) {
	this.tür = tür;
}
	@Override
	public void adinisöyle() {
		
		System.out.println("ben bir köpek nesnesiyim");
	}
	
	
	
}
