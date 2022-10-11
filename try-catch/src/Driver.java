import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	
	try { // hata olsada olmasa da işleniiyor

	System.out.print("birinci sayıyı giriniz");
		int x= scanner.nextInt();
		System.out.print("ikinci sayıyı giriniz");
		int y=scanner.nextInt();
		int sonuc =x/y;
		System.out.println("sonuc:   "+sonuc);
	} catch (ArithmeticException e) { // bu tür hata varsa 
		System.out.println("sayı 0  a bölünemez");
	}catch (InputMismatchException e) { // başka tür hata varsa
		System.out.println("bir hata ile karşılaşıldı.sayı giriiniz");
	}finally {
		scanner.close(); // sistemden aldığımız scanner ı geri iade ettik
	}
	System.out.println("uygulama kapandı");
	
}
}
