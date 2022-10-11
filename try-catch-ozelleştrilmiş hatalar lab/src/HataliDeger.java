
public class HataliDeger extends RuntimeException{ //Amacımız try-catch yazmadan hatayı fırlatmak
     
	public HataliDeger(String degiskenadı,Object deger) {
		super(degiskenadı + ""+deger+"olamaz");
		
	}
	
	
}
