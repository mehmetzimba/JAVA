
public class Kedi extends Hayvan {
	private String cins;
	public Kedi(int ayakSayisi,String cins) {
		super(ayakSayisi);
		this.cins=cins;
	}
public String getCins() {
	return cins;
}
public void setCins(String cins) {
	this.cins = cins;
}
@Override
public void adinisöyle() {
	
	System.out.println("ben bir kedi nesnesiyim");
}

}
