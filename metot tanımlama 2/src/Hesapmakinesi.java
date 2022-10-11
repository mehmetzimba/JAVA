
public class Hesapmakinesi {
	public float topla(float a, float b) {
		
		float toplam =a + b;
		return toplam;
		
		
	}
public float cıkar(float a, float b) {
		
		float cıkar =a - b;
		return cıkar;
		
		
	}
public float carp(float a, float b) {
	
	float carp=a * b;
	return carp;
	
	
}
public float bol(float a, float b) {
	
	float bol =a / b;
	return bol;
	
	
}
public float kare(int a) {
	return (float)Math.pow(a, 2); // float cast ettik çünkü pow double döndürdüğü içün
	
}

	public static void main(String[] args) {
		Hesapmakinesi hesapmakinesi =new Hesapmakinesi();
		 float toplama= hesapmakinesi.topla(6, 9);
		 System.out.println(toplama);
		
	}

}
