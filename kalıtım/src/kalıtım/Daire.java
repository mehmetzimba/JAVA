package kalıtım;

public class Daire extends Sekil{
	private int yariCap;
	 public int getYariCap() {
		return yariCap;
	}
	 public void setYariCap(int yariCap) {
		this.yariCap = yariCap;
	}
	 
	 
		
		public void alanHesapla() {
			System.out.println("alan"  + Math.PI*yariCap*yariCap);
		}

}
