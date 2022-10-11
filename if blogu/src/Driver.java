import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		System.out.println("değer giriniz");
		Scanner scanner=new Scanner(System.in);
		int number =scanner.nextInt();
		
		/*if(number>0) {
			System.out.println("girilen sayı pozitif");
		}else {
			System.out.println("girilen sayı negatif");
		}*/
		if (number%2 ==0) {
			System.out.println("girilen sayı çift");
		}else {
			System.out.println("girilen sayı tektir");
		}
	}

}
