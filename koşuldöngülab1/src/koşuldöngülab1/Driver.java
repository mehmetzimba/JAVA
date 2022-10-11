package koşuldöngülab1;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int toplam = 0;
		while(true) {
		System.out.println("sayı giriniz");
		int x =scanner.nextInt();
		 toplam =toplam +x;
		System.out.println("toplam  :"+  toplam);
		if(x==0) {
			break;
			
		
		}
	}

}
}