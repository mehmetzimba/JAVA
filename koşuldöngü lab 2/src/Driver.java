import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int sifre =444;
		while(true) {
			System.out.println("sifre giriniz");
			int x = scanner.nextInt();
			if(sifre==x) {
				System.out.println("sifre dogru");
				
			}else {
				System.out.println("sifre dogru değil yeniden deneyin");
			}
		}
	}

}
