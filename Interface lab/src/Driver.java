import java.util.Iterator;

public class Driver {
	public static void main(String[] args) {
		Elma[] elmalar =new Elma[10];
		elmalar[0]=new Elma(10,"sarı");
		elmalar[1]=new Elma(20,"yesil");
		elmalar[2]=new Elma(30,"kırmızı");
		elmalar[3]=new Elma(10,"sarı");
		elmalar[4]=new Elma(65,"yesil");
		elmalar[5]=new Elma(10,"sarı");
		elmalar[6]=new Elma(70,"yesil");
		elmalar[7]=new Elma(10,"sarı");
		elmalar[8]=new Elma(90,"kırmızı");	
		elmalar[9]=new Elma(10,"sarı");
		renkFiltrele("kırmızı", elmalar);
 	}
 public static void renkFiltrele( String renk, Elma[] elmalar) {
	 for (int i = 0; i < elmalar.length; i++) {
		Elma elma= elmalar[i];
		if (elma.getRenk().equals(renk)) {
			System.out.println(elma.getRenk() +""+ elma.getAgirlik());
			
		}
		
		
	}
	 
 }
 public static void filtrele(ElmaFiltresi elmaFiltresi,Elma[] elmalar) {
	 for (int i = 0; i < elmalar.length; i++) {
		 
		 Elma elma =elmalar[i];
		if(elmaFiltresi.filtrele(elma)) {
			
			System.out.println(elma.getAgirlik()""elma.getRenk());
		}
	}
	 
	 
	 
 }
  
 
 public static void agırlıkFiltrele(int agirlik, Elma[] elmalar) {
	 for (int i = 0; i < elmalar.length; i++) {
			Elma elma= elmalar[i];
			if (elma.getAgirlik() >= agirlik) {
				System.out.println(elma.getRenk() +""+ elma.getAgirlik());
				
			}
			
	 
 }
 }
 
 public static void agırlıkFiltrele2(int agirlik, Elma[] elmalar) {
	 for (int i = 0; i < elmalar.length; i++) {
			Elma elma= elmalar[i];
			if (elma.getAgirlik() < agirlik) {
				System.out.println(elma.getRenk() +""+ elma.getAgirlik());
				
			}
			
	 
 }
 }
 
}
