package kalıtım;

public class Driver {
	public static void main(String[] args) {
		Sekil sekil= new Sekil();
		Kare kare=new Kare();
		kare.setPosX(10);
		kare.setRenk("sarı");
		kare.setPosY(4);
		kare.setKenarUzunluğu(7);
		System.out.println(kare.getKenarUzunluğu());
		Dikdortgen dikdortgen =new Dikdortgen();
		dikdortgen.setRenk("mavi");
		System.out.println(dikdortgen.getRenk());
		Daire daire =new Daire();
		daire.setYariCap(6);
		System.out.println(daire.getYariCap());
		kare.alanHesapla();
		daire.alanHesapla();
		dikdortgen.alanHesapla();
		
		
		
	}

}
