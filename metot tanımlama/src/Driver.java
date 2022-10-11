
public class Driver {
	
	
	public void merhaba() {
		
		System.out.println("merhaba");
	}
	
	public   static class Hesapmakinesi {
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
	}

	public static void main(String[] args) {
	
		System.out.println(Hesapmakinesi.topla(4,7));
	}

}
