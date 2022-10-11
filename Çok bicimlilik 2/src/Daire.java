
public class Daire {
	private int yaricap;
	public Daire(int y) {
      yaricap = y;
}
	public void setYaricap(int yaricap) {
		this.yaricap = yaricap;
	}
	public int getYaricap() {
		return yaricap;
	}
public void alan() {
	System.out.println("daire alanı :" + (Math.PI)*Math.pow(yaricap, 2));
}
}
