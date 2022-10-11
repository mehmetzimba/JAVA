import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("1. sayi:");
	float sayi1 =Float.parseFloat( scanner.nextLine());
	System.out.println("2. sayi:");
	float sayi2 =Float.parseFloat( scanner.nextLine());
	System.out.println("islem");
	char islem = scanner.nextLine().charAt(0);
	switch (islem) {
	case "+":
		System.out.println("sonuc"+(sayi1+sayi2));
			
		
		break;
	case "-":
		System.out.println("sonuc"+(sayi1-sayi2));
			
		
		break;
	case "*":
		System.out.println("sonuc"+(sayi1*sayi2));
			
		
		break;
	case "/":
		System.out.println("sonuc"+(sayi1/sayi2));
			
		
		break;

	default:
		System.out.println("geçersiz operatör girdiniz");
		break;
	}
}
}
