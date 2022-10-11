package overloading;

public class HesapMakinesi {

	public int topla(int x,int y) {
		return x+y;
		
	}
	
public float topla(float x,float y) {
		return x+y;
		
	}
	// metodun isimleri aynı olmasına rağmen parametreleri farklı
	
	public float topla(int x,float y) {
		return x+y;
		
	}
	public float topla(float x,int y) {
		return x+y;
		
	}

}

