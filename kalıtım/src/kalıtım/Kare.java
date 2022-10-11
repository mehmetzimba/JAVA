package kalıtım;

public class Kare extends Sekil {
	//Sekil ata sınıfından türemiş oldu extends yaparak içerindeki metotlar otomatik algılanacak
//kalıtım ile tekrar tekrar kod yazımının önüne geçilmiş oluır
	//extends türemeyi belirtir
	private int kenarUzunluğu;
	public int getKenarUzunluğu() {
		return kenarUzunluğu;
	}
	public void setKenarUzunluğu(int kenarUzunluğu) {
		this.kenarUzunluğu = kenarUzunluğu;
	}
	
	
	public void alanHesapla() {
		System.out.println("alan"  + kenarUzunluğu*kenarUzunluğu);
	}
}
