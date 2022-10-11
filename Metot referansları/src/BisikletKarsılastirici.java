import java.util.Comparator;

public class BisikletKarsılastirici implements Comparator<Bisiklet> {
	
	@Override
	public int compare(Bisiklet o1, Bisiklet o2) {
		// TODO Auto-generated method stub
		return o1.getVitesSayisi()-o2.getVitesSayisi();
	}
	

}
