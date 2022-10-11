
public class Memur extends Calısan {
	private String birim;
	public Memur(String i,String g,int m) {
		super(i,g,m);
		
	}
   public String getBirim() {
	return birim;
}
   public void setBirim(String birim) {
	this.birim = birim;
}
   public void ozet() {
	   System.out.println("memur ismi   ;"+getIsim());
	   System.out.println("memur gorev   ;"+ getGorev());
	   System.out.println("memur maas   ;"+getMaas() );
	   System.out.println("memur birim   ;"+ birim);
   }
   
}
