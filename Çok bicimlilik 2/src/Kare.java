
public class Kare extends Sekil{
	private int kenarUzunluğu;
	public void setKenarUzunluğu(int kenarUzunluğu) {
		this.kenarUzunluğu = kenarUzunluğu;
	}
	public int getKenarUzunluğu() {
		return kenarUzunluğu;
	}
	
	public void alan() {
		System.out.println("kare alanı" +Math.pow(kenarUzunluğu,2));
		
	}

		
		
}
