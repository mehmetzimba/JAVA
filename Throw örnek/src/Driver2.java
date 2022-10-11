
public class Driver2 {
	public static void main(String[] args) {
		int a=10;
	    int b=0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // e.getMessage() alınan hata mesajı 
			throw e;  // aldığımız hatayı tekrardan fırlattık jvm e kadar gitti dolasıyla 12 satıra uygulama uşamadan hata verdi
		}finally {
		System.out.println("program bu satıra ulaştı");
		
		}
		
	}
}
